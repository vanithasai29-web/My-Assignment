package Week3day3Assignment;

public class WebElement {
		
	//Click Method
	public void Click() {
		System.out.println("Click");

	}
	//setText Method
	public void setText(String text) {
		System.out.println("Print as "+text);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebElement objPageElement = new WebElement();
		objPageElement.Click();
		objPageElement.setText("Super Class");
		
	}

}
