package Week4Day2Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> Array1 = new ArrayList<Integer>(Arrays.asList(3, 2, 11, 4, 6, 7));
		System.out.println("Array1 =  "+Array1);
		List<Integer> Array2 = new ArrayList<Integer>(Arrays.asList(1, 2, 8, 4, 9, 7));
		System.out.println("Array2 =  "+Array2);
		
		for (int i = 0; i < Array1.size(); i++) {
			
			Integer set1 = Array1.get(i);
			//		System.out.println("set1 =  "+set1);		
			
			for (int j = 0; j < Array2.size(); j++) {
				Integer set2 = Array2.get(j);
				//System.out.println("Set2 =  "+set2);	
								
				if (set1==set2) {
					
				System.out.println("Intersection =  "+set1);	
					
				}
					
			}
			
		}
		
	}

}
