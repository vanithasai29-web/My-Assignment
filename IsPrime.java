package week2.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=7;
		int i;
		for (i = 2; i < input; i++) {
			int x=input%2;
			if (x==0) {
				System.out.println(i +" - The number is not Prime");
				break;
		}
			
			
		}
		if (i==input) {
			System.out.println(i +" - The number is Prime");
			
		}		
	}

}
