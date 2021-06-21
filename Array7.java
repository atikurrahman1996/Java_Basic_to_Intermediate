package MYself;

public class Array7 {

	public static void main(String[] args) {
		// Single Dimensional Array

		
		//int a[] = new int [5];  // declare array with size starting index 0, and last index 4
		
		// Storing value/ inserting value
		
		// if limit is fixed we can use like this 
		
	/*a[0]=100;
		a[1]=200;   
		a[2]=300;
		a[3]=400;
		a[4]=500;  */
		
		
		// if we don't know limit we can use like this 
		
		/*int a[]= {100,200,300,400,500};  // declare array without knowing size 
		
		System.out.println(a.length);   //output 5 // using length function we can see size / length of array 
		
		
		System.out.println(a[2]);   //read specific value
		
		for(int i=0; i<a.length; i++)
		{
		
		System.out.println(a[i]);  // read all values , output 100,200,300,400,500,
		
		}
		
	}

}*/


            // Two dimensional array 


		int a[][]= new int [3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=100; 
		
		
		//int a[][]= { {100,200}, {300,400}, {500,600}};
		
		
		System.out.println("The number of raw: " +a.length);   //output raw 3 // using length function we can see size / length of array 
		
		System.out.println("The number of column: "+ a[0].length); // output column 2
		
		System.out.println(a[2][0]);    //read specific value 
		
		
		for(int i=0; i<a.length; i++) //outer lopp
		{
			for (int j=0; j<a[i].length; j++) //inner loop 
			{
			
				System.out.println(a[i][j]);   //read all values 100.......600
		}
		
		
		

	}


	}
}




































