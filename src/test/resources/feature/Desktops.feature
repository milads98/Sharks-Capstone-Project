@CompleteTest
Feature: Desktops

  Background: common steps
    Given User is on Retail website
    When User click on Desktops tab
    And User click on Show all desktops

  @desktopTest
  Scenario: User verify all items are present in Desktops tab
	  When User click on Desktops tab
    And User click on Show all desktops
    Then User should see all items are present in Desktop page

    
   @addHPLP3065ToCart
   Scenario: User add HP LP 3065 from Desktops tab to the cart
    And User click ADD TO CART option on HP LP3065 item
		And User select quantity 1
		And User click add to Cart button
		Then User should see a message "Success: you have added HP LP 3065 to your Shopping cart!"
		
		
		@addCanonEos5DToCart
  Scenario: User add Canon EOS 5D into shopping cart from Desktops Page
    And User click ADD TO CART option on Canon EOS 5D item
    And User select color from dropdown Red
    And User select quantity "1"
    And User click add to Cart button
    Then User should see a message "Success: You have added Canon EOS 5D to your shopping cart!"
    
    
    @addReviewToCanonEos5D 
  Scenario Outline: User add review to Canon EOS 5D from Desktops tab
    And User click on Canon EOS 5D item
    And User click on write a review link
    And user fill the review information with below information "<yourname>" "<yourReview>" "<Rating>"
    And User click on Continue Button
    Then User should see a message with "Thank you for your review. It has been submitted to the webmaster for approval."

    Examples: 
      | yourname | yourReview                   |
      | yourname | This is one of my fav camera |
      
      