package PageFactory;

import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageCheckout {
    public WebDriver driver;
    public final Logger LOGGER = LogManager.getLogger(this.getClass());

    public PageCheckout(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //    поле Фамилия
    @FindBy(css = "input[id='LAST_NAME']")
    WebElement fieldLastName;
    //    поле Имя
    @FindBy(css = "input[id='NAME']")
    WebElement fieldName;
    //    поле Отчество
    @FindBy(css = "input[id='SECOND_NAME']")
    WebElement fieldSecondName;
    //    поле Телефон
    @FindBy(css = "input[id='SECOND_NAME']")
    WebElement fieldPersonalMobile;
    //    поле Email
    @FindBy(css = "input[id='EMAIL']")
    WebElement fieldEmail;
    @Step("Вносим текст: {lastName} + в поле")
    public PageCheckout fieldLastName(String lastName) {
        LOGGER.info("Вносим текст: " + lastName + " в поле");
        fieldLastName.sendKeys(lastName);
        return this;
    }
    @Step("Вносим текст: {name} + в поле")
    public PageCheckout fieldName(String name) {
        LOGGER.info("Вносим текст: " + name + " в поле");
        fieldName.sendKeys(name);
        return this;
    }
    @Step("Вносим текст: {secondName} + в поле")
    public PageCheckout fieldSecondName(String secondName) {
        LOGGER.info("Вносим текст: " + secondName + " в поле");
        fieldSecondName.sendKeys(secondName);
        return this;
    }
    @Step("Вносим текст: {personalMobile} + в поле")
    public PageCheckout fieldPersonalMobile(String personalMobile) {
        LOGGER.info("Вносим текст: " + personalMobile + " в поле");
        fieldPersonalMobile.sendKeys(personalMobile);
        return this;
    }
    @Step("Вносим текст: {email} + в поле")
    public void fieldEmail(String email) {
        LOGGER.info("Вносим текст: " + email + " в поле");
        fieldEmail.sendKeys(email);
    }
}
