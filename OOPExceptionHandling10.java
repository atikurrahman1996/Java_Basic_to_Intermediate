package MYself;

//Exception is an event that disturbs the normal flow of program   // Checked exception & Un-Checked Exception 
// Exception is a run time error 


public class OOPExceptionHandling10 {

	public static void main(String[] args) throws InterruptedException {
		
		// Un-checked Exception 
		
		
		/*int a =50;
		
		System.out.println(a/0);        // Arithmetic Exception 
		
		String s = null;
		
		System.out.println(s.length());   // NullPointerException
		
		String s = "ABC";
		
		int i=Integer.parseInt(s);       // NumberFormatException
		
	
		int a []= new int [5];
		                                  // ArrayIndexOutOfBoundsException
		a[10]=50; */
	 
		
		// Handling Exception 
		
		// try block > catch block> finally block 
		
		
		
		
		/*int a =50;
		
		try
		{
			System.out.println(a/0);
		}
		
		catch(ArithmeticException e)                //Arithmetic Exception
		{
			System.out.println("Entered into catch block");
				
		}*/
		
		
		/*String s = "null";
		
		//String s ="Welcome";
		
		try
		{
			System.out.println(s.length());  // NullPointerException 
		}
		
	      catch(Exception e)
		{
			System.out.println(" Enter into catch block"); 
				
		}*/
	
	
		
	/*	int a =50;
		try
		{
			System.out.println(a/0);
			//System.out.println(a/2);
			
		}
		//catch(ArithmeticException e)
		
		catch(Exception e)
		{
			System.out.println("Intered into the catch block");
			
		}
		finally
		{
		   System.out.println("The program is completed");
		   System.out.println("The program is exited");
		   
		}*/
		
		
		
		// Checked Exception   - InterruptedException, IOException, FileNotFoundException

		
		
		System.out.println("The program is Started");
		System.out.println("The program is in progress");
		
		/*try {
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}       //InterruptedException
		*/
	
		Thread.sleep(300);           // throws InterruptedException
		
		System.out.println("The program is completed");
		System.out.println("The program is exited");
	
		
		
	}

}
