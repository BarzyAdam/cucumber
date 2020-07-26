package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver09 {
    //1- make constructor private
    private Driver09(){

    }
    private static WebDriver driver;

    //2- creating getter
    public static WebDriver getDriver(){
        if(driver==null){
            String browser=configurationReader.getproperty("browser");
            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.chromedriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "chrome-headless":

                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "firefox-headless":
                    driver=new FirefoxDriver(new FirefoxOptions().setHeadless(true));//now its headless
                    break;
                case "chrome-remote":
                    try {
                        ChromeOptions chromeOptions = new ChromeOptions();
                        URL url = new URL("http://18.206.13.27:4444/wd/hub");
                        driver = new RemoteWebDriver(url, chromeOptions);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }
        return driver;
    }
    public static void closeDriver(){
        if(driver !=null){
            driver.quit();
            driver=null;
        }
    }
}
