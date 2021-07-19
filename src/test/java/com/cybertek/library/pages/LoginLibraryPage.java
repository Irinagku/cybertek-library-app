package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLibraryPage {

    public LoginLibraryPage() {
        PageFactory.initElements(Driver.getDriver(), this); // creating constractor
    }

    @FindBy(id = "inputEmail")
    public WebElement emailField;

    @FindBy(id = "inputPassword")
    public WebElement passwordField;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;



}
