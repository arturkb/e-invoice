package pl.arturkb.EInvoice.Controller.User;

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
		sb.append("<a href=\"/E-Invoice/dashboard/index.sec\">Home</a><span class=\"divider\">/</span>\n");
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
		view.setTitle(lang.get("index"));
		view.setBreadcrumb(prepareBreadcrumb(lang));

		RequestDispatcher dispatcher = request.getRequestDispatcher(template);
		request.setAttribute("view", view);
		if (check) {
			request = ServletsUtils.checkEmail(request);
		}
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
