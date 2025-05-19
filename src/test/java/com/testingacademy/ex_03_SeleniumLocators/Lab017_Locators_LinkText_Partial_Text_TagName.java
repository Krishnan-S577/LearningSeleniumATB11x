package com.testingacademy.ex_03_SeleniumLocators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Lab017_Locators_LinkText_Partial_Text_TagName {

    @Description("Verify vwo")
    @Test
    public void test_login_vwo(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();

        //<a href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
        // class="text-link" data-qa="bericafeqo">Start a free trial</a>

        WebElement LinkText = driver.findElement(By.linkText("Start a free trial"));
        LinkText.click();

        WebElement a_tag_partial_match = driver.findElement(By.partialLinkText("trial"));
        // Start a free trial
        // Start a free
        // Start a
        // Start , Trail, free, a, Star...
        a_tag_partial_match.click();

        driver.quit();


    }

}
