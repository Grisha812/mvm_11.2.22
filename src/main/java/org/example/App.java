/*
package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

abstract public class App {


    private static File srcFile;

    public static void main(String[] args ) throws InterruptedException {
/*
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless"); //данная опция позволяет запускать тесты не открывая сам браузер (для экономии ресурса, т.к. браузер много кушает)
        options.addArguments("start-maximized"); //полноэкранный режим
*/
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
/*
        driver.get("https://www.vstu.ru"); //ВолгГТУ
        WebElement webElement = driver.findElement(By.cssSelector(".sb-icon-search"));
        webElement.click();
        Thread.sleep(1000);
        WebElement webElement2 = driver.findElement(By.cssSelector(".sb-search-input"));
        webElement2.click();
        webElement2.sendKeys("Кравец");
        webElement2.submit();

        //String result = driver.findElement(By.cssSelector("input[value='Кравец']")).getText();
        //Assertions.assertEquals("Кравец", result);


        driver.get("https://www.vstu.ru");
        WebElement webElement3 = driver.findElement(By.cssSelector("a[href='/eng/']"));
        webElement3.click();
        new WebDriverWait(driver, 4).until(ExpectedConditions.urlContains("eng"));

        driver.get("http://dump.vstu.ru/");
        WebElement webElement4 = driver.findElement(By.cssSelector("#edit-name"));
        webElement4.click();
        webElement4.sendKeys("sapr");
        WebElement webElement5 = driver.findElement(By.cssSelector("#edit-pass"));
        webElement5.click();
        webElement5.sendKeys("guest");
        webElement5.submit();
        WebElement webElement6 = driver.findElement(By.cssSelector("a[href='/logout']"));
        webElement6.click();

        String result = driver.findElement(By.cssSelector("#edit-name, #edit-pass")).getText();
        Assertions.assertEquals("", result);


*/

/*
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //создание скриншота
        try {
            FileUtils.copyFile(srcFile, new File("./image.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //driver.quit();
    }

    WebDriverWait webDriverWait;
    Actions actions;


    public App (WebDriver webDriver, WebDriverWait webDriverWait, Actions actions) {

        //this.webDriver = webDriver;
        this.webDriverWait = new WebDriverWait(webDriver, 10);
        this.actions = actions;
        PageFactory.initElements(webDriver, this);
    }

}

*/