package com.vytrack.tests.smoke_tests;

import com.vytrack.tests.TestBase;
import com.vytrack.tests.pages.DashboardPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MenuOptionsTest extends DashboardPage {

    public WebDriver driver=null;

    @BeforeTest
    public void setup() throws Throwable{
        initialize();
    }

    @Test
    public void menuoptionsdriver() throws Throwable{
    login("user156","UserUser123");
    Thread.sleep(5000);
    DashboardPage dashboardPage=new DashboardPage();
    dashboardPage.fleetMenu.click();
    dashboardPage.vehicles.click();
    Thread.sleep(2000);
    String titleFleet=driver.getTitle().toString();
        System.out.println(titleFleet);
        //Assert.assertEquals(titleFleet,"" +);
    }
    @AfterTest
    public void teardown(){
        //driver.close();
        driver.quit();
        driver=null;
    }
}
