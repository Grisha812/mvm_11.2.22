package volgGtu;

import io.qameta.allure.Attachment;
import org.example.BaseSeleniumPage;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BaseSeleniumPage {


    @FindBy(xpath = "//span[@class='sb-icon-search']")
    private WebElement search;

    @FindBy(xpath = "//input[@id='search']")
    private WebElement inputSearch;


    public MainPage() {
        driver.get("https://www.vstu.ru/");
        PageFactory.initElements(driver, this);
    }

    public MainPage auth (String inputSearchValue){


        inputSearch.sendKeys(inputSearchValue);
        inputSearch.submit();
        return this;

    }
}