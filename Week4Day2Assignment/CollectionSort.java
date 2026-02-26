package Week4Day2Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> Array1 = new ArrayList<String>(Arrays.asList ("HCL","Wipro","Aspire Systems","CTS"));
		System.out.println("Array1 =  "+Array1);
		
		Collections.sort(Array1);
		System.out.println(Array1);
		
		List<String> Reverse = new ArrayList<String>();
		for (int i = Array1.size()-1; i >= 0 ; i--) {
			
			String GetData=Array1.get(i);
			Reverse.add(GetData);
			
			
			
		}
		System.out.println("Reverse of the given collection :"+Reverse);
	}

}
