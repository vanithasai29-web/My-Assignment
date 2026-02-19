package Week3day3Assignment;

public class TextField extends WebElement{
	
	private void getText() {
		System.out.println("Display the Text");

	}

	public static void main(String[] args) {
		
		TextField objText = new TextField();
		objText.Click();
		objText.getText();
		objText.setText("SubClass1");
	}

}
