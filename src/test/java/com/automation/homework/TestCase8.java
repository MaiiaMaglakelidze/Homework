package com.automation.homework;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase8 {
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = DriverFactory.createDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.manage().window().maximize();
    }

    @Test
    public void testCase8(){
        driver.findElement(By.xpath("//a[@href=\"/autocomplete\"]")).click();
        BrowserUtils.wait(2);
        driver.findElement(By.xpath("//input[@id=\"myCountry\"]")).sendKeys("United States of America");
        BrowserUtils.wait(2);
        driver.findElement(By.xpath("//input[@value=\"Submit\"]")).click();
        driver.findElement(By.xpath("//p[@id=\"result\"]")).isDisplayed();

    }

    @AfterMethod
    public void teardown(){
        BrowserUtils.wait(2);
        driver.quit();
    }
}
