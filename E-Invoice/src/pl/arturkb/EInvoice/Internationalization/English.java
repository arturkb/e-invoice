/**
 * 
 */
package pl.arturkb.EInvoice.Internationalization;

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
public class English extends Language {

	public English() {
		super();
	}

	public English init() {
		userLoginControllerMsg();
		languages();
		navBar();
		userEdit();
		checkMail();
		return this;
	}

	private void navBar() {
		msg.put("Bookkeeping", "Bookkeeping");
		msg.put("Sale", "Sale");
		msg.put("Purchases", "Purchases");
		msg.put("Reports", "Reports");
		msg.put("Registration", "Registration");
		msg.put("Change_Theme", "Change Theme");
		msg.put("E-Invoice", "E-Invoice");
		msg.put("Profile", "Profile");
		msg.put("Logout", "Logout");
	}

	private void languages() {
		msg.put("polish", "Polish");
		msg.put("english", "English");
	}

	private void checkMail() {
		msg.put("checkMail.Please_correct_the_error", "Please correct the error");
		msg.put("checkMaill,Please_fill_out_this_field", "Please fill out this field");
	}

	private void userEdit() {
		msg.put("UserEdit.Title", "Edit profile");
		msg.put("UserEdit.Username", "Username:");
		msg.put("UserEdit.Password", "Password:");
		msg.put("UserEdit.Email", "Your email address:");
		msg.put("UserEdit.Mobile", "Your mobile number:");
		msg.put("UserEdit.PasswordRepeat", "Repeat password:");
		msg.put("UserEdit.Save_changes", "Save changes");
		msg.put("UserEdit.Cancle", "Cancle");
	}

	private void userLoginControllerMsg() {
		msg.put("login", "Login");
		msg.put("logout", "Logout");
		msg.put("Welcome_to_E-Invoice", "Welcome to E-Invoice");
		msg.put("Please_login_with_your_Username_and_Password.",
				"Please login with your Username and Password.");
		msg.put("Your_Login_Was_Unsuccessful_-_Please_Try_Again",
				"Your Login Was Unsuccessful - Please Try Again");
		msg.put("Remember_me", "Remember me");
		msg.put("Username", "\"Username\"");
		msg.put("Password", "\"Password\"");
		msg.put("change", "Change");
	}

}
