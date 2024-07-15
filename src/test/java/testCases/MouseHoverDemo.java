package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) {
		// Open chrome browser
				WebDriver driver = new ChromeDriver();

				// Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				// Open URL application
				driver.get("https://demoqa.com/menu/");

				// Maximize window
				driver.manage().window().maximize();
				WebElement mouseHover = driver.findElement(By.xpath("//*[@id='nav']/li[2]/a"));
				Actions actions = new Actions(driver);
				actions.moveToElement(mouseHover).perform();
				
	}

}
