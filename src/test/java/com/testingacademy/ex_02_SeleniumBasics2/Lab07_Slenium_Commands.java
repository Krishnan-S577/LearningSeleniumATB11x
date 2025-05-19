package com.testingacademy.ex_02_SeleniumBasics2;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Lab07_Slenium_Commands {

    @Test
    public void Selenium_Commands(){

        EdgeDriver driver = new EdgeDriver();

        driver.get("https://google.com");

        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());


//        driver.quit();

    }
}
