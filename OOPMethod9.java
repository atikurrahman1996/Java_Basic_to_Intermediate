package MYself;

public class OOPMethod9 {

	// Method - Block of code 
	
	int x=20;
	int y=30;
	
	/*void sum() // Case 1- not taking any parameter not taking return value 
	{
	
	
		System.out.println(x+y);
	}*/
	
	/*int sum()              // case-2 not taking parameter but taking return value 
	{
		return(x+y);
	}
		*/
	
	/*void sum(int a, int b) // Case 3-  taking any parameter but not taking return value 
	{
	
	
		System.out.println(a+b);
	
	}*/
	
	int sum(int a, int b) // Case 4-  method is taking  parameter also taking return value 
	{
	
		return (a+b);
	
	}

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
			OOPMethod9 oop = new OOPMethod9();
			//oop.sum();    // case 1 output 50
			
			//oop.sum();   // case 2 output 50 
			//System.out.println(oop.sum());
			
			//oop.sum(100,200);   // case 3 output 300
			
			oop.sum(100, 200);    //case 4 output 300
			System.out.println(oop.sum(20, 30));   
			
			
		

	}
}
	