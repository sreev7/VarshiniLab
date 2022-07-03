package labsession1.pojo;


public class ITSupportAdmin{

	private String firstName;
	private String lastName;
	private String dept;
	private String password;
	private String mailId;
	

	public ITSupportAdmin(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	

	public String getfirstName() { return firstName; }
	public String getlastName() { return lastName; }

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}    
}



