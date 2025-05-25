package com.testingacademy.ex_04_XPath;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab020_MiniProject4_OHRM {

    @Description("Verify Invalid Orange HRM Login")
    @Test
    public void test_OHRM() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement username_xpath = driver.findElement(By.xpath("//input[@name = 'username']"));
        username_xpath.sendKeys("admin");

        WebElement password_xpath = driver.findElement(By.xpath("//input[@name='password']"));

        password_xpath.sendKeys("123456");

        WebElement submit_xpath = driver.findElement((By.xpath("//button[normalize-space()='Login']")));
        submit_xpath.click();

        Thread.sleep(1000);

        WebElement error_msg_xpath = driver.findElement(By.xpath("//p[text()='Invalid credentials']"));
        String error_msg = error_msg_xpath.getText();
        System.out.println(error_msg);

        Assert.assertEquals(error_msg,"Invalid credentials");

        driver.quit();

    }

}
