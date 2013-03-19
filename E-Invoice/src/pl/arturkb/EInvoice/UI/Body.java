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
 */
package pl.arturkb.EInvoice.UI;

/**
 * @author Artur Barczynski
 * Body tag for the page
 */
public class Body {
	
	/**
	 * Top navigation bar for the app
	 */
	private NavigationBar navBarTop;
	
	/**
	 * Breadcrumb for page;
	 */
	private Breadcrumb breadcrumb;
	
	/**
	 * Content of the body
	 */
	private Content content;

	/**
	 * @return the navBarTop
	 */
	public NavigationBar getNavBarTop() {
		return navBarTop;
	}

	/**
	 * @param navBarTop the navBarTop to set
	 */
	public void setNavBarTop(NavigationBar navBarTop) {
		this.navBarTop = navBarTop;
	}

	/**
	 * @return the breadcrumb
	 */
	public Breadcrumb getBreadcrumb() {
		return breadcrumb;
	}

	/**
	 * @param breadcrumb the breadcrumb to set
	 */
	public void setBreadcrumb(Breadcrumb breadcrumb) {
		this.breadcrumb = breadcrumb;
	}

	/**
	 * @return the content
	 */
	public Content getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(Content content) {
		this.content = content;
	}
	
	

}
