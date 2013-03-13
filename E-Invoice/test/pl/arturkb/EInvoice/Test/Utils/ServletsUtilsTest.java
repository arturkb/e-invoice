/**
 * 
 */
package pl.arturkb.EInvoice.Test.Utils;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pl.arturkb.EInvoice.Utils.ServletsUtils;

/**
 * @author artur
 *
 */
public class ServletsUtilsTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link pl.arturkb.EInvoice.Utils.ServletsUtils#checkEmail(javax.servlet.http.HttpServletRequest)}.
	 */
	@Test
	public final void testCheckEmail() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link pl.arturkb.EInvoice.Utils.ServletsUtils#replaceNullWithEmptyString(java.lang.String)}.
	 */
	@Test
	public final void testReplaceNullWithEmptyStringEmptyString() {
		String fixture = "";
		assertEquals(fixture, ServletsUtils.replaceNullWithEmptyString(null));
	}
	
	/**
	 * Test method for {@link pl.arturkb.EInvoice.Utils.ServletsUtils#replaceNullWithEmptyString(java.lang.String)}.
	 */
	@Test
	public final void testReplaceNullWithEmptyStringNonEmptyString() {
		String fixture = "test";
		assertEquals(fixture, ServletsUtils.replaceNullWithEmptyString("test"));
	}

	/**
	 * Test method for {@link pl.arturkb.EInvoice.Utils.ServletsUtils#getLangMsg(javax.servlet.http.HttpServletRequest)}.
	 */
	@Test
	public final void testGetLangMsg() {
		fail("Not yet implemented"); // TODO
	}

}
