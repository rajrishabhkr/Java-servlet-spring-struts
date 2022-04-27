import java.sql.*;
public class LoginAction
{
  String name,password; 
  public String getName()
  {
    return name;
  }
  public void setName(String name) 
  {
    this.name = name;
  }
  public String getPassword() 
  {
    return password;
  }
  public void setPassword(String password) 
  {
    this.password = password;
  }
  public String execute()
  {
	  try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
			String sql="insert into xyz values(?,?)";
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, password);
			pstmt.executeUpdate();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
    if(name.startsWith("a") && password.startsWith("b"))
    {
    	return "success";
    }
	else
	{
		return "failure";
	}
  }
}
