package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\FITA\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://shareselenium.herokuapp.com/DropDown.html");
		
		Select slt = new Select(driver.findElement(By.xpath("//select[@id='dropdown1']")));
		slt.selectByIndex(1);
		Thread.sleep(2000);

		Select slt1 = new Select(driver.findElement(By.xpath("//select[@name='dropdown2']")));
		slt1.selectByValue("2");
		Thread.sleep(2000);
		
		Select slt2 = new Select(driver.findElement(By.xpath("//select[@id='dropdown3']")));
		slt2.selectByVisibleText("UFT/QTP");
		Thread.sleep(2000);

	}

}
