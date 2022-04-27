import org.hibernate.*;
import org.hibernate.cfg.*;
public class Hello 
{
	int id;
	String fname;
	String lname;
	String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Hello()
	
	{
		
	}
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
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tx=null;
		try
		{
			tx=ss.beginTransaction();
			Hello h=new Hello(fname, lname, address);
			ss.save(h);
			tx.commit();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}