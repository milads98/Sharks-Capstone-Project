package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import core.Base;

public class AddReviewToCanonEos5D extends Base{

	public AddReviewToCanonEos5D() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@title='Canon EOS 5D Camera']")
	private WebElement canonEos5D;
	
	@FindBy(linkText = "Write a review")
	private WebElement writeReviewLink;
	
	@FindBy(id="input-name")
	private WebElement yourNameInput;
	
	@FindBy(id="input-review")
	private WebElement reviewInput;
	
	@FindBy(xpath = "//input[@name='rating'][4]")
	private WebElement ratingRadioButton;

	
	@FindBy(id="button-review")
	private WebElement continueButton;
	
	@FindBy(xpath = "//form[@id='form-review']//div[@class='alert alert-success alert-dismissible']")
	private WebElement verificationMsg;
	
	public void clickOnCanon() {
		canonEos5D.click();
	}
	
	public void clickOnWriteAReview() {
		writeReviewLink.click();
	}
	
	public void fillReviewForm(String username, String review) {
		yourNameInput.sendKeys(username);
		reviewInput.sendKeys(review);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ratingRadioButton.click();
		


		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickOnContinueBtn () {
		continueButton.click();
	}
	
	public boolean verificationIsDisplayed() {
		if (verificationMsg.isDisplayed())
			return true;
		else 
			return false;
	}
	
}
