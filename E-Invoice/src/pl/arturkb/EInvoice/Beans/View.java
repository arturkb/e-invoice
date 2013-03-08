package pl.arturkb.EInvoice.Beans;

import java.util.HashMap;

/**
 * 
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
 * 
 */
public class View {

	private String viewAdress;
	private String title;
	private String breadcrumb;
	private HashMap<String, String> cssClasses = new HashMap<String, String>();
	private HashMap<String, String> valMsg = new HashMap<String, String>();
	
	/**
	 * @return the cssClasses
	 */
	public HashMap<String, String> getCssClasses() {
		return cssClasses;
	}

	/**
	 * @param cssClasses the cssClasses to set
	 */
	public void setCssClasses(HashMap<String, String> cssClasses) {
		this.cssClasses = cssClasses;
	}

	/**
	 * @return the valMsg
	 */
	public HashMap<String, String> getValMsg() {
		return valMsg;
	}

	/**
	 * @param valMsg the valMsg to set
	 */
	public void setValMsg(HashMap<String, String> valMsg) {
		this.valMsg = valMsg;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the breadcrumb
	 */
	public String getBreadcrumb() {
		return breadcrumb;
	}

	/**
	 * @param breadcrumb the breadcrumb to set
	 */
	public void setBreadcrumb(String breadcrumb) {
		this.breadcrumb = breadcrumb;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the viewAdress
	 */
	public String getViewAdress() {
		return viewAdress;
	}

	/**
	 * @param viewAdress
	 *            the viewAdress to set
	 */
	public void setViewAdress(String viewAdress) {
		this.viewAdress = viewAdress;
	}

}
