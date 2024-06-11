Feature: login functionality
  As a user, I should be able to login

  Background: Login menu
    Given user is on the home page
    When user clicks on the signin menu

  Scenario: positive login test
    And user enters valid credentials and clicks on the sign in button
    Then verify that user can see username


  Scenario Outline: positive login test with DDT
    When user enters "<userName>" username "<passWord>" and clicks on the sign in button
    Then verify that user can see "<userName>"
    Examples:
       | userName | passWord |
       | username | password |


  Scenario Outline: negative login test
    When user enters "<userName>" username "<passWord>"
    And user clicks on the sign in button
    Then verify that user can see "<message>" message
    Examples:
      | userName | passWord | message                         |
      | username |          | Login and/or password are wrong |
      |          |          | Login and/or password are wrong |
      |          | password | Login and/or password are wrong |
      | 1.1      | 1.2      | Login and/or password are wrong |






