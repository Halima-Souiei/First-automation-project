package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardEvent {

	public static void main(String[] args) {
		// Open chrome browser
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Open URL application
		driver.get("https://demoqa.com/text-box");

		// Maximize window
		driver.manage().window().maximize();
		
		
		
		
		// Retrieve elements /identify elements
		WebElement fullName = driver.findElement(By.id("userName"));
		WebElement email = driver.findElement(By.id("userEmail"));
		WebElement currentAdress = driver.findElement(By.id("currentAddress"));
		WebElement permanentAdress = driver.findElement(By.id("permanentAddress"));
		
		fullName.sendKeys("Halima souiei");
		email.sendKeys("halima@gmail.com");
		currentAdress.sendKeys("17 rue de test");
		 
		// Copy Paste
		currentAdress.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		currentAdress.sendKeys(Keys.chord(Keys.CONTROL, "c"));
		permanentAdress.sendKeys(Keys.chord(Keys.CONTROL, "v"));
		
		// Click on submit button with JavascriptExecutor
		WebElement btnSubmit = driver.findElement(By.id("submit"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", btnSubmit);
		
		
		driver.quit();		
				
	}

}
