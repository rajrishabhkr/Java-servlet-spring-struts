import java.io.*;
import javax.servlet.*;
public class Myservlet extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("HI  this is  Ankita");
	}
}




