package MYself;

class Parent 
{
   int a;
   void dispaly ()
{		
   	System.out.println(a);		
}
}
  class Child1 extends Parent
  {
      int x;
       void show()
  {
	System.out.println(x);
}
}

class Child2 extends Parent 
{

	 int y;
	 void print()
	 {
		 System.out.println(y);
	 }
}



public class OOPHierarchicalInheritance9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		Child1 chi = new Child1();
		chi.a=400;
		chi.x=500;
		
		
		
		chi.dispaly();
		chi.show();
		
		Child2 chi2= new Child2();
		chi2.a =100;
		chi2.y=200;
		
		chi2.dispaly();
		chi2.print();
		
		
	}
		
	}


