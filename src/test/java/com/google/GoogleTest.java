package com.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {
    @Test
    public void testGoogle(){
        //create driver
        WebDriver driver = new SafariDriver();

        //open page
        String url ="https://www.google.com/";
        driver.get("https://www.google.com/");
        System.out.println("Opening Google page");

        //maximize page
        driver.manage().window().maximize();
        System.out.println("Page is maximised");

        //verificare
        Assert.assertEquals("https://www.google.com/", url);

        //driver closes
        driver.quit();

    }
}
