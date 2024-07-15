package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) {

		// Open chrome browser
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Open URL application
		String url = "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F";
		driver.get(url);

		// Maximize window
		driver.manage().window().maximize();
		String titlePage = driver.getTitle();
		int titleLength = titlePage.length();

		System.out.println("The title of the page is: " +titlePage);
		System.out.println("The title length is: " +titleLength);
		
		String actualUrl = driver.getCurrentUrl();
		if(actualUrl.equals(url)) {
			System.out.println("Verification successfull - the correct url is opened");
			
		}else {
			System.out.println("Verification failed - the incorrect url is opened");
		}
		
		System.out.println("Actual url is: "+actualUrl);
		System.out.println("Expected url is: "+url);
		
		// Store and print page source
		String sourcePage = driver.getPageSource();
		int lengthSourcePage = sourcePage.length();
		
		System.out.println("Length of the source page is: "+lengthSourcePage);
		driver.quit();

	}

}
