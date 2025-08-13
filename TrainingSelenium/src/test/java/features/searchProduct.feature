Feature: Search and Place the order for products

  Scenario: Search Experience for product search in both home and Offers page

    Given User is on GreenCart Landing page
    When User searched with Shortname "Tom" and extracted actual name of product
    Then User searched for "Tom" shortname in offers page
  And Validate product name in offers page matches with landing page
