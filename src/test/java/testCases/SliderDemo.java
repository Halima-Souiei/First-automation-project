package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {

		// Open chrome browser
		WebDriver driver = new ChromeDriver();
		
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Open URL application
		driver.get("https://demoqa.com/slider/");

		// Maximize window
		driver.manage().window().maximize();
		
		WebElement slider = driver.findElement(By.id("sliderContainer"));
		slider.click();
		Actions action = new Actions(driver);
		action.moveToElement(slider, 50, 0).build().perform();
		
		driver.quit();
	}

}
