package Week4Day2Assignment;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mytra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Insitiate Browser
		ChromeDriver driver=new ChromeDriver();
		
		//Windows Maximise
		driver.manage().window().maximize();
		
		//Pass URL
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Search for Bag
		driver.findElement(By.className("desktop-searchBar")).sendKeys("Bags",Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//label[contains(@class,'common-customRadio gender-label')]")).click();
		
		
		//select option LaptopBag
		driver.findElement(By.xpath("//label[text()='Laptop Bag']")).click();
		
		//get the count
		String totCount = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		System.out.println("Total Bag ="+totCount);
		
		//Find the brand
		Thread.sleep(3000);
		List<WebElement> Brand = driver.findElements(By.xpath("//h3[@class='product-brand']"));
		Set<String> BrandInfo = new LinkedHashSet<String>();
		
				for (int i = 0; i < Brand.size(); i++) {
					
					String info = Brand.get(i).getText();
					BrandInfo.add(info);
										
		}
		System.out.println("Brand of Product displayed in this page are : "+BrandInfo);
		
		//Find the name of the bag
		Thread.sleep(3000);
		List<WebElement> Product = driver.findElements(By.xpath("//h4[@class='product-product']"));
		Set<String> ProductInfo = new LinkedHashSet<String>();
		
				for (int j = 0; j < Product.size(); j++) {
					String info1 = Product.get(j).getText();
					ProductInfo.add(info1);			
		}
		System.out.println("Name of Product displayed in this page are : "+ProductInfo);
		
		
	}

}
