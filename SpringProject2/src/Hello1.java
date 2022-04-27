public class Hello1
{
	String number;
	String desi;
	String income;
	public Hello1(String number,String desi,String income)
	{
		this.number=number;
		this.desi=desi;
		this.income=income;
	}
	public void show()
	{
		System.out.println("Your Number="+number);
		System.out.println("Your Designation="+desi);
		System.out.println("Your Income="+income);
	}

}
