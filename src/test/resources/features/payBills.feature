Feature: Pay Bills functionality

  Background: login menu
    Given user is on the home page
    When user clicks on the signin menu
    And user enters valid credentials and clicks on the sign in button
    When user clicks Pay Bills

  @wip
  Scenario Outline: pay bills positive test
    And verify the title should be "Zero - Pay Bills"
    When user enters "<amount>" amount "<date>" date "<description>" description and clicks on the pay button
    Then verify that user can see message "The payment was successfully submitted."
    Examples:
      | amount | date       | description  |
      | 33     | 2024-06-06 | credit carte |
      #| 92     | 2024-05-02 | credit carte | *************
      #| 250    | 2024-04-01 | credit carte |



  Scenario Outline: pay bills negative test
    When user enters "<amount>" amount "<date>" date "<description>" description and clicks on the pay button
    Then verify that user can see negative message "Fülle dieses Feld aus."
    Examples:
      | amount | date       | description  |
      | 33     |            | credit carte |
      |        | 2024-05-02 | credit carte |
