package JavawithMosh;

public class TernaryoperatorD17 {

	public static void main(String[] args) {

		
		int income = 1200;
		String className;
		
		//String className = income > 1000 ? "First" : "Economy" ;
		
		if (income > 1000) {
			className = "First";
		}
       
		else {
			className = "Economy";
		}
		
		System.out.println(className);
	}

}
