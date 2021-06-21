package MYself;


//Single Inheritance - Class A is parent class and class B is child class 


      class A 
     {
	    int a;
	    void dispaly ()
	 {		
	    	System.out.println(a);		
     }
     }
       class B extends A // B is child class and A is parent class 
       {
	       int b;
	        void print()
	   {
		System.out.println(b);
	}
}

     class C extends B     // Multilevel Inheritance - A is parent class of B and B is the parent class of C 
     {
    	 int c;
    	 void show()
    	 {
    		 System.out.println(c);
    	 }
     }
		
        public class OOPInheritance9 {

        public static void main(String[] args) {
	
        	/*A aobj=new A();
        	aobj.a = 100;
        	aobj.dispaly();
        	
        	B bobj = new B();
        	bobj.a = 200;
        	bobj.b=300;
        	
        	bobj.dispaly();
        	bobj.print(); */
        	
        	
			C cobj = new C();
			cobj.a=100;
			cobj.b =200;
			cobj.c=300;
			
			cobj.dispaly();
			cobj.print();
			cobj.show();
			
			
			
			
			
			
				
}
		}