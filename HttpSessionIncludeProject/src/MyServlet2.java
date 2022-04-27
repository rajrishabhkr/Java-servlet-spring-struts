import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class MyServlet2 extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		HttpSession hs=req.getSession();
		hs.setAttribute("name","Suraj");
		hs.setAttribute("password","2345678");
		
	}

}
