package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


abstract public class AppTest {
    protected WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        BaseSeleniumPage.setDriver(driver);
    }


    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}

/*
    //private static logger logger = (logger) LoggerFactory.getLogger(AppTest.class);
    static WebDriver webDriver;

    @BeforeAll
    static void setDriver(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless"); //данная опция позволяет запускать тесты не открывая сам браузер (для экономии ресурса, т.к. браузер много кушает)

        //options.setPageLoadTimeout(Duration.ofSeconds(10));
        webDriver = new ChromeDriver(options);


    }

*/