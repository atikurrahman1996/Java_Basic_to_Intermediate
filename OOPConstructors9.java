package MYself;

public class OOPConstructors9 {
	
	// Constructor is special type of method  // Used for initializing the class variables  // constructor name should be same as class name 
	// Constructors will not return any type of value  // Constructors will invoke at the time of object creation 
	
	/*int x;
	int y;
	
	OOPConstructors9()  // default constructors 
	{
		x=20;
		y=30;
	}
	
	void display()
	{
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		OOPConstructors9 oop = new OOPConstructors9();  // invoke default constructor
		oop.display(); 
		
	
	}

}*/
	
	//parameterize constructors

     int x;
     int y;

          OOPConstructors9()  
        {


            x=20;
            y=30;
       }

            OOPConstructors9(int a, int b)  // parameterize constructor
       {
	
	
	      x=a;
	      y=b;
         }    

        void display () {
        System.out.println(x+y);
      }
 
 public static void main(String[] args) {
		
		OOPConstructors9 oop= new OOPConstructors9(100,200);  //invokes parameterized constructor
		oop.display();  
		
 
 
 
 }
}
 
