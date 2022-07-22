Feature: User account tests
  As a user, I should be able to login with different users using their correct emails and passwords.
  when I login, I should be able to see username in the account username section.

  @all_accounts
  Scenario Outline: Verify user information <email>
    Given I am on the login page
    When I login using "<email>" and "<password>"
    Then account holder name should be "<name>"
#TEST DATA
    @students
    Examples:
      | email             | password | name            |
      | student27@library | E1uZrsAu | Test Student 27 |
      | student28@library | tJ93UQS3 | Test Student 28 |
      | student29@library | g8EyNm9B | Test Student 29 |
      | student30@library | QX6FWzj6 | Test Student 30 |

    @librarians
    Examples:
      | email | password | name |
      | librarian13@library | YCJCbmU3 | Test Librarian 13 |
      | librarian14@library | bWN7YaaB | Test Librarian 14 |
      | librarian15@library | YLu0ZIMj | Test Librarian 15 |
      | librarian16@library | MnG7Xy72 | Test Librarian 16 |
      | librarian17@library | adE5UAha | Test Librarian 17 |