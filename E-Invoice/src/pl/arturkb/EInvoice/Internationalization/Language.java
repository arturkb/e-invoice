/**
 * 
 */
package pl.arturkb.EInvoice.Internationalization;

import java.util.HashMap;

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
public abstract class Language {
	
	protected HashMap<String, String> msg;
	
	public Language() {
		msg = new HashMap<String, String>();
	}
	
	/**
	 * @return the msg
	 */
	public HashMap<String, String> getMsg() {
		return msg;
	}

	/**
	 * @param msg the msg to set
	 */
	public void setMsg(HashMap<String, String> msg) {
		this.msg = msg;
	}

	public abstract Language init();
}
