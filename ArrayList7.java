package MYself;

import java.util.ArrayList;

public class ArrayList7 {

	public static void main(String[] args) {
   
		// How to declare Array List
		
	//ArrayList list = new ArrayList(); // we can add any kind of elements 
	
	//ArrayList<Integer>list = new ArrayList<Integer>(); // String elements
	
	// ArrayList<String>list = new ArrayList<String>();  // Integer Elements
		
	
		
		ArrayList<String>list = new ArrayList<String>(); 
		
		// adding value to ArrayList
		
		
		list.add("Israt");  //0
		list.add("I");     //1
		list.add("Love"); //2
		list.add("You");  //3
		list.add("So"); //4
		list.add("Much");  //5
		
		// Size of Array List 
		
		System.out.println(list.size());
		
		System.out.println("Before removing element: "+list);   // output 6

		// remove an element
		
		list.remove(2);
		
		System.out.println(list.size());

		System.out.println("After removing element: " +list);   // output 5

		
		// inserting new element in Array List 
		
		list.add(0,"Srity"); 
		System.out.println(list.size());

		System.out.println("After inserting  element: " +list);   // output 6
		
		
		// read value from array list 
		
		
		for(String s: list)
			{
			System.out.println(s);
			}
		
		
		
		
		
		
		
	}

}
