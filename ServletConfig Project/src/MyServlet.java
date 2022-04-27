import java.io.*;
import javax.servlet.*;
public class MyServlet extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)throws IOException, ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		ServletConfig cfg=getServletConfig();
		String name=cfg.getInitParameter("name");
		String password=cfg.getInitParameter("password");
		out.println("Your Name="+name);
		out.println("Your Password"+password);
	}
}
