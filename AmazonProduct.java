package marathon;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AmazonProduct {

	public static void main(String[] args) {
	

		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for boys");
		driver.findElement(By.xpath("//div[text()='bags for boys']")).click();
		String results=driver.findElement(By.xpath("//h2[contains(@class,'a-size-base a-spacing-small')]//span")).getText(); //--->Axes Xpath//
		System.out.println(results);
		driver.findElement(By.xpath("(//span[text()='Brands'])/following::span[text()='Safari']")).click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='American Tourister']")).click();		
		

		WebElement Arrival=driver.findElement(By.xpath("//select[@id='s-result-sort-select']"));
		Select select=new Select(Arrival);
		select.selectByIndex(4);
		String baginfo=driver.findElement(By.xpath("//h2[contains(@class,'a-size-base-plus a-spacing')]")).getText(); 
		System.out.println(baginfo);
		String price=driver.findElement(By.xpath("//span[@class='a-price']")).getText(); 
		System.out.println(price);
		String title=driver.getTitle();
		System.out.println(title);
		
		}
}
