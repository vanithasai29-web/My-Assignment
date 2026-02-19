package Week3day3Assignment;

public class Radiobutton_subclass extends Button {
	public void selectRadioButton(){
		System.out.println("Print - Radiobutton inherits subclass button");
	}

	public static void main(String[] args) {
		Radiobutton_subclass objRadiobutton = new Radiobutton_subclass();
		objRadiobutton.selectRadioButton();
		objRadiobutton.submit();
		objRadiobutton.Click();
		objRadiobutton.setText("Method inherit Webelement - Button - RadioButton");
		
	}
	
}
