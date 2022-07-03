package labsession1.app;

import java.util.Scanner;

import labsession1.pojo.ITSupportAdmin;
import labsession1.service.CredentialService;

public class DriverClass {
	public static void main(String[] args) throws Exception {

		ITSupportAdmin employee = new ITSupportAdmin("Harshit","Choudary");


		System.out.println("please enter the department from the following: ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");		

		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		String dept = "";
		if(choice > 4)
		{
			throw new Exception("Enter valid input; Choose from 1 to 4 options only");
		}
		switch(choice)
		{
		case 1:
			dept = "tech";
			break;

		case 2:
			dept = "admin";
			break;

		case 3:
			dept = "hr";
			break;

		case 4:
			dept = "legal";
			break;		
		}

		CredentialService service = new CredentialService(employee);
		
		System.out.println("Dear "+employee.getfirstName()+" your generated credentials are as follows: ");		
		service.showCredentials(dept);
		
	}

}
