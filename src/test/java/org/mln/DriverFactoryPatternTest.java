package org.mln;

import org.mln.factory.DriverFactory;
import org.mln.factory.DriverFactoryWithSupplier;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DriverFactoryPatternTest {


    @DataProvider
    public Object[][] getBrowser(){
        String [][] browser= {{"Chrome"}};
        return browser;
    }

    @Test(dataProvider="getBrowser")
    public void driverFactoryTest(String browser){
        WebDriver driver = DriverFactory.getDriver(browser);
        driver.get("https://www.google.com/");
    }
    @Test(dataProvider="getBrowser")
    public void driverFactoryWithSupplierInterfaceTest(String browser){
        WebDriver driver = DriverFactoryWithSupplier.getDriver(browser);
        driver.get("https://www.google.com/");
    }
}
