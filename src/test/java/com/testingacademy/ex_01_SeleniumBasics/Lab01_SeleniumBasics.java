package com.testingacademy.ex_01_SeleniumBasics;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Lab01_SeleniumBasics {

    @Test
    public void Test_OpenLoginPage(){
        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://app.vwo.com/");
        System.out.println(edgeDriver.getTitle());
    }

}
