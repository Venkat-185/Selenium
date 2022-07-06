package com.data;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver; // null
	public static Actions act;


	public static WebDriver launchBrowser(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Venkatesan\\SeleniumCourse\\SelenimTesting2\\Driver\\chromedriver.exe");
			// System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			

		} else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", "(user.dir)" + "\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();

		}
		return driver;

	}

	// get
	public static void launchUrl(String url) {
		driver.get(url);
	}

	// close
	public static void closewindow() {
		driver.close();
	}

	// quit
	public static void quitBrowser() {
		driver.quit();
	}

	// sendkeys
	public static void passInput(WebElement element, String string) {
		element.sendKeys(string);
	}

	// click
	public static void clickTheElement(WebElement element) {
		element.click();
	}

	public static void selectByValue(WebElement element, String value) {
		Select s1 = new Select(element);
		s1.selectByValue(value);
	}

	public static void selectByIndex(WebElement element, int index) {
		Select s2 = new Select(element);
		s2.selectByIndex(index);

	}

	public static void selectByVisibleText(WebElement element, String text) {
		Select s3 = new Select(element);
		s3.selectByVisibleText(text);

	}

	public static void navigateTo(String element) {
		driver.navigate().to(element);

	}

	public static void navigateBack() {
		driver.navigate().back();

	}

	public static void navigateForward() {
		driver.navigate().forward();

	}

	public static void navigateRefresh() {
		driver.navigate().refresh();

	}

	public static void get(String url) {
		driver.get(url);

	}

	public static void alertAccpet() {
		Alert a1 = driver.switchTo().alert();
		a1.accept();
	}

	public static void alertDismiss() {
		Alert a2 = driver.switchTo().alert();
		a2.dismiss();
	}

	public static void takesScreenshot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Venkatesan\\SeleniumCourse\\SelenimTesting2\\Screenshot\\" + name + ".png");
		FileHandler.copy(source, des);
	}

	public static void rightClickMethod(WebElement element) {
		act = new Actions(driver);
		act.contextClick(element).build().perform();
	}

   public static void click(WebElement element) {
	act = new Actions(driver);
	act.click(element).build().perform();
}
   public static void doubleClick(WebElement element) {
	   act = new Actions(driver);
	   act.doubleClick(element).build().perform();
   }
   public static void dragAndDrop(WebElement from, WebElement to) {
	   act = new Actions(driver);
	   act.dragAndDrop(from, to).build().perform();
   }
   public static void moveToElement(WebElement element) {
	   act = new Actions(driver);
	   act.moveToElement(element);
   }
  

}
