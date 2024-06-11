Feature: account summary functionality

  Background: login menu
    Given user is on the home page
    When user clicks on the signin menu
    And user enters valid credentials and clicks on the sign in button

  Scenario: account summary test
    When user clicks Account Summary
    And verify the title should be "Zero - Account Summary"
    And verify that user should be able to see following accounts
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |


  Scenario: account summary with credit Account test
    When user clicks Account Summary
    And verify that the user should be able to see following columns on the Credit Accounts
      | Account     |
      | Credit Card |
      | Balance     |





