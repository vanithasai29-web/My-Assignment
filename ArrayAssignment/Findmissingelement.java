package ArrayAssignment;

import java.util.Arrays;

public class Findmissingelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Data initialization
		int[] series= {1,4,3,2,8,6,7};
		int sum =0;
		
		
		//Sort and get the Max number
		Arrays.sort(series);
		int maxnumber=series[series.length-1];
		//System.out.println(maxnumber);
		
		//Sum of the array
		for (int i = 0; i < series.length; i++) {
			
			sum=sum+series[i];
					
		}
		//System.out.println(sum);
		
		//use the formula
		int misNumber=(maxnumber*(maxnumber+1)/2)-sum;
		System.out.println(misNumber);
	    
	
	
	
	}
	
	

}
