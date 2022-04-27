import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class MyServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		HttpSession hs=req.getSession();
		out.println(hs.getId());
		//out.println(hs.getCreationTime());
		Date d1=new Date(hs.getCreationTime());
		out.println("Creation Time="+d1);
		//out.println(hs.getLastAccessedTime());
		Date d2=new Date(hs.getLastAccessedTime());
		out.println("Last Accessed Time="+d2);
		out.println(hs.getMaxInactiveInterval());
		out.println(hs.isNew());


		
	}
	

}
