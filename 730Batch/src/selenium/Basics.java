package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\FITA\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\FITA\\Downloads\\geckodriver-v0.29.0-win64 (3)\\geckodriver.exe");
		
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://gmail.com/");
		
		//driver.navigate().to("https://gmail.com/");
		
		WebElement email_id = driver.findElement(By.id("identifierId"));
		email_id.sendKeys("Automation");
		Thread.sleep(2000);
		//driver.findElement(By.name("identifier")).sendKeys("Testing name");
		
		//driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("Testing class name");
		
		//driver.findElement(By.linkText("Learn more")).click();
		
		//driver.findElement(By.partialLinkText("Learn")).click();
		
		//driver.findElement(By.cssSelector("input[id='identifierId']")).sendKeys("Css selector");
		
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")).sendKeys("Testing Absolute xpath");
		
		//driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("Testing Relative Xpath");
		/*
		WebElement Help = driver.findElement(By.xpath("//a[text()='Help']"));
		Help.click();
		Thread.sleep(2000);
		
		driver.quit();
		*/
		
		email_id.clear();
		Thread.sleep(2000);
		
		email_id.sendKeys("Selenium");
		/*
		String title = driver.getTitle();
		System.out.println("The title of the page is : "+title);
		*/
		
		//System.out.println("The title of the page is :"+driver.getTitle());
		
		System.out.println(driver.getTitle());
		
		String current_url = driver.getCurrentUrl(); 
		System.out.println("The current url is "+current_url);
		
		
		//System.out.println(driver.getPageSource());
		
		WebElement text = driver.findElement(By.xpath("//div[@id='headingSubtext']"));
		String get_Text = text.getText();
		System.out.println(get_Text);
		
		String input_Values = email_id.getAttribute("value");
		System.out.println("The given input values is "+input_Values);
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement compose = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("value")));
	}

}
