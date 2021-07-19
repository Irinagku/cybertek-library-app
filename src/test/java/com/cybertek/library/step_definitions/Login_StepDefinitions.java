package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LoginLibraryPage;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_StepDefinitions {

    LoginLibraryPage loginLibraryPage = new LoginLibraryPage(); // creating object of login page

    @Given("user is on library login page")
    public void user_is_on_library_login_page() {
        String url = ConfigurationReader.getProperty("libraryUrl");
        Driver.getDriver().get(url);

    }

    @When( "librarian enters email and  user enters password")
    public void user_enters_email_and_user_enters_password() {
        // BrowserUtils.sleep(2);
        String email = ConfigurationReader.getProperty("librarian62Email");
        String password = ConfigurationReader.getProperty("librarian62Password");


        loginLibraryPage.emailField.sendKeys(email);
        loginLibraryPage.passwordField.sendKeys(password);

    }

    @When("user is able to click on sing in button")
    public void user_is_able_to_click_on_sing_in_button() {
        //BrowserUtils.sleep(2);
        loginLibraryPage.signInButton.click();

    }

    @Then("user should ne able to see Dashboard page")
    public void user_should_ne_able_to_see_dashboard_page() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.urlContains("dashboard"));
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard"));
        Driver.closeDriver();


    }

    @When("student enters email and  user enters password")
    public void studentEntersEmailAndUserEntersPassword() {
        String email = ConfigurationReader.getProperty("student62Email");
        String password = ConfigurationReader.getProperty("student62Password");
        loginLibraryPage.emailField.sendKeys(email);
        loginLibraryPage.passwordField.sendKeys(password);

    }

    @Then("user should be able to see Book Managment page")
    public void userShouldBeAbleToSeeBookManagmentPage() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.urlContains("books"));
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("books"));
    }

}
