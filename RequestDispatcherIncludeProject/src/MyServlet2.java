import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class MyServlet2 extends HttpServlet
{
	public void doGet(HttpServletRequest req ,HttpServletResponse res) throws IOException, ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		req.setAttribute("name","Suraj");
		req.setAttribute("password","24680123");
	}
}
