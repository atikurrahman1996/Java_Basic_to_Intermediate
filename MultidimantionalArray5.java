package JavawithMosh;

import java.util.Arrays;

public class MultidimantionalArray5 {

	public static void main(String[] args) {
		
		
		int[][] numbers = new int [2] [3];
		
		numbers [0][0]=1;
		
		System.out.println(Arrays.deepToString(numbers));  // output [[1,0,0], [0,0,0]]
		
		

	}

}
		
/*int a[][]= new int [3][2];
		
		a[0][0]= 100;
		a[0][1]= 200;
		
		a[1][0]= 300;
		a[1][1]= 400;
		
		a[2][0]= 500;
		a[2][0]= 600;
		
		
		//int a[][]= { {100,200}, {300,400},{500,600} };
		
		System.out.println("The number of rows is: " + a.length);
	
		
		System.out.println("The number of columns is: " + a[0].length);

	}

}*/

