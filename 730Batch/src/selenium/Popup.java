package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\FITA\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
		driver.navigate().to("https://shareselenium.herokuapp.com/Alerts.html");
		
		WebElement alert_box = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		alert_box.click();
		Thread.sleep(2000);

		Alert alt = driver.switchTo().alert();
		String alt_text = alt.getText();
		System.out.println(alt_text);
		alt.accept();
		
		WebElement confirm_Box = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		confirm_Box.click();
		alt.dismiss();
		Thread.sleep(2000);
		
		WebElement promp_box = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
		promp_box.click();
		alt.sendKeys("Automation");
		alt.accept();
		
				

	}

}
