package PageFactory;

import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageBasket {
    public WebDriver driver;
    public final Logger LOGGER = LogManager.getLogger(this.getClass());

    public PageBasket(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //    текст ваша корзина
    @FindBy(css = "div.clearfix h1")
    WebElement textYourShoppingCart;
    //    Код товара в корзине
    @FindBy(css = "tr.basket_item:nth-of-type(1) p.art-no")
    WebElement productCodeOne;

    @FindBy(css = "tr.basket_item:nth-of-type(2) p.art-no")
    WebElement productCodeTwo;
    //    Кнопка увеличения кол-ва товара в корзине
    @FindBy(css = "div.input-group.quantity-group span.input-group-btn:nth-of-type(2)")
    WebElement filterPlusShoppingCart;
    //    Кнопка уменьшения кол-ва товара в корзине
    @FindBy(css = "div.input-group.quantity-group span.input-group-btn:nth-of-type(1)")
    WebElement filterMinusShoppingCart;
    //    Кнопка удаления одного товара
    @FindBy(css = "tr.basket_item span.icon-close")
    WebElement buttonIconClose;
    //    Текст после удаления товара в корзине
    @FindBy(xpath = "//*[text()[contains(.,'Товар удалён.')]]")
    WebElement textOfTheDeletedProduct;
    //    ссылка Восстановить товар удаленный в корзине
    @FindBy(xpath = "//a[text()[contains(.,'Восстановить')]]")
    WebElement linkRestore;
    //    Кнопка Оформить заказ в Корзине
    @FindBy(xpath = "//a[text()[contains(.,'Оформить заказ')]]")
    WebElement buttonPlaceAnOrder;
    //    Кнопка "Быстрый заказ" в Корзине
    @FindBy(css = ".basket-summa-right__btn-container a.btn-primary")
    public WebElement buttonQuickOrder;
    //    Поле Имя в Быстром заказе Корзины
    @FindBy(css = "input[id='PERSONAL_NAME']")
    WebElement fieldPersonalName;
    //    Поле телефон в Быстром заказе Корзины
    @FindBy(css = "input[id='PERSONAL_MOBILE']")
    WebElement fieldPersonalMobile;
    @Step("Получаем текст элемента: {textYourShoppingCart.getText()}")
    public String textYourShoppingCart() {
        LOGGER.info("Получаем текст элемента: " + textYourShoppingCart.getText());
        return textYourShoppingCart.getText();
    }
    @Step("Получаем текст элемента: {productCodeOne.getText()}")
    public String productCodeOne() {
        LOGGER.info("Получаем текст элемента: " + productCodeOne.getText());
        return productCodeOne.getText();
    }
    @Step("Получаем текст элемента: {productCodeTwo.getText()}")
    public String productCodeTwo() {
        LOGGER.info("Получаем текст элемента: " + productCodeTwo.getText());
        return productCodeTwo.getText();
    }
    @Step("Клик по элементу filterPlusShoppingCart")
    public PageBasket filterPlusShoppingCart() {
        LOGGER.info("Клик по элементу");
        filterPlusShoppingCart.click();
        return this;
    }
    @Step("Клик по элементу filterMinusShoppingCart")
    public void filterMinusShoppingCart() {
        LOGGER.info("Клик по элементу");
        filterMinusShoppingCart.click();
    }
    @Step("Клик по элементу buttonIconClose")
    public PageBasket buttonIconClose() {
        LOGGER.info("Клик по элементу");
        buttonIconClose.click();
        return this;
    }
    @Step("Получаем текст элемента: {textOfTheDeletedProduct.getText()}")
    public String textOfTheDeletedProduct() {
        LOGGER.info("Получаем текст элемента: " + textOfTheDeletedProduct.getText());
        return textOfTheDeletedProduct.getText();
    }
    @Step("Клик по элементу linkRestore")
    public void linkRestore() {
        LOGGER.info("Клик по элементу");
        linkRestore.click();
    }
    @Step("Клик по элементу buttonPlaceAnOrder")
    public void buttonPlaceAnOrder() {
        LOGGER.info("Клик по элементу");
        buttonPlaceAnOrder.click();
    }
    @Step("Клик по элементу buttonQuickOrder")
    public void buttonQuickOrder() {
        LOGGER.info("Клик по элементу");
        buttonQuickOrder.click();
    }
    @Step("Вносим текст: {name} + в поле")
    public PageBasket fieldPersonalName(String name) {
        LOGGER.info("Вносим текст: " + name + " в поле");
        fieldPersonalName.sendKeys(name);
        return this;
    }
    @Step("Вносим текст: {phone} + в поле")
    public void fieldPersonalMobile(String phone) {
        LOGGER.info("Вносим текст: " + phone + " в поле");
        fieldPersonalMobile.sendKeys(phone);
    }
}
