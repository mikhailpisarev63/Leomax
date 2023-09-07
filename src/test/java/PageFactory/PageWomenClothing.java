package PageFactory;

import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageWomenClothing {
    public WebDriver driver;
    public final Logger LOGGER = LogManager.getLogger(this.getClass());

    public PageWomenClothing(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //    фильтр Новизна в каталоге Женская одежда
    @FindBy(css = "div.catalog-sorting-wrapper .control-label:nth-of-type(1)")
    public WebElement linkNewness;
    //    фильтр Скидка каталога в каталоге Женская одежда
    @FindBy(css = "div.catalog-sorting-wrapper .control-label:nth-of-type(2)")
    WebElement linkDiscount;
    //    фильтр Куртки женские в каталоге Женская одежда
    @FindBy(xpath = "//a[text()=' Куртки женские    ']")
    WebElement jacketsCatalogWomenClothing;
    //    Текст h1 Каталога Женской Одежды
    @FindBy(css = "div.catalog .col-xs-12 h1")
    WebElement textCatalogWomenClothing;
    //    Правый слайдер фильтра Куртки женские
    @FindBy(css = "div[id = priceSlider] div.ui-rangeSlider-rightLabel")
    public WebElement sliderRightLabel;
    //    Левый слайдер фильтра Куртки женские
    @FindBy(css = "div[id = priceSlider] div.ui-rangeSlider-leftLabel")
    public WebElement sliderLeftLabel;
    //    Клик по кнопке Посмотреть товары в фильтре
    @FindBy(css = "div.filter-fixed-content a.filter-fixed-button")
    WebElement clickButtonViewProducts;
    //    Чекбокс фильтра цвет - голубой
    @FindBy(css = "div.checkbox label.color_13")
    public WebElement clickCheckboxColorBlue;
    //    Чекбокс фильтра Тип - джинсовка
    @FindBy(xpath = "//div[@class = 'checkbox']//label[text()[contains(.,'джинсовка')]]")
    public WebElement clickCheckboxDenimJacket;
    //    Чекбокс фильтра Размер - 46
    @FindBy(xpath = "//div[@class = 'checkbox']//label[text()[contains(.,'46')]]")
    public WebElement clickCheckbox46;
    //    Чекбокс фильтра Сезон - Демисезон
    @FindBy(xpath = "//div[@class = 'checkbox']//label[text()[contains(.,'Демисезон')]]")
    public WebElement clickCheckboxDemiSeason;
    //    Чекбокс фильтра Бренды - без бренда
    @FindBy(xpath = "//div[@class = 'checkbox']//label[text()[contains(.,'Без бренда')]]")
    public WebElement clickCheckboxWithoutABrand;
    //    Слайдер правый скидки в фильтре
    @FindBy(css = "div[id = discountSlider] div.ui-rangeSlider-rightLabel")
    public WebElement sliderDiscountRightLabel;
    //    Слайдер левый скидки в фильтре
    @FindBy(css = "div[id = discountSlider] div.ui-rangeSlider-leftLabel")
    public WebElement sliderDiscountLeftLabel;
    //    Кнопка фильтра Показать
    @FindBy(css = "div.filters-btn-wrapper button.filters-pointer__apply")
    WebElement buttonFiltersDemonstrate;
    //    текст Найдено (число) товаров
    @FindBy(css = "div.clearfix p.allgoods")
    WebElement textFiltersSearch;
    //    Кнопка корзины в карточке товара
    @FindBy(css = "div.good-item:nth-of-type(1) div.btn_wrapper button")
    WebElement buttonBasketCatalog;
    //    Кнопка "В корзину" в окне "Выберите параметры"
    @FindBy(css = "div.short-good-descr__btn-group button.btn.btn-primary")
    WebElement buttonBasketSelectTheParamers;
    //    Карточка товара 1
    @FindBy(css = "div.good-item:nth-of-type(1) figure.good_hovered")
    public WebElement productCardFirst;
    //    Карточка товара 2
    @FindBy(css = "div.good-item:nth-of-type(2) figure.good_hovered")
    public WebElement productCardFirstTwo;
    //    кнопка выбора размера одежды первый вариант
    @FindBy(css = "div.sizes-radio label.exists-size:nth-of-type(1)")
    WebElement clickSizeWomenOne;
    //    кнопка выбора размера одежды второй вариант
    @FindBy(css = "div.sizes-radio label.exists-size:nth-of-type(2)")
    WebElement clickSizeWomenTwo;
    //    Текст: Товар временно отсутствует на складе.
    @FindBy(css = "div.short-good-descr__btn-group .good-missing-text")
    public WebElement productIsTemporarilyOutOfStock;
    //    текст модального окна "Выбери параметры" при добавление товары в корзину
    @FindBy(xpath = "//div[@class = 'modal-header']/p[text()[contains(.,'Выберите параметры')]]")
    WebElement textModalWindowCard;
    //    фильтр цвета первый вариант в окне "Выберите параметры"
    @FindBy(css = "div.color-list label.color:nth-of-type(1)")
    WebElement filterColorOneInTheModalWindow;
    //    фильтр цвета второй вариант в окне "Выберите параметры"
    @FindBy(css = "div.color-list label.color:nth-of-type(2)")
    WebElement filterColorTwoInTheModalWindow;
    //    Код товара в окне "Выберите параметры"
    @FindBy(css = "div.good-descr span[id='artnumber']")
    WebElement productCodeModalWindows;

    @Step("Клик по элементу linkNewness")
    public void linkNewness() {
        LOGGER.info("Клик по элементу");
        linkNewness.click();
    }
    @Step("Клик по элементу linkDiscount")
    public void linkDiscount() {
        LOGGER.info("Клик по элементу");
        linkDiscount.click();
    }
    @Step("Клик по элементу jacketsCatalogWomenClothing")
    public void jacketsCatalogWomenClothing() {
        LOGGER.info("Клик по элементу");
        jacketsCatalogWomenClothing.click();
    }
    @Step("Получаем текст элемента: {textCatalogWomenClothing.getText()}")
    public String textCatalogWomenClothing() {
        LOGGER.info("Получаем текст элемента: " + textCatalogWomenClothing.getText());
        return textCatalogWomenClothing.getText();
    }
    @Step("Клик по элементу clickButtonViewProducts")
    public void clickButtonViewProducts() {
        LOGGER.info("Клик по элементу");
        clickButtonViewProducts.click();
    }
    @Step("Клик по элементу buttonFiltersDemonstrate")
    public void buttonFiltersDemonstrate() {
        LOGGER.info("Клик по элементу");
        buttonFiltersDemonstrate.click();
    }
    @Step("Получаем текст элемента: {textFiltersSearch.getText()}")
    public String textFiltersSearch() {
        LOGGER.info("Получаем текст элемента: " + textFiltersSearch.getText());
        return textFiltersSearch.getText();
    }
    @Step("Клик по элементу buttonBasketCatalog")
    public void buttonBasketCatalog() {
        LOGGER.info("Клик по элементу");
        buttonBasketCatalog.click();
    }
    @Step("Клик по элементу buttonBasketSelectTheParamers")
    public void buttonBasketSelectTheParamers() {
        LOGGER.info("Клик по элементу");
        buttonBasketSelectTheParamers.click();
    }
    @Step("Получаем текст элемента: {textModalWindowCard.getText()}")
    public String textModalWindowCard() {
        LOGGER.info("Получаем текст элемента: " + textModalWindowCard.getText());
        return textModalWindowCard.getText();
    }
    @Step("Клик по элементу filterColorOneInTheModalWindow")
    public PageWomenClothing filterColorOneInTheModalWindow() {
        LOGGER.info("Клик по элементу");
        filterColorOneInTheModalWindow.click();
        return this;
    }
    @Step("Клик по элементу filterColorTwoInTheModalWindow")
    public PageWomenClothing filterColorTwoInTheModalWindow() {
        LOGGER.info("Клик по элементу");
        filterColorTwoInTheModalWindow.click();
        return this;
    }
    @Step("Клик по элементу clickSizeWomenOne")
    public void clickSizeWomenOne() {
        LOGGER.info("Клик по элементу");
        clickSizeWomenOne.click();
    }
    @Step("Клик по элементу clickSizeWomenTwo")
    public void clickSizeWomenTwo() {
        LOGGER.info("Клик по элементу");
        clickSizeWomenTwo.click();
    }
    @Step("Получаем текст элемента: {productIsTemporarilyOutOfStock.getText()}")
    public String productIsTemporarilyOutOfStock() {
        LOGGER.info("Получаем текст элемента: " + productIsTemporarilyOutOfStock.getText());
        return productIsTemporarilyOutOfStock.getText();
    }
    @Step("Получаем текст элемента: {productCodeModalWindows.getText()}")
    public String productCodeModalWindows() {
        LOGGER.info("Получаем текст элемента: " + productCodeModalWindows.getText());
        return "Код товара: " + productCodeModalWindows.getText();
    }
}
