package com.practice.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
     //   System.setProperty("webdriver.gecko.driver","/home/ubuntu/Downloads/geckodriver");
     //FirefoxDriver driver = new FirefoxDriver();

    	  System.setProperty("webdriver.chrome.driver","/home/ubuntu/Downloads/chromedriver");
       ChromeDriver driver = new ChromeDriver();


        driver.get("http://localhost:8091/addressbook");

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        
        
        System.out.println("Selenium test case successfully exected...");
       // driver.quit();
    }
}
