package com.testingacademy.ex_02_SeleniumBasics2;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Lab08_Maximize_minimize {
    @Description("Open the URL")
    @Test
    public void test_MaxMin(){

        EdgeDriver driver = new EdgeDriver();

        driver.get("https://google.com");

        driver.manage().window().maximize();
        driver.manage().window().minimize();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

    }

}
