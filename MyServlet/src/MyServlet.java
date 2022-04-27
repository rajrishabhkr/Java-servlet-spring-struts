import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class MyServlet extends HttpServlet
{
	public void doget(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		String gender=req.getParameter("gender");
		String hobbies=req.getParameter("hobbies");
		out.println("Your Name="+name);
		out.println("Your Password="+password);
		out.println("Your Gender="+gender);
		out.println("Your Hobbies="+hobbies);
	}

}