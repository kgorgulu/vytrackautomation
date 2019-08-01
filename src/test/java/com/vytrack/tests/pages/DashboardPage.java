package com.vytrack.tests.pages;

import com.vytrack.tests.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends TestBase {
    public DashboardPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[contains(text(),'Fleet') and @class='title title-level-1']")
    public WebElement fleetMenu;

    @FindBy(xpath = "//span[text()='Vehicles']")
    public WebElement vehicles;


}
