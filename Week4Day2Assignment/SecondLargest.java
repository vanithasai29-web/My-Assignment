package Week4Day2Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a List for the Array
		List<Integer> Array1 = new ArrayList<Integer>(Arrays.asList(3, 2, 11, 4, 6, 7));
		System.out.println("Array1 =  "+Array1);
		
		//Sort Array
		Collections.sort(Array1);
		System.out.println("Array1 =  "+Array1);
		
		//Print the second largest value
		Integer Value = Array1.get(4);
		System.out.println("The Second Largest number is "+Value);
		
		
		
		
	}

}
