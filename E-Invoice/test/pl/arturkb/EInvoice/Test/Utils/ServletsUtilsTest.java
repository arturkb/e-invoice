/**
 * 
 */
package pl.arturkb.EInvoice.Test.Utils;

import static org.junit.Assert.*;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static org.mockito.Mockito.*;

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
	 * Test method for
	 * {@link pl.arturkb.EInvoice.Utils.ServletsUtils#checkEmail(javax.servlet.http.HttpServletRequest)}
	 * .
	 */
	@Test
	public final void testCheckEmail() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for
	 * {@link pl.arturkb.EInvoice.Utils.ServletsUtils#replaceNullWithEmptyString(java.lang.String)}
	 * .
	 */
	@Test
	public final void testReplaceNullWithEmptyStringEmptyString() {
		String fixture = "";
		assertEquals(fixture, ServletsUtils.replaceNullWithEmptyString(null));
	}

	/**
	 * Test method for
	 * {@link pl.arturkb.EInvoice.Utils.ServletsUtils#replaceNullWithEmptyString(java.lang.String)}
	 * .
	 */
	@Test
	public final void testReplaceNullWithEmptyStringNonEmptyString() {
		String fixture = "test";
		assertEquals(fixture, ServletsUtils.replaceNullWithEmptyString("test"));
	}
	
	/**
	 * This test assert request with lang = non empty HashMap then should return this  
	 * HashMap
	 * Test method for
	 * {@link pl.arturkb.EInvoice.Utils.ServletsUtils#getLangMsg(javax.servlet.http.HttpServletRequest)}
	 * .
	 */
	@Test
	public final void testGetLangMsg() {
		
		HashMap<String, String> fixture = new HashMap<String, String>();
		fixture.put("k1", "v1");
		fixture.put("k2", "v2");
		
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpSession session = mock(HttpSession.class);
		
		//Preparing session with lang = null
		when(session.getAttribute("lang")).thenReturn(fixture);
		
		//Preparing request with session like above
		when(request.getSession(true)).thenReturn(session);
		
		//now we run assert
		assertEquals(ServletsUtils.getLangMsg(request), fixture);
		
	}

	/**
	 * This test assert request with lang = null then should return empty 
	 * HashMap<String, String>
	 * Test method for
	 * {@link pl.arturkb.EInvoice.Utils.ServletsUtils#getLangMsg(javax.servlet.http.HttpServletRequest)}
	 * .
	 */
	@Test
	public final void testGetLangMsgWithEmptyHashMap() {
		
		HashMap<String, String> fixture = new HashMap<String, String>();
		
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpSession session = mock(HttpSession.class);
		
		//Preparing session with lang = null
		when(session.getAttribute("lang")).thenReturn(null);
		
		//Preparing request with session like above
		when(request.getSession(true)).thenReturn(session);
		
		//now we run assert
		assertEquals(ServletsUtils.getLangMsg(request), fixture);
		
	}

}
