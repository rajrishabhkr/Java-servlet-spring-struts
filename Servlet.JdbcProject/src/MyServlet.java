import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class MyServlet extends HttpServlet
{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		out.println("Your Name="+name);
		out.println("Your password="+password);
		
		try
		{
			Class.forName("oracle.jdbc.driver.oracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("create table Abc (name varchar2(20),password varchar2(20))");
			
		}
			catch(Exception e)
			{
				out.println(e);
		}
	}
}
