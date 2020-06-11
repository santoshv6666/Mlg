package facebook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverclass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream input = new FileInputStream("./Url");
		InputStream input1 = new FileInputStream("Objectrepositories");

		Properties prop = new Properties();
		Properties prop1 = new Properties();
		prop.load(input);
		prop1.load(input1);
		System.out.println(prop.get("username"));

		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\81\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("endurl"));
		
		/*
		 * String locator = (String) prop1.get("usernameobj"); String value = (String)
		 * prop.get("username");
		 * 
		 * driver.findElement(By.xpath(locator)).sendKeys(value); locator = (String)
		 * prop1.get("passwordobj"); value = (String) prop.get("password");
		 * driver.findElement(By.xpath(locator)).sendKeys(value);
		 * 
		 * driver.findElement(By.xpath(locator)).sendKeys(value); locator = (String)
		 * prop1.get("enter"); // value=(String) prop.get("password");
		 * driver.findElement(By.xpath(locator)).click();
		 */		
		String value = (String) prop1.get("usernameobj");
		WebElement element=returnElement(driver,"xpath",value);
		element.sendKeys((String) prop.get("username"));

	}

	public static WebElement returnElement(WebDriver driver, String locaterType, String locaterValue) {
		WebElement element = null;
		switch (locaterType) {
		case "xpath":
			element = driver.findElement(By.xpath(locaterValue));
			break;
		case "id":
			element = driver.findElement(By.id(locaterValue));
			break;

		case "classname":
			element = driver.findElement(By.className(locaterValue));
			break;

		case "linkText":
			element = driver.findElement(By.linkText(locaterValue));
			break;

		}
		return element;

	}
}
