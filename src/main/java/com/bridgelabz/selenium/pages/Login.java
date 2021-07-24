package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass {
    @FindBy(linkText = "Log in")
    WebElement login_btn;

    @FindBy(name = "session[username_or_email]")
    WebElement username;

    @FindBy(name = "session[password]")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div[2]/form/div/div[3]/div/div")
    WebElement login;


    public Login(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public String login_with_credentials() throws InterruptedException {
        login_btn.click();
        Thread.sleep(3000);
        username.sendKeys("vaishnavibirle2209@gmail.com");
        password.sendKeys("Saniya@123");
        Thread.sleep(3000);
        login.click();
        Thread.sleep(3000);
        return driver.getTitle();
    }
}
