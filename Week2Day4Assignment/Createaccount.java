package Week2Day4Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Createaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instansitiate Browser
		//		ChromeDriver driver=new ChromeDriver();
				
				ChromeOptions opt = new ChromeOptions();
				opt.addArguments("guest");
				ChromeDriver driver = new ChromeDriver(opt);
				
				
				//Windows Maximise
				driver.manage().window().maximize();
				
				//Pass URL
				driver.get("http://leaftaps.com/opentaps/control/main");
				
				//Locate object
				driver.findElement(By.id("username")).sendKeys("DemoSalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText( "CRM/SFA")).click();
				driver.findElement(By.linkText("Accounts")).click();
				driver.findElement(By.linkText("Create Account")).click();
				driver.findElement(By.id("accountName")).sendKeys("TestLeaf_Vanitha03");
				driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
				driver.findElement(By.id("numberEmployees")).sendKeys("10");
				driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
				driver.findElement(By.className("smallSubmit")).click();
				//driver.findElement(By.id("sectionHeaderTitle_accounts")).g
				System.out.println(driver.getTitle());
				//driver.close();
				
			
				
				
				
				
				
				
				
				
				
				
	}

}
