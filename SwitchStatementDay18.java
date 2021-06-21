package JavawithMosh;

public class SwitchStatementDay18 {

	public static void main(String[] args) {

		// if statement
		
		/*String role = "admin";
		
		if(role == "admin")
		{
			System.out.println("You are an admin");
		}
		else if (role == "moderator")
		{
			System.out.println("You are an moderator");
		}
		else
		{
			System.out.println("You are a guest");
			
		}*/
		
		//Switch statement
		
		String role = "admin";
		
		switch (role)
		{
		case "admin":
			System.out.println("You are an admin");
			break;
			
			
		case "moderator":
			System.out.println("You are a moderator");
			break;
			
		default:
			System.out.println("You are a guest");
			break;
		
			
		}
		
	}

}
