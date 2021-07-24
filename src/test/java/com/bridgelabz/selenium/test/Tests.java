package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.pages.Login;
import org.testng.annotations.Test;

public class Tests extends BaseClass {

    @Test
    public void login_test() throws InterruptedException {
        Login login = new Login(driver);
        login.login_with_credentials();
    }
}
