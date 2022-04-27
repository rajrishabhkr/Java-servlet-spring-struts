import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class MyServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		out.println("Your Name="+name);
		out.println("Your password="+password);
	}
}
