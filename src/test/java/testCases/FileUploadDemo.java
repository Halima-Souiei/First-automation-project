package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	public static void main(String[] args) {

		// Open chrome browser
		WebDriver driver = new ChromeDriver();
		
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Open URL application
		driver.get("https://demo.guru99.com/test/upload/");

		// Maximize window
		driver.manage().window().maximize();
		WebElement btnUploadFile = driver.findElement(By.id("uploadfile_0"));
		btnUploadFile.sendKeys("C:\\Users\\Alpha\\Downloads\\seances formation selenium\\Data\\test.txt");
		
		
	}

}
