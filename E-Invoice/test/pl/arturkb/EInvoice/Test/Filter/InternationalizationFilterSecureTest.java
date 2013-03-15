/**
 * 
 */
package pl.arturkb.EInvoice.Test.Filter;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.junit.Test;

import pl.arturkb.EInvoice.Filter.InternationalizationFilter;
import pl.arturkb.EInvoice.Filter.InternationalizationFilterSecure;
import pl.arturkb.EInvoice.Internationalization.EnglishLang;

/**
 * Test class for the InternationalizationFilterSecure, every servlet with
 * exenttion .sec will go through this filter.
 * 
 * @author artur
 * 
 */
public class InternationalizationFilterSecureTest {

	/**
	 * Test method for
	 * {@link pl.arturkb.EInvoice.Filter.InternationalizationFilterSecure#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)}
	 * .
	 * 
	 * @throws ServletException
	 * @throws IOException
	 */
	@Test
	public void testDoFilterrWithNullLang() throws IOException,
			ServletException {
		InternationalizationFilterSecure intFilter;

		// Mocks
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		FilterChain chain = mock(FilterChain.class);
		HttpSession session = mock(HttpSession.class);

		// Stubbing
		when(session.getAttribute("lang")).thenReturn(null);
		when(request.getSession(true)).thenReturn(session);

		// Calling filter with doFilter method
		intFilter = new InternationalizationFilterSecure();
		intFilter.doFilter(request, response, chain);

		// Verifying call
		verify(session).setAttribute("lang", EnglishLang.getMsg());

	}

	/**
	 * Test method for
	 * {@link pl.arturkb.EInvoice.Filter.InternationalizationFilter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)}
	 * .
	 * 
	 * @throws ServletException
	 * @throws IOException
	 */
	@Test
	public void testDoFilterWithExistingSession() throws IOException,
			ServletException {
		InternationalizationFilter intFilter;

		// Mocks
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		FilterChain chain = mock(FilterChain.class);
		HttpSession session = mock(HttpSession.class);

		// Stubbing
		when(session.getAttribute("lang")).thenReturn(EnglishLang.getMsg());
		when(request.getSession(true)).thenReturn(session);

		// Calling filter with doFilter method
		intFilter = new InternationalizationFilter();
		intFilter.doFilter(request, response, chain);

		// Verifying no call o session
		verify(session, times(0)).setAttribute("lang", EnglishLang.getMsg());

	}

}
