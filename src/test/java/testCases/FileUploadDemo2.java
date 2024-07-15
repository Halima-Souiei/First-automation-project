package testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FileUploadDemo2 {

	public WebDriver driver;
	public WebDriverWait wait;
	private static String FILEPATH = "C:\\Users\\Alpha\\OneDrive\\Desktop\\seances formation selenium\\Data\\test.txt";

	@BeforeClass
	public void setup() {

		driver = new ChromeDriver();
		driver.navigate().to("https://blueimp.github.io/jQuery-File-Upload/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.manage().window().maximize();

	}

	@Test(priority = 1)
	public void fileUploadTest() throws InterruptedException { 

		WebElement btnUplodFile = driver.findElement(By.cssSelector(".btn.btn-success.fileinput-button"));
		wait.until(ExpectedConditions.elementToBeClickable(btnUplodFile));
		btnUplodFile.click();
		uploadFileWithRobot(FILEPATH);
		Thread.sleep(3000);

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	// File Upload by class Robot
	public void uploadFileWithRobot(String pathFile) {
		
		StringSelection stringSelection = new StringSelection(pathFile);
		Clipboard clipBoard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipBoard.setContents(stringSelection, null);
		
		Robot robot = null;
		try {
			robot = new Robot();
		}catch(AWTException e) {
			e.printStackTrace();
		}
		
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(150);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
