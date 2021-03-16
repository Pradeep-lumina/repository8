package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\FITA\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://shareselenium.herokuapp.com/Edit.html");

		boolean enable = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		System.out.println(enable);
	}

}
