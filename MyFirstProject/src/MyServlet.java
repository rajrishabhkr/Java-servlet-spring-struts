import java.io.*;
import javax.servlet.*;
public class MyServlet implements Servlet
{
	ServletConfig config;
	public void init(ServletConfig config)
	{
		this.config=config;
	}
	public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body bgcolor=blue text=yellow>");
		out.println("This is my first servlet project");
		out.println("</body></html>");
	}
	public void destroy()
	{
		
	}
	public ServletConfig getServletConfig()
	{
		return config;
	}
	public String getServletInfo()
	{
		return "Created by Rishabh";
	}

}
