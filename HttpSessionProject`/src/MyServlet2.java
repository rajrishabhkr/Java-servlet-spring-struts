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
		String name=(String)hs.getAttribute("name");
		String password=(String)hs.getAttribute("password");
		out.println("Your Name="+name);
		out.println("Your Passwors="+password);

		
	}

}
