package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\FITA\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.makemytrip.com/");
		
		try {
			
			WebElement text = driver.findElement(By.xpath("//p[text()='Login/Signup for Best Prices']"));
			
			if(text.isDisplayed())
			{
				driver.findElement(By.xpath("//div[@data-cy='outsideModal']")).click();
			}
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("//span[text()='More']"));
		
		action.moveToElement(element).build().perform();

	}

}
