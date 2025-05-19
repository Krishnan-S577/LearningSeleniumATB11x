package com.testingacademy.ex_03_SeleniumLocators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab016_Locators_ID_ClassName {

    @Description("TC#1 - Verify that with invalid login, error message is displayed!")
    @Test
    public void test_vwo_login_invalid_login() throws InterruptedException {


        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();

        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
        // Step 2 - Find the Password  and enter the 1234.
        // Step 3 - Find the Submit  and click on the button.
        // Step 4 - Wait some time.
        // Step 5 - Verify the message error message.

//        <input type="email" class="text-input W(100%)" name="username" id="login-username" data-qa="hocewoqisi">

        WebElement email_input_box = driver.findElement(By.id("login-username"));
        email_input_box.sendKeys("admin@admin.com");

//        <input type="password" class="text-input W(100%)" name="password" id="login-password" data-qa="jobodapuxe">

        WebElement password_input_box = driver.findElement(By.name("password"));
        password_input_box.sendKeys("1234");

//        <button type="submit" id="js-login-btn" class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)" onclick="login.login(event)" data-qa="sibequkica">
//                <span class="icon loader hidden" data-qa="zuyezasugu"></span>
//                <span data-qa="ezazsuguuy">Sign in</span>
//                </button>

        WebElement submit_button = driver.findElement(By.id("js-login-btn"));
        submit_button.click();


        Thread.sleep(3500);


//        <div class="notification-box-description" id="js-notification-box-msg" data-qa="rixawilomi">Your email, password, IP address or location did not match</div>

        WebElement error_msg = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_msg.getText(),("Your email, password, IP address or location did not match"));

        driver.quit();

    }

}
