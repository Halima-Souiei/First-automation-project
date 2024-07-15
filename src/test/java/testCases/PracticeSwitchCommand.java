package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchCommand {

	public static void main(String[] args) {
		// Open chrome browser
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Open URL application
		driver.get("https://demo.guru99.com/test/guru99home/");

		// Maximize window
		driver.manage().window().maximize();
		
		// Switch to the frame 
		driver.switchTo().frame("a077aa5e");
		System.out.println("*** We are switch to the iframe by ID ***");
		WebElement image = driver.findElement(By.xpath("html/body/a/img"));
		image.click();
		System.out.println("*** We are done ***");
		
		driver.close();

	}

}
