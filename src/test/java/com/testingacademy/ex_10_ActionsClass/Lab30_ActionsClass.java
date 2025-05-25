package com.testingacademy.ex_10_ActionsClass;

import com.testingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab30_ActionsClass extends CommonToAll {

    @Test
    public void TC1(){

        driver.get("https://awesomeqa.com/practice.html");

        driver.manage().window().maximize();


        WebElement firstName = driver.findElement(By.name("firstname"));

        Actions actions = new Actions(driver);

        actions.keyDown(Keys.SHIFT).sendKeys("testing academy").keyUp(Keys.SHIFT).build().perform();

    }




}
