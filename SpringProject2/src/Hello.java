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
	}

}
