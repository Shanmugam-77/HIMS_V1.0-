
package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Basepage {

	public WebDriver driver;

	public Basepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); //initialize the webelements (@Findby)
	}

	// provide a getter for driver
	public WebDriver getDriver() {
		return driver;
	}
}
