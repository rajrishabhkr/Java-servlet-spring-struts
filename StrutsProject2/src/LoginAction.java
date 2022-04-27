import java.sql.*;
import javax.servlet.http.*;
import org.apache.struts2.*;
public class LoginAction 
{
	private String name;
	private String password;
	private String button;
	public String getButton() {
		return button;
	}
	public void setButton(String button) {
		this.button = button;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String execute()
	{
		HttpServletRequest req=ServletActionContext.getRequest();
		
		if(button.equals("INSERT"))
		{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
			String sql="insert into login1 values(?,?)";
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, password);
			pstmt.executeUpdate();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		}
		else if(button.equals("FETCH"))
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from login1");
				req.setAttribute("rs", rs);
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
		else if(button.equals("DELETE"))
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("delete from login1 where name='Amresh'");
				req.setAttribute("rs", rs);
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
		else
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("update login1 set name='suraj' where name='Amresh'");
				req.setAttribute("rs", rs);
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
		
		
		if(name.equals("Amresh")&&password.equals("9910980953"))
		{
			return "success";
		}
		else
		{
			return "failure";
		}
	}

}
