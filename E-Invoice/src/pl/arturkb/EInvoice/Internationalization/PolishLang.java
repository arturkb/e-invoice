package pl.arturkb.EInvoice.Internationalization;

import java.util.HashMap;

public class PolishLang {

	private static HashMap<String, String> msg = new HashMap<String, String>();

	public static HashMap<String, String> getMsg() {
		return msg;
	}

	static {
		//Languages
		msg.put("polish", "Polski");
		msg.put("english", "Angielski");
		
		
		//User login screen login.do
		msg.put("login", "Logowanie");
		msg.put("logout", "Wylogowanie");
		msg.put("Welcome_to_E-Invoice", "Witamy w E-Fakturze");
		msg.put("Please_login_with_your_Username_and_Password.",
				"Proszę o zalogoanie się urzywająć nazwy użytkownika oraz jego hasła.");
		msg.put("Your_Login_Was_Unsuccessful_-_Please_Try_Again",
				"Autoryzacja urzytkownika nie powiodla się, spróbuj ponownie!");
		msg.put("Remember_me", "Zapamiętaj mnie na tym kompuerze");
		msg.put("Username", "\"Nazwa urzytkownika\"");
		msg.put("\"Password", "\"Hasło\"");
		msg.put("change", "Zmień");

	}

}
