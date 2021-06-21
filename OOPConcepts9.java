package MYself;

public class OOPConcepts9 {


		//Class , Object & Method 
	
	//class -is a collection of variables and methods 
	// Object- Object is an instance of a class 
	// Method - Block of code which contain logic 
	
		
		int eid;           // Variables
		String ename;      // Variables
		Double sal;        // Variables
		int deptno;       // Variables
		String job;      // Variables
		
		void display()     // Method 
		{
			
			
			System.out.println(eid);     // Method 
			System.out.println(ename);
			System.out.println(sal);
			System.out.println(deptno);
			System.out.println(job);
			
		}
		
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			 OOPConcepts9 oop1=new OOPConcepts9();  // creating object //oop1 is Object
			   oop1.eid = 101;
			   oop1.ename = "Atik";
			   oop1.sal = 16000.00;
			   oop1.deptno=12;
			   oop1.job= "SQA";
			   
			   oop1.display();  
			   
			   
	}

}
