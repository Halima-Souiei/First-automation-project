package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) {

		// Open chrome browser
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Open URL application
		driver.get("https://demoqa.com/droppable/");

		// Maximize window
		driver.manage().window().maximize();

		Actions actions = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		actions.dragAndDrop(source, target).perform();

		// Verify text changed into Dropped!
		String textTarget = target.getText();
		if (textTarget.equals("Dropped!")) {
			System.out.println("Pass: Source is dropped to target as expected");

		} else {
			System.out.println("Fail: Source could not be dropped to target as expected");
		}
		driver.quit();

	}


}
