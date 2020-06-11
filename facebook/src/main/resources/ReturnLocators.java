import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReturnLocators {
	WebElement element;
	
	public WebElement returnElement(WebDriver driver,String locaterType, String locaterValue) {
		switch(locaterType) {
		case xpath:
		element= driver.findElement(By.xpath(locaterValue));
					break;
		case :
			element= driver.findElement(By.xpath(locaterValue));
						break;
			
		case Id:
			element= driver.findElement(By.id(locaterValue));
						break;
			
		case xpath:
			element= driver.findElement(By.linkText(locaterValue);
						break;
			
		case xpath:
			element= driver.findElement(By.ByClassName(locaterValue)
						break;
			
		case xpath:
			element= driver.findElement(By.xpath(locaterValue))
						break;
			
		case
		}
		return 
		
		
		
	}

}
