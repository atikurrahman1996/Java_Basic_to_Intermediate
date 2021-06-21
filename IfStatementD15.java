package JavawithMosh;

public class IfStatementD15 {

	public static void main(String[] args) {
		
		/*if tem is greater then 30, 
		its a hot day  
		Drink plenty of water, 
		otherwise if its between tem 20 & 30 , 
		its a nice day, 
		otherwise 
		its cold */
		
		
		int temp = 32;
		
		if(temp>30) {
		
		      System.out.println("It's a hot day");
		      System.out.println("Drinks plenty of water");
		} 
		else if  (temp>20 && temp<=30)
		{
		      System.out.println("It's a nice day");
		      
		}
		else 
		{
		
		      System.out.println("It's cold day");
		}
			
		

	}

}
