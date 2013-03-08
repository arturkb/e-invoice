package pl.arturkb.EInvoice.Controller.Dashboard;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pl.arturkb.EInvoice.Beans.View;
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
 * Servlet implementation class Index
 */
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Index() {
		super();
	}
	
	private String prepareBreadcrumb() {
		StringBuilder sb = new StringBuilder();
		sb.append("<li>\n");
		sb.append("<a href=\"/E-Invoice/dashboard/index.sec\">Home</a>\n");
		sb.append("</li>\n");		
		return sb.toString();
	}
	
	
	private void renderPage(HttpServletRequest request,
			HttpServletResponse response) throws ServletException,
			IOException {
		View view = new View();

		HashMap<String, String> lang = ServletsUtils.getLang(request);
		String template = "/WEB-INF/Template/mainDashboardWindow.jsp";

		view.setViewAdress("/WEB-INF/Dashboard/indexView.jsp");
		view.setTitle(lang.get("index"));
		view.setBreadcrumb( prepareBreadcrumb());

		RequestDispatcher dispatcher = request.getRequestDispatcher(template);
		request.setAttribute("view", view);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {	
		renderPage( request, response);
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
