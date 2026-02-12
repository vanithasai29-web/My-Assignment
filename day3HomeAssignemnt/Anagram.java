package week2.day2HomeAssignemnt;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String Declaration
		String text1 ="stops"; 
		String text2 ="potss";
		
		//Check if length is equal
		if (text1.length()==text2.length()) {
			System.out.println("The number is equal in length");
					
		} else {
			System.out.println("The number is not equal in length");
		}
		//Convert string to character
			char[] charArray = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			
			Arrays.sort(charArray);
			Arrays.sort(charArray2);
		
			//Check for Lenght
			if (charArray.length==charArray2.length) {
				System.out.println("The given strings are Anagram");
			} else {
				System.out.println("The given strings are not Anagram");
			}
	}
}
