package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownList {

	public static void main(String[] args) {

		// Open chrome browser
		WebDriver driver = new ChromeDriver();
 
		// Open URL application
		driver.get("https://demoqa.com/select-menu");

		// Maximize window
		driver.manage().window().maximize();
		
		WebElement dropDownList = driver.findElement(By.id("oldSelectMenu"));
		
		Select list = new Select(dropDownList);
		
		// Select by index
		list.selectByIndex(3);
		
		// Select by value
		list.selectByValue("5");
		
		// Select by visible text
		list.selectByVisibleText("White");

	}

}
