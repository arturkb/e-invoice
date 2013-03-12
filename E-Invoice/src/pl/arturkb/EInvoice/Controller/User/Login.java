package pl.arturkb.EInvoice.Controller.User;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import pl.arturkb.EInvoice.Beans.*;
import pl.arturkb.EInvoice.Beans.Alert.Alert;
import pl.arturkb.EInvoice.Beans.Alert.ErrorAlert;
import pl.arturkb.EInvoice.Beans.Alert.InfoAlert;
import pl.arturkb.EInvoice.Beans.Model.User;
import pl.arturkb.EInvoice.Utils.HibernateUtil;
import pl.arturkb.EInvoice.Utils.ServletsUtils;

/**
 * Copyright 2013 Artur Barczysnki http://www.arturkb.pl
 * 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 * 
 * Servlet implementation class Login
 * 
 */
public class Login extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(Login.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		logger.debug("GET request for LOGIN");
		View view = new View();

		HashMap<String, String> lang = ServletsUtils.getLang(request);
		String template = "/WEB-INF/Template/loginWindow.jsp";

		// Alert-info
		Alert alert = new InfoAlert();
		
		//Debugging info 
		if(lang.size()==0) {
			logger.error("Missing language hashMap, somthing went wrong!");
		}else {
			logger.debug("Language hashMap ok size =" + lang.size());
		}

		alert.setMsg(lang.get("Please_login_with_your_Username_and_Password."));

		view.setViewAdress("/WEB-INF/User/loginView.jsp");
		view.setTitle(lang.get("login"));

		RequestDispatcher dispatcher = request.getRequestDispatcher(template);
		request.setAttribute("view", view);
		request.setAttribute("alert", alert);
		dispatcher.forward(request, response);

	}

	private void renderPage(HttpServletRequest request,
			HttpServletResponse response, User user) throws ServletException,
			IOException {
		View view = new View();

		HashMap<String, String> lang = ServletsUtils.getLang(request);
		String template = "/WEB-INF/Template/loginWindow.jsp";

		// Alert-info
		Alert alert = new ErrorAlert();
		alert.setMsg("<strong>"
				+ lang.get("Your_Login_Was_Unsuccessful_-_Please_Try_Again")
				+ "</strong>\n");

		view.setViewAdress("/WEB-INF/User/loginView.jsp");
		view.setTitle(lang.get("login"));

		RequestDispatcher dispatcher = request.getRequestDispatcher(template);
		request.setAttribute("view", view);
		request.setAttribute("alert", alert);
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			// Begin unit of work
			HibernateUtil.getSessionFactory().getCurrentSession()
					.beginTransaction();
			// Process request and render page...

			// Prepare request
			String username = ServletsUtils.replaceNullWithEmptyString(request
					.getParameter("username"));
			String password = ServletsUtils.replaceNullWithEmptyString(request
					.getParameter("password"));

			// Getting user
			User user = (User) HibernateUtil.getSessionFactory()
					.getCurrentSession().get(User.class, username);
			if (user == null) {
				renderPage(request, response, new User());
				// End unit of work
			} else if (!user.getPassword().equals(password)) {
				renderPage(request, response, user);
			} else if (user.getPassword().equals(password)) {
				HttpSession session = request.getSession(true);	
				user.setAuth(true);
				session.setAttribute("user", user);
				response.sendRedirect("/E-Invoice/dashboard/index.sec");
			}
			HibernateUtil.getSessionFactory().getCurrentSession()
					.getTransaction().commit();

		} catch (Exception ex) {
			// HibernateUtil.getSessionFactory().getCurrentSession()
			// .getTransaction().rollback();
			if (ServletException.class.isInstance(ex)) {
				throw (ServletException) ex;
			} else {
				throw new ServletException(ex);
			}
		}
	}
	
}


