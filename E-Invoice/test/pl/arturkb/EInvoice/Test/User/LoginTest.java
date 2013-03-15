/**
 * 
 */
package pl.arturkb.EInvoice.Test.User;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import pl.arturkb.EInvoice.Controller.User.Login;
import pl.arturkb.EInvoice.Internationalization.EnglishLang;

/**
 * @author artur
 * 
 */
public class LoginTest {

	/**
	 * Test method for
	 * {@link pl.arturkb.EInvoice.Controller.User.Login#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)}
	 * .
	 */
	@Test
	public void testDoGetHttpServletRequestHttpServletResponse() {
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		HttpSession session = mock(HttpSession.class);

		// Stubbing
		when(session.getAttribute("lang")).thenReturn(EnglishLang.getMsg());
		when(request.getSession(true)).thenReturn(session);
		PrintWriter writer;
		try {
			// FileNotFoundException
			writer = new PrintWriter("somefile.txt");
			// IOException
			when(response.getWriter()).thenReturn(writer);
			// ServletException
			new Login().doGet(request, response);

			writer.flush(); // it may not have been flushed yet...
			assertTrue(FileUtils.readFileToString(new File("somefile.txt"),
					"UTF-8").contains("My Expected String"));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Test method for
	 * {@link pl.arturkb.EInvoice.Controller.User.Login#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)}
	 * .
	 */
	//Test
	public void testDoPostHttpServletRequestHttpServletResponse() {
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		HttpSession session = mock(HttpSession.class);

		// Stubbing
		when(session.getAttribute("lang")).thenReturn(EnglishLang.getMsg());
		when(request.getSession(true)).thenReturn(session);
		when(request.getParameter("username")).thenReturn("me");
		when(request.getParameter("password")).thenReturn("secret");

		PrintWriter writer;
		try {
			// FileNotFoundException
			writer = new PrintWriter("somefile.txt");
			// IOException
			when(response.getWriter()).thenReturn(writer);
			// ServletException
			new Login().doGet(request, response);

			// only if you want to verify username was called
			// verify(request, atLeast(1)).getParameter("username");

			writer.flush(); // it may not have been flushed yet...
			assertTrue(FileUtils.readFileToString(new File("somefile.txt"),
					"UTF-8").contains("My Expected String"));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
