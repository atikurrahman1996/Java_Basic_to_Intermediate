package MYself;

public class SwitchCaseStatement4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*int day=4;
		
		switch(day)
		{
		case 1: System.out.println("Sunday"); break;
		case 2: System.out.println("Monday"); break;
		case 3: System.out.println("Tuesday"); break;
		case 4: System.out.println("Wednesday"); break;
		case 5: System.out.println("Thursday"); break;
		case 6: System.out.println("Friday"); break;
		case 7: System.out.println("Saturday"); break;
		
		default: System.out.println("Sunday"); 


		}*/
		
		
      String role = "CEO";
		
		switch (role)
		{
		case "admin": System.out.println("You are an admin"); break;
			
		case "moderator": System.out.println("You are a moderator"); break;
		case "CEO" : System.out.println("You are a CEO"); break;
			
		default: System.out.println("You are a guest");
			
		
			
		}
		
	}

}
