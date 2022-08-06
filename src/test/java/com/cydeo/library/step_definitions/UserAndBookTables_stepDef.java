package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.UserAndBookPage;
import com.cydeo.library.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class UserAndBookTables_stepDef {

    UserAndBookPage userAndBookPage = new UserAndBookPage();


    @Given("I click on {string} link")
    public void click_on_link(String link) {

        BrowserUtils.waitForVisibility(userAndBookPage.dashboardLink,10);

       switch (link.toLowerCase()){
           case "dashboard":
               userAndBookPage.dashboardLink.click();
               break;
           case "users":
               userAndBookPage.usersLink.click();
               break;
           case "books":
               userAndBookPage.booksLink.click();
               break;
       }
    }
    @Then("table should have following column names:")
    public void table_should_have_following_column_names(List<String> expectedDataTableHeader) {

        BrowserUtils.waitForVisibility(userAndBookPage.dashboardLink, 10);
        List<String> actualTableHeader = BrowserUtils.getElementsText(userAndBookPage.userTableHeader);
        Assert.assertEquals(expectedDataTableHeader,actualTableHeader);

        List<String> actualTableHeader1 = BrowserUtils.getElementsText(userAndBookPage.bookTableHeader);
        Assert.assertEquals(expectedDataTableHeader,actualTableHeader1);
    }

}
