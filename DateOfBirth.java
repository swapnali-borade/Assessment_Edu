import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateOfBirth {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PARTH\\doSelect_Assesment\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//create driver object
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://selenium-apps.doselect.in/age-calculator/");
		//using id
		Thread.sleep(3000);
		driver.findElement(By.id("birth_date")).sendKeys("12/01/1998");
		driver.findElement(By.id("calculate")).click();
		
		//using xpath
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='birth_date']")).sendKeys("26/02/2000");
		driver.findElement(By.xpath("//div[@id='calculate']")).click();
	}

}
