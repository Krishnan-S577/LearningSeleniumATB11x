package com.testingacademy.ex_02_SeleniumBasics2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab014_QuitVsClose {

    @Test
    public void QuitvClose() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");


        Thread.sleep(5000);
        driver.close();

//         Close - will close the current tab, not the session (not the all tabs)
//         session id != null



//        Thread.sleep(5000);
//
//        driver.quit();
//        // It will close all the tabs. - session id == null
//
    }
}
