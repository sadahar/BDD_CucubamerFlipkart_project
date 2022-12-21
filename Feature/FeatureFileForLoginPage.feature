Feature: Flipkart Login Page

  Background: Comman Steps For All Scenario
    Given Launching The Chrome Browser
    When User Open  Url as "https://www.flipkart.com/"
    And User Enter email as "sadaharlogin@gmail.com" and enter Password as "sadahar047"
    And User Click on Login button

@Regression
  Scenario: Login flipkart with Different Crediential
    Then Page Title "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"
    When user click on Become Seller Attribute
    Then Page title should be "Sell Online - Become a Online Seller in India | Flipkart Seller Hub"
    When User Should able to navigate previous Page
