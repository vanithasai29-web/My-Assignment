package ArrayAssignment;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialization
		  int[] set1 = {3,2,11,4,6,7}; 
          int[] set2 = {1,2,8,4,9,7};
          
          //loop iterator from 0 to array length 
          for (int i = 0; i < set1.length; i++) {
        	
        	//nested for another array from 0 to array length  
        	  for (int j = 0; j < set2.length; j++) {
        		
        	//Compare both the arrays using a conditional statement.	  
        		  if (set1[i]==set2[j]) {
        			  System.out.println("Matching element is "+ set1[i]) ;
        		} 
				
			}
			
		}
	}

			
	}


