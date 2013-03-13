/**
 * 
 */
package pl.arturkb.EInvoice.Utils;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import pl.arturkb.EInvoice.Beans.*;

/**
 * 
 * TODO comments
 * 
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
 */
public class ServletsUtils {
	private static Logger logger = Logger
			.getLogger(ServletsUtils.class);

	static private HttpServletRequest prepareCheckEmail(
			HttpServletRequest request, String cssClass, String valMsg) {
		StringBuilder sb = new StringBuilder();
		View view = (View) request.getAttribute("view");

		view.getCssClasses().put("email", cssClass);
		sb.append("<span class=\"help-inline\">");
		sb.append(ServletsUtils.getLangMsg(request).get(valMsg));
		sb.append("</span>\n");
		view.getValMsg().put("email", sb.toString());
		request.setAttribute("view", view);
		return request;
	}

	/**
	 * Validate e-mail First we check that email is not null
	 * 
	 * @param request
	 * @return
	 */
	static public HttpServletRequest checkEmail(HttpServletRequest request) {
		if (request.getParameter("email") == null) {
			request = prepareCheckEmail(request, "error",
					"checkMaill,Please_fill_out_this_field");
			request.setAttribute("checkEmail", "false");
			return request;
		}
		if (request.getParameter("email").equals("")) {
			request = prepareCheckEmail(request, "error",
					"checkMaill,Please_fill_out_this_field");
			request.setAttribute("checkEmail", "false");
			return request;
		}
		request.setAttribute("checkEmail", true);
		return request;
	}

	static public String replaceNullWithEmptyString(String str) {
		if (str == null) {
			return new String("");
		} else {
			return str;
		}

	}

	/**
	 * Gets language object from the session and return the hash map with translation
	 * @param request
	 * @return HashMap with translation
	 */
	static public HashMap<String, String> getLangMsg(HttpServletRequest request) {
		HttpSession session = request.getSession(true);
		if (session.getAttribute("lang") != null) {
			return ((HashMap<String, String>) session.getAttribute("lang"));
		} else {
			logger.error("Language object not exists, returning empty HashMap");
		}
		return new HashMap<String, String>();
	}

}
