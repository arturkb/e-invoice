package pl.arturkb.EInvoice.Controller.User;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pl.arturkb.EInvoice.Beans.View;
import pl.arturkb.EInvoice.UI.Body;
import pl.arturkb.EInvoice.UI.Breadcrumb;
import pl.arturkb.EInvoice.UI.BreadcrumbItem;
import pl.arturkb.EInvoice.UI.DashboardContent;
import pl.arturkb.EInvoice.UI.Head;
import pl.arturkb.EInvoice.UI.Page;
import pl.arturkb.EInvoice.Utils.ServletsUtils;

/**
 * Servlet implementation class Edit
 */
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Edit() {
		super();
	}
	
	private String prepareBreadcrumb(HashMap<String, String> lang) {
		StringBuilder sb = new StringBuilder();
		sb.append("<li>\n");
		sb.append("<a href=\"/E-Invoice/dashboard/index.sec\">");
		sb.append(lang.get("Dashboard.Dashboard"));
		sb.append("</a><span class=\"divider\">/</span>\n");
		sb.append("</li>\n");
		sb.append("<li>\n");
		sb.append("<a href=\"/E-Invoice/user/edit.sec\">");
		sb.append(lang.get("Profile"));
		sb.append("</a>\n");
		sb.append("</li>\n");
		return sb.toString();
	}

	private void renderPage(HttpServletRequest request,
			HttpServletResponse response, boolean check)
			throws ServletException, IOException {
		View view = new View();

		HashMap<String, String> lang = ServletsUtils.getLangMsg(request);
		String template = "/WEB-INF/Template/mainWindow.jsp";

		view.setViewAdress("/WEB-INF/User/editView.jsp");
		view.setTitle(lang.get("UserEdit.Title"));
		view.setBreadcrumb(prepareBreadcrumb(lang));

		RequestDispatcher dispatcher = request.getRequestDispatcher(template);
		request.setAttribute("view", view);
		if (check) {
			request = ServletsUtils.checkEmail(request);
		}
		dispatcher.forward(request, response);
	}
	
	/**
	 * Make a HTML5 page
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void makePage(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		//Getting the language 
		HashMap<String, String> lang = ServletsUtils.getLangMsg(request);
		
		//Page layout
		Page page = new Page();
		page.setLayout("/WEB-INF/Template/mainWindow.jsp");
		
		//Head tag for the page
		Head head = new Head();
		head.setTitle(lang.get("Dashboard.Dashboard"));
		page.setHead(head);
		
		//Body tag for the page
		Body body = new Body();
		
		//Preparing breadcrumb
		Breadcrumb breadcrumb = new Breadcrumb();
		BreadcrumbItem breadcrumbItem = new BreadcrumbItem();
		breadcrumbItem.setAddress("/E-Invoice/dashboard/index.sec");
		breadcrumbItem.setTitle(lang.get("Dashboard.Dashboard"));
		breadcrumb.getElements().add(breadcrumbItem);
		body.setBreadcrumb(breadcrumb);
		
		//Content preparing
		DashboardContent content = new DashboardContent();
		content.setLocation("/WEB-INF/Dashboard/indexView.jsp");
		body.setContent(content);
		page.setBody(body);
		
		//Dispatcher
		RequestDispatcher dispatcher = request.getRequestDispatcher(page.getLayout());
		request.setAttribute("page", page);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		renderPage(request, response, false);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		renderPage(request, response, true);
	}

}
