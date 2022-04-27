import java.sql.*;
public class Hello 
{
	String fname;
	String lname;
	String address;
	public Hello(String fname,String lname,String address)
	{
		this.fname=fname;
		this.lname=lname;
		this.address=address;
	}
	public void display()
	{
		System.out.println("Your First Name="+fname);
		System.out.println("Your Last Name="+lname);
		System.out.println("Your Address="+address);
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
			Statement st=con.createStatement();
//			ResultSet rs=st.executeQuery("create table info(firstname varchar2(20),lastname varchar2(20),address varchar2(20))");
//			ResultSet rs=st.executeQuery("insert into info values('Manish','Mishra','Delhi')");
//			ResultSet rs=st.executeQuery("delete from info where firstname='Suraj'");
//			ResultSet rs=st.executeQuery("update info set firstname='Kunal' where firstname='Suraj'");
//			ResultSet rs=st.executeQuery("select * from info");
/*			while(rs.next())
			{
				System.out.println("Your First Name="+rs.getString(1));
				System.out.println("Your Last Name="+rs.getString(2));
				System.out.println("Your Address="+rs.getString(3));
			}
*/		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
