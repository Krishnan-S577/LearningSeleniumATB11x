package com.testingacademy.ex_02_SeleniumBasics2;

import io.qameta.allure.Description;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab05_WebDriver {
@Description("Verify Open URL")
    @Test
    public void testOpenURL(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());
    System.out.println(driver.getPageSource());
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");
        driver.quit();
    }
}
