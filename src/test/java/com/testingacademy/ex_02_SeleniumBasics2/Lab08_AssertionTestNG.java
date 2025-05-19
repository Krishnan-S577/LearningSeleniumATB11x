package com.testingacademy.ex_02_SeleniumBasics2;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class Lab08_AssertionTestNG {

    @Description("Verify Assertion")
    @Test
    public void test_Assertion(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");

        Assert.assertEquals(driver.getCurrentUrl(),"https://google.com");

// AssertJ Validation
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://google.com");

    }
}
