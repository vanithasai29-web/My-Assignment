package week2.day2HomeAssignemnt;

import javax.print.DocFlavor.CHAR_ARRAY;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialization
		String test = "I am a software tester";
		
		//Split the word
		String[] split = test.split(" ");
		
		// Traverse through each word using loop
		    for (int i = 0; i < split.length; i++) {
			
		//Find the odd index within the loop	
			if (i%2!=0) {
				
		//Convert the String array into a character array 
		    char[] charArray = split[i].toCharArray();
			//System.out.println(charArray);
		    
		//reverse it
		    for (int j = charArray.length-1; j >=0; j--) {
			System.out.print(charArray[j]);
					}
				}
			else {
			System.out.print(split[i]);
			}
		System.out.print(" ");
		}
							
		}
	}
	


