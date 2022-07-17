package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopsPage extends Base{

	public DesktopsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement logo;
	
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopTab;
	
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;
	
	@FindBy(tagName = "img")
	private List<WebElement> items;
	
	
	public boolean isLogoDisplayed() {
		if (logo.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickOnDesktopTab() {
		Actions action = new Actions(driver);
		action.moveToElement(desktopTab).build().perform();
	}
	
	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
	}
	
	public List<WebElement>elements() {
		List<WebElement> DesktopsItems = items;
		return DesktopsItems;
		
	}
	
	
	
	
	
	
	
	
	
}
