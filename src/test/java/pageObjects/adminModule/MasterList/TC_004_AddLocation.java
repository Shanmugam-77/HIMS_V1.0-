package pageObjects.adminModule.MasterList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageObjects.Basepage;

public class TC_004_AddLocation extends Basepage {

	public TC_004_AddLocation(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[contains(text(),'Location')]")
	WebElement clkAddLocation;

	@FindBy(xpath = "//*[contains(text(),'Add LAD')]")
	WebElement clkLocationMenu;

	@FindBy(xpath = "//*[@id='ladName']")
	WebElement enterLocaName;

	@FindBy(xpath = "//*[@name='orgId'] ")
	WebElement clkOrgList;

	@FindBy(xpath = "//*[contains(@class,'MuiAutocomplete-listbox')]")
	WebElement slctOrgList;

	@FindBy(xpath = "//*[@type='submit']")
	WebElement clkAddBtn;
	
	public void setAddLoc() {
		clkAddLocation.click();

	}

	public void setAddLocOpen() {
		clkLocationMenu.click();
	}

	public void setLocName() {
		enterLocaName.sendKeys("Bengaluru");
	}

	public void setOrgList() {
		clkOrgList.click();
		List<WebElement> orgLists = slctOrgList.findElements(By.tagName("li"));
		for (WebElement orgList : orgLists) {
			if (orgList.getText().equalsIgnoreCase("RVPWIRJ")) {
				orgList.click();
				break;
			}
		}
	}
	
	public void setAdd() {
		clkAddBtn.click();
	}
}
