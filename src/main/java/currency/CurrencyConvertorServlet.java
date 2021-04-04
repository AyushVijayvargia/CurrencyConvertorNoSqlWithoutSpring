package currency;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CurrencyConvertorServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String cuur1 = req.getParameter("curr1");
		String curr2 = req.getParameter("curr2");

		
		//rest call to Currency Converter
		
		RestTemplate rest =new RestTemplate(;)
		
		
		PrintWriter out = res.getWriter();
		out.print("it worked");

	}
}
