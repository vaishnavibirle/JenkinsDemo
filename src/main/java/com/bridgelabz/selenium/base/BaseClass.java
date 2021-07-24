package com.bridgelabz.selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
    public static WebDriver driver;
    @BeforeTest
    public void setUp() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\irg\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.twitter.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        driver.quit();
        Thread.sleep(100);
    }
}
