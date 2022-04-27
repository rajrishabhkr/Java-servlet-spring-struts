package mypack;

import com.opensymphony.xwork2.ActionSupport;
public class LoginAction extends ActionSupport 
{
	String name;
	String password;
	
	public  void validate()
          {
		if(name.length()==0)
			this.addFieldError("name", "Name can not be left blanks");
		if(password.length()==0)
			this.addFieldError("password","password is required");
		else if(password.length()<5)
			this.addFieldError("password", "password must contains at least 5 character.");
	 }
        
        public String execute(){
	    return "success";
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

}
