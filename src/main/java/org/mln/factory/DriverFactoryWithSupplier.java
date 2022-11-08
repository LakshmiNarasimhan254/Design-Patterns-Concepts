package org.mln.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.Supplier;

public class DriverFactoryWithSupplier {

    private DriverFactoryWithSupplier(){}

    private final static Supplier<WebDriver> CHROME =()->{
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    };
    private final static Supplier<WebDriver> FIREFOX =()->{
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    };
    private final static Supplier<WebDriver> IE =()->{
        WebDriverManager.iedriver().setup();
        return new InternetExplorerDriver();
    };

    private static Map<String,Supplier<WebDriver>>browserMap = new HashMap<>();

    static {
        browserMap.put("chrome",CHROME);
        browserMap.put("firefox",FIREFOX);
        browserMap.put("internetexplorer",IE);
    }

    public static WebDriver getDriver(String browser){
        browser = browser.trim().toLowerCase();
        return browserMap.get(browser).get();
    }


}
