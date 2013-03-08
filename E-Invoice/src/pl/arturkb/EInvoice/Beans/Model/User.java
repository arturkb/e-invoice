/**
 * 
 */
package pl.arturkb.EInvoice.Beans.Model;

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
public class User {
	
	private String username;
	private String password;
	private String email;
	private String mobile;
	private boolean isAuth;

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the isAuth
	 */
	public boolean isAuth() {
		return isAuth;
	}
	/**
	 * @param isAuth the isAuth to set
	 */
	public void setAuth(boolean isAuth) {
		this.isAuth = isAuth;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Boolean authUser() {
		if( password.equals("test")) {
			return true;
		}
		return false;
	}
	

}
