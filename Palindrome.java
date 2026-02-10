package week2.day1;


public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=11211;
		int rev=0;
		for (int i = input; i >0; i=i/10) {
			//System.out.println(i);
			int rem = i%10;
			rev=rev*10+rem;
				//	System.out.println("Rem"+rem);	
	
		}
		if (input==rev) {
			 System.out.println("Given number is Palandrome");
			
		} else {
			System.out.println("Given number is not Palandrome");

		}				
	}

}
