/**
 * 
 */
package pl.arturkb.EInvoice.Beans.Alert;

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
public class ErrorAlert extends Alert {

	private String msg;

	/*
	 * (non-Javadoc)
	 * 
	 * @see pl.arturkb.EInvoice.Beans.Alert.Alert#getTag()
	 */
	@Override
	public String getTag() {
		sb.append("<div class=\"alert alert-erro\"> \n");
		sb.append(msg + "\n");
		sb.append("</div> \n");
		return sb.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pl.arturkb.EInvoice.Beans.Alert.Alert#setMsg(java.lang.String)
	 */
	@Override
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
