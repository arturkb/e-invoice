package pl.arturkb.EInvoice.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import pl.arturkb.EInvoice.Internationalization.EnglishLang;
import pl.arturkb.EInvoice.Internationalization.PolishLang;

/**
 * Copyright 2013 Artur Barczysnki http://www.arturkb.pl
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
 * Servlet implementation class ChangeLanguage
 */
public class ChangeLanguage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(ChangeLanguage.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ChangeLanguage() {
		super();
	}

	/**
	 * Change language which is save in the session, change will be made on
	 * parameter lang from request
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		if (request.getParameter("lang") != null) {
			if (request.getParameter("lang").equals("pl")) {
				session.setAttribute("lang", PolishLang.getMsg());
				logger.debug("Changing language to Polish");
			}
			if (request.getParameter("lang").equals("en")) {
				session.setAttribute("lang", EnglishLang.getMsg());
				logger.debug("Changing language to English");
			}
		}
		response.sendRedirect("/E-Invoice/user/login.do");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
