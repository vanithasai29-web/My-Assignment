package week2.day2HomeAssignemnt;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Initialization
		String sentence = "We learn Java basics as part of java sessions in java week1"; 
		int count=0;
				
		//Split words
		String[] split = sentence.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			
			for (int j = i+1; j < split.length; j++) {
				if (split[i].equalsIgnoreCase(split[j])) {
					split[j]=" ";
				count++;
				}
				
			}
			
		}
		
		if (count>0) {
			for (int i = 0; i < split.length; i++) {
				if ( (split[i]!=" ")) {
					System.out.print(split[i]+" ");
				}
				
			}
			
				
			}
			
		}
	
}

