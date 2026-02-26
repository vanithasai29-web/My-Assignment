package Week4Day2Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //Create a List for the given numbers
		
		List<Integer> number = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 10, 6, 8)); 
		Collections.sort(number);
		
		System.out.println(number);
		for (int i = 0; i < number.size()-1; i++) {
			
			if(number.get(i) + 1 != number.get(i + 1)) {
		        System.out.println("Missing number: " + (number.get(i) + 1));
		    }
		}
			
		}
	}


