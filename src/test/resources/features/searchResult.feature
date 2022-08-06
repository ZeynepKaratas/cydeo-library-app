Feature: A Search functionality on the users page
  As a user, when I login as a librarian and I go to Users page or Book page,
  then table should have following columns:
  Users
  • Actions
  • UserID
  • Full Name
  • Email
  • Group
  • Status

  Books
  . Actions
  . ISBN
  . Name
  . Author
  . Category
  . Year
  . Borrowed By

  @wip @smoke
  Scenario: Table columns names
    Given I am on the login page
    And I login as a librarian
    And I click on "Users" link
    Then table should have following column names:
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |

  @smoke @wip
  Scenario: Table columns names
    Given I am on the login page
    And I login as a librarian
    And I click on "Books" link
    Then table should have following column names:
      | Actions     |
      | ISBN        |
      | Name        |
      | Author      |
      | Category    |
      | Year        |
      | Borrowed By |


