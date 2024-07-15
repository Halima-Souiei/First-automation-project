package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipDemo {

	public static void main(String[] args) {
		// Open chrome browser
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Open URL application
		driver.get("https://demoqa.com/tool-tips/");

		// Maximize window
		driver.manage().window().maximize();
		WebElement text = driver.findElement(By.id("toolTipButton"));
		String toolTipText = text.getText();
		
		if (toolTipText.equals("Hover me to see")) {
			System.out.println("Pass: tool tip matching expected value");

		} else {
			System.out.println("Fail: tool tip not matching expected value");
		}
		driver.quit();

	}
     
}
