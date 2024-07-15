package testCases;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitDemo {
	public static void main(String[] args) {

		// Initialize ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Open the website

		driver.get("https://example.com");

		// Initialize FluentWait with a timeout of 30 seconds and a polling interval of
		// 2 seconds
		FluentWait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

		// Example of using FluentWait to wait for an element to be visible
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("exampleId")));

		// Perform actions on the element once it's visible
		element.click();

		// Close the browser
		driver.quit();
	}
}
