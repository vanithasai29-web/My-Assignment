package Week3Day4Assignment;

public class BasePage {
	// findElement(), clickElement(), enterText() and performCommonTasks(). 
	
	public void findElement(){
		System.out.println("Print Element dropdown ");

	}
	public void ClickElement(){
		System.out.println("Print Click Button ");
	}
	public void enterText(){
		System.out.println("Print Textbox ");
	}
	public void performCommonTasks() {
		System.out.println("Print perform action ");
	}

	public static void main(String[] args) {
		BasePage objpage = new BasePage();
		objpage.enterText();
		objpage.findElement();
		objpage.ClickElement();
		objpage.performCommonTasks();
		

	}

}
