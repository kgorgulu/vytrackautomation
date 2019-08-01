package com.vytrack.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;

   public static void initialize() throws Throwable{
       WebDriverManager.chromedriver().setup();


   }
    public  static void login(String user, String pass) throws Throwable{
        driver.findElement(By.id("prependedInput")).sendKeys(user);
        driver.findElement(By.id("prependedInput2")).sendKeys(pass);
        driver.findElement(By.id("_submit")).click();
        Thread.sleep(2000);
    }

    public static void waitvisibilityof(WebElement element){

    }
}
