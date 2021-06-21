
//3. Write a java program to swap two number, before swap a=10, b=20, after swap, a=20, b=10,

package Practice;

public class swaping2numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10; 
        int b=20;
		
		System.out.println("Before swapping valuse are... "+a+" "+b);
		
		int t=a;
		a=b;
		b=t;
		
		System.out.println("After swapping values are.... "+a+" "+b);
				

	}

}
