package step.definition;

import java.util.List;


import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopsPage;
import utilities.Util;

public class DesktopStepDef extends Base{ 
	DesktopsPage desktopsPage = new DesktopsPage();

	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		Assert.assertTrue(desktopsPage.isLogoDisplayed()); 
		logger.info("user is on Retail website page");
	}
	
	
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktopsPage.clickOnDesktopTab();
		logger.info("user clicked on Desktops tab");
	}
	
	
	@And("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktopsPage.clickOnShowAllDesktops();
		logger.info("user clicked on Show All Desktops");
		
	}
	
	
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		List<WebElement> items = desktopsPage.elements();
		for (WebElement element : items) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("alt") + " is present in this page");
			
		}
		Util.takeScreenShot();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
