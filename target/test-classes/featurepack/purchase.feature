Feature: I want to purchase a product from the shopping website
 
  Scenario: I want to buy a product from shopping website
  Given The customer logs in using valid credentials
  When The customer navigate to the womens category dropdown
  And click on the required category of purchase
  And select the size and colour of the product
  And click on Add to Cart
  And click on Cart button and proceed to checkout
  And provide the shipping address
  And click on Next and place order
  Then order should be placed successfully
  And order number should appear on the screen
  And close the window
