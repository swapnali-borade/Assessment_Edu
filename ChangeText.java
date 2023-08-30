import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangeText {

	public static void main(String[] args) throws Exception {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PARTH\\doSelect_Assesment\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	//create driver object
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//open webpage
	driver.get("https://selenium-apps.doselect.in/change-text/");
	//Find button and click
	driver.findElement(By.id("bigger")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("smaller")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("reset")).click();
	// find button using xpath
	//xpath for bigger button
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='bigger']")).click();
	//xpath for smaller button
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='smaller']")).click();
	//xpath for reset button
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='reset']")).click();
	
	}

}
