/**
 * 
 */
package pl.arturkb.EInvoice.Test.User;

import static org.junit.Assert.*;
import static net.sourceforge.jwebunit.junit.JWebUnit.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author artur
 * 
 */
public class LoginTestJWebUnit {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		setBaseUrl("http://localhost:8080/E-Invoice");
	}

	@Test
	public void test() {
	    beginAt("/user/login.do");
        //clickLink("login");
        assertTitleEquals("Login");
        //setTextField("username", "test");
        //setTextField("password", "test123");
        //submit();
        //assertTitleEquals("Welcome, test!");
	}

}
