package volgGtu;

import org.example.BaseSeleniumPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileSavePage extends BaseSeleniumPage {

    @FindBy(xpath = "(//a)[116]")
    private WebElement menuStud;

    @FindBy(xpath = "//ul[@class='submenu']//a[contains(text(),'Файловое хранилище')]")
    private WebElement fileSave;

    @FindBy(xpath = "//input[@id='edit-name']")
    private WebElement login;

    @FindBy(xpath = "//input[@id='edit-pass']")
    private WebElement pass;

    @FindBy(xpath = "//a[contains(text(),'Факультет подготовки и переподготовки инженерных к')]")
    private WebElement fpic;

    @FindBy(xpath = "//a[contains(text(),'Выйти')]")
    private WebElement exit;

    @FindBy(xpath = "//a[contains(text(),'Файловое хранилище ВолгГТУ')]")
    private WebElement inStorage;

    public FileSavePage() {
        driver.get("https://www.vstu.ru/");
        PageFactory.initElements(driver, this);
    }

    public FileSavePage auth (String loginValue, String passValue){

        Actions actions = new Actions(driver);
        actions.moveToElement(menuStud).build().perform();
        fileSave.click();
        login.sendKeys(loginValue);
        pass.sendKeys(passValue, Keys.ENTER);
        fpic.click();
        exit.click();
        Assertions.assertEquals("Файловое хранилище ВолгГТУ", inStorage.getText());
        return this;

    }

    /*public LogPass openFileSaver(){

    }*/

}
