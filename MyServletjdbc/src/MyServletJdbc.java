import java.io.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.*;
import javax.servlet.http.*;
public class MyServletJdbc extends HttpServlet
{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		out.println("Your Name="+name);
		out.println("Your Password="+password);
		
		try
		{
			Class.forName("oracle.jdbc.drive.oracleDrive");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:XE","system","oracle");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("create table Abc(name varchar2(20),roll varchar2(20))");
			}
		
			catch(Exception e)
			{
				out.println(e);
			}


		
	}
}
