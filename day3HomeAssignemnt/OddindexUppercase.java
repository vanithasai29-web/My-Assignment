package week2.day2HomeAssignemnt;

public class OddindexUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String input = "changeme";
		 char[] charArray = input.toCharArray();
		 
		 for (int i = 0; i<=charArray.length-1 ; i++) {
			
			 if (i%2==1) {
		//		 charArray[i] = Character.toUpperCase(charArray[i]);
								 
							} 
			 System.out.print(charArray[i]);
		}
	}

}
