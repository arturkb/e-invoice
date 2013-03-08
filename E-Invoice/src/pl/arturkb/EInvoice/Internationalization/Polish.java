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
public class Polish extends Language {
	
	public Polish() {
		super();
	}

	public Polish init() {
		userLoginControllerMsg();
		return this;
	}

	private void userLoginControllerMsg() {
		msg.put("login", "Logowanie");
		msg.put("logout", "Wylogowanie");
		msg.put("Welcome_to_E-Invoice", "Witamy w E-Fakturze");
		msg.put("Please_login_with_your_Username_and_Password.", "Proszę o zalogoanie się urzywająć nazwy użytkownika oraz jego hasła.");
		msg.put("Your_Login_Was_Unsuccessful_-_Please_Try_Again", "Autoryzacja urzytkownika nie powiodla się, spróbuj ponownie!");
		msg.put("Remember_me", "Zapamiętaj mnie na tym kompuerze");
		msg.put("Username", "\"Nazwa urzytkownika\"");
		msg.put("\"Password", "\"Hasło\"");		
	}

}
