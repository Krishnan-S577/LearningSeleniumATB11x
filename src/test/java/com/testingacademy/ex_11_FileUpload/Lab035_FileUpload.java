package com.testingacademy.ex_11_FileUpload;

import com.testingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Lab035_FileUpload extends CommonToAll {
    @Test
    public void test_fileupload_p5() {

        driver.get("https://awesomeqa.com/selenium/upload.html");
        WebElement uploadFileInput = driver.findElement(By.id("fileToUpload"));

        String working_dir = System.getProperty("user.dir");
        // /Users/promode/IdeaProjects/LearnSeleniumATB11x


        String path_file = working_dir + "com/testingacademy/Data.txt";

        uploadFileInput.sendKeys(path_file);
        driver.findElement(By.name("submit")).click();

    }
}
