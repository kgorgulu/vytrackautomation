package com.vytrack.tests.smoke_tests;

import com.vytrack.tests.TestBase;
import com.vytrack.tests.pages.DashboardPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MenuOptionsTest extends DashboardPage {


    public MenuOptionsTest(){
        super();
    }

    @BeforeTest
    public void setup() throws Throwable{
        initialize();
        driver=new ChromeDriver();
        driver.get("http://qa2.vytrack.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void menuoptionsdriver() throws Throwable{
    login("user156","UserUser123");
    Thread.sleep(3000);
    DashboardPage dashboardPage=new DashboardPage();
    dashboardPage.fleetMenu.click();
    dashboardPage.vehicles.click();
    Thread.sleep(4000);
    String titleFleet=driver.getTitle().toString();
        Assert.assertEquals(titleFleet,"Car - Entities - System - Car - Entities - System");
        driver.findElement(By.xpath("//span[contains(text(),'Customers') and @class]")).click();

        driver.findElement(By.xpath("//span[text()='Accounts']")).click();
        Thread.sleep(4000);
        String titleAccounts=driver.getTitle().toString();
        Assert.assertEquals(titleAccounts,"Accounts - Customers");

    }

    @Test(priority = 2)
    public  void menuoptionmanager(){

    }

    @AfterTest
    public void teardown(){
        driver.close();

    }
}
