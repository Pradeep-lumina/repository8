package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\FITA\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://shareselenium.herokuapp.com/CheckBox.html");
		
		//boolean check_box = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).isSelected();
		//System.out.println("The selected checkbox is :"+check_box);
		
		WebElement check_Box = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		
		if(check_Box.isSelected())
		{
			System.out.println("The checkbox is already selected");
		}
		else
		{
			System.out.println("The checkbox is not selected");
			check_Box.click();
		}
		
	}
	
}
		
		