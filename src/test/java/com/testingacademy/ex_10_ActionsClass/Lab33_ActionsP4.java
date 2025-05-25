package com.testingacademy.ex_10_ActionsClass;

import com.testingacademy.CommonToAll;


import org.openqa.selenium.Keys;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Lab33_ActionsP4  extends CommonToAll {

    @Test
    public void test_page_up_page_down() {
        driver.get("https://thetestingacademy.com/");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();

    }
}
