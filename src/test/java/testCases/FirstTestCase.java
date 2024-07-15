package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.junit.Assert;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {

		// Open chrome browser
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Open URL application
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		// Maximize window
		driver.manage().window().maximize();

		// Delete cookies
		// driver.manage().deleteAllCookies();

		// Fill e-mail
		driver.findElement(By.id("Email")).clear();

		// driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");

		// Fill email with explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement fieldEmail;
		fieldEmail = wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("Email"))));
		fieldEmail.sendKeys("admin@yourstore.com");

		// Fill password
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");

		// Click on login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// Wait 3 secondes
		Thread.sleep(3000);

		//
		String text = driver.findElement(By.xpath("//*[contains(text(), 'Dashboard')]")).getText();
		Assert.assertEquals(text, "Dashboard");

		// Kill session
		driver.quit();
		// driver.close();
	}

}
