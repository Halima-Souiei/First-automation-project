package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
		// Open chrome browser
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Open URL application
		driver.get("https://demoqa.com/alerts");

		// Maximize window
		driver.manage().window().maximize();
		WebElement btnClickMe = driver.findElement(By.id("alertButton"));
		btnClickMe.click();

		// Accept alert
		driver.switchTo().alert().accept();
		
		String title = driver.getTitle();
		System.out.println("The title of the page is: " +title);
		driver.quit();

	}

}
