Feature: Login with parameters

  @librarianParam @smoke
  Scenario: Login as librarian 49
    Given I am on the login page
    When I enter username "librarian49@library"
    And I enter password "8l9bsLAN"
    And click the sign in button
    And there should be 178 users
    Then dashboard should be displayed
      #number can be whatever you have there