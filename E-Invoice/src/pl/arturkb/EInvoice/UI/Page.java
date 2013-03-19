/**
 * 
 */
package pl.arturkb.EInvoice.UI;

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
 * TODO comments
 */
public class Page implements HTML5 {
	
	/**
	 * String that contains the address for the layout of the page.
	 */
	private String layout;
	
	/**
	 * Head tag for the page
	 */
	private Head head;
	
	/**
	 * Body tag for the page
	 */
	private Body body;
	

	/**
	 * @return the layout
	 */
	public String getLayout() {
		return layout;
	}


	/**
	 * @param layout the layout to set
	 */
	public void setLayout(String layout) {
		this.layout = layout;
	}


	/**
	 * @return the head
	 */
	public Head getHead() {
		return head;
	}


	/**
	 * @param head the head to set
	 */
	public void setHead(Head head) {
		this.head = head;
	}


	/**
	 * @return the body
	 */
	public Body getBody() {
		return body;
	}


	/**
	 * @param body the body to set
	 */
	public void setBody(Body body) {
		this.body = body;
	}

}
