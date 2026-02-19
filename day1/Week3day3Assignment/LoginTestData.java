package Week3day3Assignment;

public class LoginTestData extends TestData{
	
	public void enterUsername() {
		System.out.println("enterUsername");

	} 
	private void enterPassword() {
		System.out.println("enterPassword");

	} 
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			LoginTestData objNewpage = new LoginTestData();
			objNewpage.enterCredentials();
			objNewpage.enterUsername();
			objNewpage.enterPassword();
			objNewpage.navigateToHomePage();

	}

}
