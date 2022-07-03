package labsession1.service;

import java.util.Random;

import labsession1.pojo.ITSupportAdmin;

public class CredentialService{

	ITSupportAdmin employee;

	public CredentialService(ITSupportAdmin employee) {
		super();
		this.employee = employee;
	}

	public char[] generatePassword(int length) {
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "!@#${][)(";
		String numbers = "1234567890";
		String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
		Random random = new Random();
		char[] password = new char[length];

		password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
		password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
		password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
		password[3] = numbers.charAt(random.nextInt(numbers.length()));

		for(int i = 4; i< length ; i++) {
			password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		}
		
		String password1 = String.valueOf(password);
		employee.setPassword(password1);		
		return password;
	}

	public void generateEmail(String dept)
	{ 
		employee.setMailId(employee.getfirstName()+employee.getlastName()+"."+ dept + ".gl.com");		

	}
	
	public void showCredentials(String dept)
	{
		generateEmail(dept);
		generatePassword(8);
		System.out.println("Email -----> " +  employee.getMailId());
		System.out.println("Password ----->" +   employee.getPassword());
	  
	 
	}
}  