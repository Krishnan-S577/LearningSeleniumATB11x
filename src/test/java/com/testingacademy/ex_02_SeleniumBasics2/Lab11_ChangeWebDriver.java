package com.testingacademy.ex_02_SeleniumBasics2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lab11_ChangeWebDriver {
    public static void main(String[] args) {
//        ChromeDriver driver = new ChromeDriver();
//        driver = new FirefoxDriver();

        WebDriver driver1 = new ChromeDriver();
        driver1 = new FirefoxDriver();
    }
}
