import java.io.*;
import javax.servlet.*;
public class MyServlet extends GenericServlet
{
	@Override
	public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("welcome toGenricServlet.");
	}

}
 