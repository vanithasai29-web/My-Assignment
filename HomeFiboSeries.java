package week2.day1;


public class HomeFiboSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=8;
		int a=0;
		int b=1;
		for (range = 0; range < 8; range++) {
			int c=a+b;
		System.out.println("C"+c);
			a=b;
		//	System.out.println("a"+a);
			b=c;	
		//	System.out.println("b"+b);
			
		}
				
	}

}
