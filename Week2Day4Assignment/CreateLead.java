package Week2Day4Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vanitha1");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Veerapandian");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("TestLeaf");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		
		
	}

}
