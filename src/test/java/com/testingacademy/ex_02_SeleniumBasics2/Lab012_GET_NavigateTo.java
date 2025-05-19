package com.testingacademy.ex_02_SeleniumBasics2;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Lab012_GET_NavigateTo  {

    @Description("Open the URL")
    @Test
    public void test02(){
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://google.com");

        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
    }
}
