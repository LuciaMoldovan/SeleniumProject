package com.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;



public class NegativeLogInTest {
    @Test
            public void negativelogin() {


        WebDriver driver = new SafariDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("12345");

        WebElement password  = driver.findElement(By.id("password"));
        password.sendKeys("abcdefg");

        WebElement loginButton = driver.findElement(By.className("radius"));
        loginButton.click();




    }
}
