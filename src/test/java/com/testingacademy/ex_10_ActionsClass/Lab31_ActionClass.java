package com.testingacademy.ex_10_ActionsClass;

import com.testingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab31_ActionClass extends CommonToAll {


    @Test
    public void TC_SpiceJet(){

        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();

        WebElement source = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));


        Actions actions = new Actions(driver);

        actions.moveToElement(source).click().sendKeys("BLR").build().perform();
    }

}
