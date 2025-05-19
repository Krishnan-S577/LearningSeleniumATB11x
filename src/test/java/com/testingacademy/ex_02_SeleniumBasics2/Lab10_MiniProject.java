package com.testingacademy.ex_02_SeleniumBasics2;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab10_MiniProject extends CommonToAll{


    @Test
    public void test01 () throws Exception{

        EdgeDriver driver = new EdgeDriver();
        openBrowser(driver, "https://katalon-demo-cura.herokuapp.com");

        if(driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("TC Passed :) ");
            Assert.assertTrue(true);
        } else{
            //Assert.fail("CURA Healthcare Service text is not visible");
            throw new Exception("CURA Healthcare Service text is not visible");
        }

        closeBrowser(driver);
    }

}
