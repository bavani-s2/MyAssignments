package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	
	public static void main(String[] args)
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.id("button")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Bavani.s");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		WebElement industry= driver.findElement(By.name("industryEnumId"));
		Select select=new Select(industry);
		select.selectByIndex(2);
		WebElement Ownership=driver.findElement(By.name("ownershipEnumId"));
		Select select1=new Select(Ownership);
		select1.selectByContainsVisibleText("S-Corporation");
		WebElement source=driver.findElement(By.id("dataSourceId"));
		Select select2=new Select(source);
		select2.selectByValue("LEAD_EMPLOYEE");
		WebElement MarketC=driver.findElement(By.id("marketingCampaignId"));
		Select select3=new Select(MarketC);
		select3.selectByIndex(5);
		WebElement State=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select select4=new Select(State);
		select4.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		
		
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
		
		
}
}