Feature: account activity functionality

  Background: login menu
    Given user is on the home page
    When user clicks on the signin menu
    And user enters valid credentials and clicks on the sign in button

  Scenario: account activity test with account menu
    When user clicks Account Activity
    And verify the title should be "Zero - Account Activity"
    And verify that user can see on the account menu "Savings"
    And verify that user should be able to see following account menu
      | Savings     |
      | Checking    |
      | Savings     |
      | Loan        |
      | Credit Card |
      | Brokerage   |

  Scenario: account activity test with header
    When user clicks Account Activity
    Then verify that user should be able to see following transactions
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |


