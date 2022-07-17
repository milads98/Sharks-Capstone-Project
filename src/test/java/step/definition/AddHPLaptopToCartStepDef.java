package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.AddHPLaptopToCart;
import utilities.Util;

public class AddHPLaptopToCartStepDef extends Base{
	AddHPLaptopToCart addHPLaptopToCart = new AddHPLaptopToCart();

	@When("User click ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		addHPLaptopToCart.clickOnAddToCartButton();
		logger.info("user clicked on add to cart option on item");
	}
	
	@When("User select quantity {string}")
	public void user_select_quantity(String string) {
		addHPLaptopToCart.enterQuantity(string);
		logger.info("user entered quantity");
	}
	
	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		addHPLaptopToCart.clickOnFinalAddToCartButton();
		logger.info("user clicked on final add to cart button");
	}
	
	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		Assert.assertTrue(addHPLaptopToCart.successMessagePresent());
		logger.info("user validated the success message");
		
		
		Util.takeScreenShot();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
