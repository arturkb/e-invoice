/**
 * 
 */
package pl.arturkb.EInvoice.Test.Filter;

import static org.mockito.Mockito.*;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.Before;
import org.junit.Test;

import pl.arturkb.EInvoice.Filter.InternationalizationFilter;
import pl.arturkb.EInvoice.Internationalization.EnglishLang;

/**
 * Test class for InternationalizationFilter class
 * @author artur
 *
 */
public class InternationalizationFilterTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link pl.arturkb.EInvoice.Filter.InternationalizationFilter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)}.
	 * @throws ServletException 
	 * @throws IOException 
	 */
	@Test
	public final void testDoFilterWithNullLang() throws IOException, ServletException {
		InternationalizationFilter intFilter;
		
		//Mocks
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		FilterChain chain = mock(FilterChain.class);
		HttpSession session = mock(HttpSession.class);
		
		//Stubbing
		when(session.getAttribute("lang")).thenReturn(null);
		when(request.getSession(true)).thenReturn(session);
		
		//Calling filter with doFilter method
		intFilter = new InternationalizationFilter();
		intFilter.doFilter(request, response, chain);
		
		//Verifying call
		verify(session).setAttribute("lang", EnglishLang.getMsg());	
	}
	
	/**
	 * Test method for {@link pl.arturkb.EInvoice.Filter.InternationalizationFilter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)}.
	 * @throws ServletException 
	 * @throws IOException 
	 */
	@Test
	public final void testDoFilterWithExistingSession() throws IOException, ServletException {
		InternationalizationFilter intFilter;
		
		//Mocks
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		FilterChain chain = mock(FilterChain.class);
		HttpSession session = mock(HttpSession.class);
		
		//Stubbing
		when(session.getAttribute("lang")).thenReturn(EnglishLang.getMsg());
		when(request.getSession(true)).thenReturn(session);
		
		//Calling filter with doFilter method
		intFilter = new InternationalizationFilter();
		intFilter.doFilter(request, response, chain);
		
		//Verifying no call o session
		verify(session, times(0)).setAttribute("lang", EnglishLang.getMsg());
		
	}

}
