package com.automation.homework;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase7 {
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = DriverFactory.createDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.manage().window().maximize();
    }

    @Test
    public void TestCase7(){
        driver.findElement(By.xpath("//a[@href=\"/upload\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"file-upload\"]")).sendKeys("\"C:\\Users\\mayam\\Desktop\\exceptions.PNG\"");
        BrowserUtils.wait(3);
        WebElement uploadBtn = driver.findElement(By.xpath("//input[@id=\"file-submit\"]"));
        uploadBtn.click();

    }

}
