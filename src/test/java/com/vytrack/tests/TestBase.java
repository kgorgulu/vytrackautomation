package com.vytrack.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public TestBase(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(id="prependedInput")
    public WebElement username;

    @CacheLookup
    @FindBy(id="prependedInput2")
    public WebElement password;

    @CacheLookup
    @FindBy(id="_submit")
    public WebElement loginButton;
    public static WebDriver driver;

   public static void initialize() throws Throwable{
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.get("http://qa2.vytrack.com/");
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       driver.manage().window().maximize();

   }
    public  void login(String user, String pass) throws Throwable{
        driver.findElement(By.id("prependedInput")).sendKeys(user);
        driver.findElement(By.id("prependedInput2")).sendKeys(pass);
        driver.findElement(By.id("_submit")).click();
        Thread.sleep(2000);
    }
}
