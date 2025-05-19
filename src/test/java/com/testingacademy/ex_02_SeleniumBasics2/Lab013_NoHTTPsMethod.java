package com.testingacademy.ex_02_SeleniumBasics2;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Lab013_NoHTTPsMethod {


    @Test
    public void TC(){

        EdgeDriver driver = new EdgeDriver();
//        driver.get("bing.com"); // HTTPs is important.
        driver.get("https://bing.com"); // HTTPs is important.

        driver.quit();
    }
}
