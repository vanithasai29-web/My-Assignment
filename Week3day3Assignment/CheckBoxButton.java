package Week3day3Assignment;

public class CheckBoxButton extends Button {
	
	public void clickCheckButton() {
		System.out.println("Print - checkButton inherit Subclass Button");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxButton objcheckbutton = new CheckBoxButton();
		objcheckbutton.submit();
		objcheckbutton.clickCheckButton();
		objcheckbutton.Click();
		objcheckbutton.setText("Inherits Superclass-webelement and subclass-button");
	}

}
