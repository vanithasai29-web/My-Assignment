package Week3Day4Assignment;

public class Subclass_LoginPage extends BasePage{
		
	public void overridePage(){
		super.performCommonTasks();
		System.out.println("Override the performCommonTasks() method in the LoginPage class");
				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Subclass_LoginPage objnewPage = new Subclass_LoginPage();
		objnewPage.ClickElement();
		objnewPage.enterText();
		objnewPage.findElement();
		objnewPage.overridePage();

	}

}
