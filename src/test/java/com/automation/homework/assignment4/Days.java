package com.automation.homework.assignment4;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Days {
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = DriverFactory.createDriver("chrome");
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");
        driver.manage().window().maximize();
    }

    @Test
    public void days(){
        driver.findElement(By.xpath("//label[@id=\"gwt-debug-cwCheckBox-Monday-label\"]")).click();
        String day = driver.findElement(By.xpath("//label[@id=\"gwt-debug-cwCheckBox-Monday-label\"]")).getText();
        System.out.println("You have selected " + day);
        driver.findElement(By.xpath("//label[@id=\"gwt-debug-cwCheckBox-Monday-label\"]")).click();
    }

    @AfterMethod
    public void tearDown(){
        BrowserUtils.wait(3);
        driver.quit();
    }


}
