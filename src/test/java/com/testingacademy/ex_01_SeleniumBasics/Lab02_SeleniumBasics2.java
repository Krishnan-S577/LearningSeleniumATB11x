package com.testingacademy.ex_01_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab02_SeleniumBasics2 {

    @Description("Open the app.vwo.com and verify the title!")
    @Test
    public void test_openLoginpage(){

        EdgeDriver driver = new EdgeDriver();

        driver.get("https://app.vwo.com");

        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        driver.quit();
    }
}
