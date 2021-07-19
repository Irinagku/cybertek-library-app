Feature: Login functionality

@librarian
  Scenario: user should be able to login as a librarian
    Given user is on library login page
    When librarian enters email and  user enters password
    And  user is able to click on sing in button
    Then user should ne able to see Dashboard page

@student
  Scenario: user should be able to login as a student
    Given user is on library login page
    When student enters email and  user enters password
    And user is able to click on sing in button
    Then user should be able to see Book Managment page