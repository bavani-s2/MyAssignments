package week2.day2;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegister {

	
	public static void main(String[] args) {
		

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Bavani");
		driver.findElement(By.name("lastname")).sendKeys("S");
		driver.findElement(By.name("reg_email__")).sendKeys("9994214014");
		driver.findElement(By.id("password_step_input")).sendKeys("Test@12345");
		WebElement Date= driver.findElement(By.id("day"));
		Select select=new Select(Date);
		select.selectByIndex(5);
		WebElement Month=driver.findElement(By.id("month"));
		Select select1=new Select(Month);
		select1.selectByContainsVisibleText("Jan");
		WebElement year=driver.findElement(By.id("year"));
		Select select2=new Select(year);
		select2.selectByValue("1992");
		
		//driver.findElement(By.id("sex")).click();
		 driver.findElement(By.xpath("//label[normalize-space()='Female']")).click();
		
	}

}
