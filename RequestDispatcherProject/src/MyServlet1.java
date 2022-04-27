import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class MyServlet1 extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		req.setAttribute("name","Suraj");
		req.setAttribute("password","147258");
		RequestDispatcher rd=req.getRequestDispatcher("/ser2");
		rd.forward(req,res);
		}
}
