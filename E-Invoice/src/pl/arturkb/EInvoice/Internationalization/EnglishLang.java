/**
 * 
 */
package pl.arturkb.EInvoice.Internationalization;

import java.util.HashMap;

/**
 * @author artur
 * 
 */
public class EnglishLang {

	private static HashMap<String, String> msg = new HashMap<String, String>();

	public static HashMap<String, String> getMsg() {
		return msg;
	}

	static {
		// Navigation bar part
		msg.put("Bookkeeping", "Bookkeeping");
		msg.put("Sale", "Sale");
		msg.put("Purchases", "Purchases");
		msg.put("Reports", "Reports");
		msg.put("Registration", "Registration");
		msg.put("Change_Theme", "Change Theme");
		msg.put("E-Invoice", "E-Invoice");
		msg.put("Profile", "Profile");
		msg.put("Logout", "Logout");
		
		//Languages
		msg.put("polish", "Polish");
		msg.put("english", "English");
		
		//Check mail
		msg.put("checkMail.Please_correct_the_error", "Please correct the error");
		msg.put("checkMaill,Please_fill_out_this_field", "Please fill out this field");
		
		//User Edit
		msg.put("UserEdit.Title", "Edit profile");
		msg.put("UserEdit.Username", "Username:");
		msg.put("UserEdit.Password", "Password:");
		msg.put("UserEdit.Email", "Your email address:");
		msg.put("UserEdit.Mobile", "Your mobile number:");
		msg.put("UserEdit.PasswordRepeat", "Repeat password:");
		msg.put("UserEdit.Save_changes", "Save changes");
		msg.put("UserEdit.Cancle", "Cancle");

		//User login screen
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
		
		//Dashboard screen
		msg.put("dashboard_index", "Dashboard");
		

	}

}
