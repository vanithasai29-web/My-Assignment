package Week3day3Assignment;

public class Button extends WebElement{

	public void submit() {
		System.out.println("Print method Submit");

	}
	public static void main(String[] args) {
		
		Button objclick = new Button();
		objclick.setText("Inheriting from the WebElement base class");
		objclick.Click();
		objclick.submit();
	}

}
