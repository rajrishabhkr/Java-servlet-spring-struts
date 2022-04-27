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
