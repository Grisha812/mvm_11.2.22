package volgGtu;

import org.example.BaseSeleniumPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navigation extends BaseSeleniumPage {

    @FindBy(xpath = "(//span[contains(text(),'Университет')])[2]")
    private WebElement univer;

    @FindBy(xpath = "(//span[contains(text(),'Образование')])[2]")
    private WebElement obraz;

    @FindBy(xpath = "(//span[contains(text(),'Наука')])[2]")
    private WebElement nauka;

    @FindBy(xpath = "(//span[contains(text(),'Развитие')])[2]")
    private WebElement razvit;

    @FindBy(xpath = "(//span[contains(text(),'Сотрудничество')])[2]")
    private WebElement souz;

    @FindBy(xpath = "(//span[contains(text(),'Справочник')])[2]")
    private WebElement spravka;

    // локаторы на заголовки разделов
    @FindBy(xpath = "//h1[contains(text(),'Университет сегодня')]")
    private WebElement universitet;

    @FindBy(xpath = "//h1[contains(text(),'Образование в ВолгГТУ')]")
    private WebElement learn;

    @FindBy(xpath = "//h1[contains(text(),'Наука в ВолгГТУ')]")
    private WebElement science;

    @FindBy(xpath = "//h1[contains(text(),'Вопросы перспективного развития')]")
    private WebElement evolution;

    @FindBy(xpath = "//h1[contains(text(),'Сотрудничество')]")
    private WebElement ourjob;

    @FindBy(xpath = "//h1[contains(text(),'Справочник')]")
    private WebElement findbook;


    public Navigation() {
        driver.get("https://www.vstu.ru/");
        PageFactory.initElements(driver, this);
    }

    public Navigation auth (){

        univer.click();
        obraz.click();
        nauka.click();
        razvit.click();
        souz.click();
        spravka.click();
        // проверка соответствия названия заголовка раздела
        Assertions.assertEquals("Университет сегодня", universitet.getText());
        Assertions.assertEquals("Образование в ВолгГТУ", learn.getText());
        Assertions.assertEquals("Наука в ВолгГТУ", science.getText());
        Assertions.assertEquals("Вопросы перспективного развития", evolution.getText());
        Assertions.assertEquals("Сотрудничество", ourjob.getText());
        Assertions.assertEquals("Справочник", findbook.getText());

        return this;

    }


}
