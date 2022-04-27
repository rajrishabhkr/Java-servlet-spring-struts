<%@page import="java.sql.*" %>
<%
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
	Statement st=con.createStatement();
	ResultSet rs1,rs2;
	rs1=st.executeQuery("select * from login1");
	while(rs1.next())
	{
		out.println(""+rs1.getString(1)+""+rs1.getString(2));
	}

	try
	{
	
	 rs2=st.executeQuery("select * from login1");
	while(rs2.next())
	{
		out.println(""+rs2.getString(1)+""+rs2.getString(2));
	}	
	}
	catch(Exception e)
	{
	 out.println(e);
	}
 
%>
