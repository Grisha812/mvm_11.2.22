package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class App
{

    private static File srcFile;

    public static void main(String[] args )
    {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--incognito");
        //options.addArguments("--headless"); //данная опция позволяет запускать тесты не открывая сам браузер (это для экономии ресурса, т.к. браузер много кушает)
        //options.addArguments("start-maximized"); //полноэкранный режим

        WebDriver driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://www.vstu.ru"); //https://www.vstu.ru
        WebElement webElement = driver.findElement(By.cssSelector(".sb-icon-search")); //By.name("q")
        webElement.click();
        webElement.sendKeys("кравец");
        webElement.submit();
/*
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //создание скриншота
        try {
            FileUtils.copyFile(srcFile, new File("./image.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
        //driver.quit();
    }

    WebDriver webDriver;
    WebDriverWait webDriverWait;
    Actions actions;


    public App (WebDriver webDriver, WebDriverWait webDriverWait, Actions actions) {

        this.webDriver = webDriver;
        this.webDriverWait = new WebDriverWait(webDriver, 10);
        this.actions = actions;
        PageFactory.initElements(webDriver, this);
    }

}