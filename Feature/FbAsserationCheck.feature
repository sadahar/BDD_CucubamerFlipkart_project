Feature: FaceBook Login Check with different Crediential

  Background: Comman Steps For Login
    Given User Launch Browser
    When User Open the Url "https://www.flipkart.com/"
    And User Enter the email as "sadaharlogin@gmail.com" and Password as "sadahar047"
    And user click on Login Link

  @sanity
  Scenario: Login Withe Valid Crediential
    Then Page Title should be "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"

  @UAT
  Scenario: User Should able to Use Search attribute
    When User enter the searach attribute as "mens sandals spark"

 #@Functional
 # Scenario Outline: User Should able to Use Search attribute for DDT
 #   When User enter the searach attribute as "mens sandals spark"

   
