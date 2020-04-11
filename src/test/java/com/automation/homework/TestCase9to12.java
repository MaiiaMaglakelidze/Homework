package com.automation.homework;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase9to12 {
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = DriverFactory.createDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.manage().window().maximize();
    }

    @Test
    public void testCase9(){
        driver.findElement(By.xpath("//a[@href=\"/status_codes\"]")).click();
        driver.findElement(By.xpath("//a[@href=\"status_codes/200\"]")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div/p")).isDisplayed();
    }

    @Test
    public void testCase10(){
        driver.findElement(By.xpath("//a[@href=\"/status_codes\"]")).click();
        driver.findElement(By.xpath("//a[@href=\"status_codes/301\"]")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div/p")).isDisplayed();
    }

    @Test
    public void testCase11(){
        driver.findElement(By.xpath("//a[@href=\"/status_codes\"]")).click();
        driver.findElement(By.xpath("//a[@href=\"status_codes/404\"]")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div/p")).isDisplayed();
    }

    @Test
    public void testCase12(){
        driver.findElement(By.xpath("//a[@href=\"/status_codes\"]")).click();
        driver.findElement(By.xpath("//a[@href=\"status_codes/500\"]")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div/p")).isDisplayed();
    }

    @AfterMethod
    public void teardown(){
        BrowserUtils.wait(2);
        driver.quit();
    }
}
