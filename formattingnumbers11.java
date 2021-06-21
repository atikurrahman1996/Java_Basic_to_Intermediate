package JavawithMosh;

import java.text.NumberFormat;

public class formattingnumbers11 {

	public static void main(String[] args) {

		
		//NumberFormat currency = NumberFormat.getCurrencyInstance();
		
        //String result = currency.format(4214212.243);
        
        
		NumberFormat percent= NumberFormat.getPercentInstance();
		
		String result=percent.format(0.1);
		
        System.out.println(result);
        
		
	

}
}