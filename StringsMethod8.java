package MYself;

public class StringsMethod8 {

	public static void main(String[] args) {

		//String s = "Welcome";
		//System.out.println(s.length());    // s.length method // output 7
		
		
		
		//String s ="Welcome";
		//String s1 = "to the java program";
		
		//System.out.println(s.concat(s1));    // s.concat method / join to two string 
		
		
		/*String s ="   Welcome";
		String s1 = "to the java program";
				
		System.out.println(s.concat(s1));   */
		
		//String s ="     Welcome";
		
			//System.out.println(s.trim());  // trim method for removing space 
			
			
			
				//String s ="Welcome";
				
				//System.out.println(s.charAt(5));   // s.chartAt method         // output 5 , index start from 0, 1.......
		
		
		/*String s ="Welcome";                      
		
		System.out.println(s.contains("Wel")); // true   // contains method
		System.out.println(s.contains("wel")); // false 
		System.out.println(s.contains("com")); // true */

		
				
	// comparing String equal() method 
		
		String s="Welcome";
		
		System.out.println(s.equals("Welcome"));   // true 
		
		System.out.println(s.equals("welcome"));   // false 
		System.out.println(s.equals("Wel  come"));   // false
		
		// equalIgnorecase method 
		
		System.out.println(s.equalsIgnoreCase("welcome"));   // true 
		
		// replace method 
		
		s="Welcome";
		
		System.out.println(s.replace('W','v'));    // replace single letter 
		
		s="Welcome to Java";
		
		System.out.println(s.replace("Java", "Selenium"));  // replace character 
		
		
		// SubString Method       // starting index start from 0,1,2..............
		                          // Ending index start from 1,2,3................
	


		s= "Welcome to the java";
		
		System.out.println(s.substring(1,3));  // output el
		System.out.println(s.substring(2,7));  // lcome
		System.out.println(s.substring(3,9));  // come t

		System.out.println(s.substring(0,4));  // output Welc
		System.out.println(s.substring(2,4));  // output lc
		
		
		// toLowerCase method 
		
		s="WELCOME"; 
		
		System.out.println(s.toLowerCase());  // output welcome
		
		// toUpperCase Method
		
		s="welcome";
		
		System.out.println(s.toUpperCase());  // WELCOME
		


	}

}
