package Week5Day2Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
						
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("guest");
			ChromeDriver driver = new ChromeDriver(opt);
			
			//Maximize Window
			driver.manage().window().maximize();
			//Pass URL
			driver.get("http://leaftaps.com/opentaps/control/login");
			
			//Login with Credentials
			driver.findElement(By.id("username")).sendKeys("DemoSalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText( "CRM/SFA")).click();
			driver.findElement(By.xpath("//a[text()='Contacts']")).click();
			driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
			
			
			//click From Contact from parent window
			
		//	String parentWindow = driver.getWindowHandle();
		//	Thread.sleep(3000);
			driver.findElement(By.xpath("//img[contains(@src,'/images/fieldlookup.gif')]")).click();
			Thread.sleep(3000);
			
			//Switch to Child Window
			Set<String> childWindow = driver.getWindowHandles();
			System.out.println(childWindow);
			
			
			//Convert Set to List
			List<String> currentActivewindow = new ArrayList<String>(childWindow);
			
			//Switch to Child Window
			driver.switchTo().window(currentActivewindow.get(1));
			
			//Click first resulting contact
			driver.findElement(By.xpath("(//a[contains(@class,'linktext')])[1]")).click();
			
					
			//Switch back to Parent Window
			driver.switchTo().window(currentActivewindow.get(0));
			
			//Click To Contact
			driver.findElement(By.xpath("(//img[contains(@src,'/images/fieldlookup.gif')])[2]")).click();
			Thread.sleep(3000);
			
			
			//Switch to childWindow
			Set<String> childWindow2=driver.getWindowHandles();
			System.out.println(childWindow2);	
			
			//Convert Set to List
			List<String> currentActiveWindow2 = new ArrayList<String>(childWindow2);
					
			//Switch to Child Window
			driver.switchTo().window(currentActiveWindow2.get(1));
			
			//Click on the 2nd result set
			driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')])[2]")).click();
			
			//Switch back to Parent Window
			driver.switchTo().window(currentActiveWindow2.get(0));
			
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("//a[text()='Merge']"));
			System.out.println(button);
			button.click();
			
			//Accept the Alert
			Alert alert1 = driver.switchTo().alert();
			alert1.accept();
			
			//Get the title
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			String Title = driver.getTitle();
			System.out.println("Title is "+Title );
			
			driver.close();
					
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
