package JavawithMosh;

public class ForeachLoopDay22 {

	public static void main(String[] args) {

		
		String [] fruits = {"apple", "mango", "orange", "watermelon"	};
		
		for(int i =0; i < fruits.length; i++)
		
		System.out.println(fruits[i]);
		
		for (String fruit: fruits)    // for each loop method
			System.out.println(fruit);
		
		

}
}