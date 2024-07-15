package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommandDemo {

	public static void main(String[] args) throws InterruptedException {
		// Open chrome browser
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Open URL application
		driver.get("https://demoqa.com/alerts");

		// Back
		driver.navigate().back();
		Thread.sleep(3000);

		// Forward
		driver.navigate().forward();
		Thread.sleep(3000);

		// Refresh
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.quit();

	}

}
