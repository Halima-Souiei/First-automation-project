package testCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommand {

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

				// Fill e-mail
				WebElement email = driver.findElement(By.id("Email"));
				email.clear();
				String attValue = email.getAttribute("value");
				email.sendKeys(attValue);
				System.out.println("The attribute value is : " +attValue);
				
				WebElement password = driver.findElement(By.id("Password"));
				password.clear();
				password.sendKeys("admin");
				String attValue1 = password.getAttribute("type");
				System.out.println("The attribute value is : " +attValue1);
				
				Dimension dimensions = email.getSize();
				System.out.println("hight: " +dimensions.height);
				System.out.println("width: " +dimensions.width);
				
				Point point = password.getLocation();
				System.out.println("x coordinate" +point.x);
				System.out.println("y coordinate" +point.y);
				
				// Verifier si le bouton login afficher vrai ou faux
				WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
				
				boolean result = btnLogin.isDisplayed();
				System.out.println(result);
				
				// Verifier si le bouton login activer vrai ou faux 
				boolean result1 = btnLogin.isEnabled();
				System.out.println(result1);
				
				// Verifier si le bouton login existe
				List<WebElement> loginBtn =  driver.findElements(By.xpath("//button[@type='submit']"));
				if(loginBtn.size()!=0) {
					System.out.println("The login button is exist");
				
				}
				else {
					System.out.println("The login button is not exist");
				}
				
				
				 
				
				

	}

}
