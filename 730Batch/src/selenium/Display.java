package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\FITA\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://shareselenium.herokuapp.com/Edit.html");
		
		WebElement disp = driver.findElement(By.id("email"));
		if(disp.isDisplayed())
		{
			disp.sendKeys("Test");
		}
		
		
		
	}

}
