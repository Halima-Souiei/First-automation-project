package testCases;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchWindows {

	public static void main(String[] args) {
		// Open chrome browser
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Open URL application
		driver.get("https://demoqa.com/browser-windows");

		// Maximize window
		driver.manage().window().maximize();

		// Store and print the name of the first window
		String handle = driver.getWindowHandle();
		System.out.println(handle);

		WebElement newWindowMessage = driver.findElement(By.id("messageWindowButton"));
		newWindowMessage.click();

		// Store and print of all the names of windows opened
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);

		// Pass a window handle to another window
		for (String handle1 : driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
			System.out.println(handle1);

		}

		driver.quit();

	}

}
