import java.sql.*;
class DatabaseConn
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("create table student(name varchar2(20),password varchar2(20))");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}