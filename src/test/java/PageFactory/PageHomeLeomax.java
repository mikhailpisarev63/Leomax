package PageFactory;

import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageHomeLeomax {
    public WebDriver driver;
    public final Logger LOGGER = LogManager.getLogger(this.getClass());

    public PageHomeLeomax(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = "div.container.top-banner-flex")
    WebElement topBanner;
    @FindBy(css = "div.catalog .col-xs-12 h1")
    WebElement textCatalog;
    @FindBy(css = ".modal-city-selection__closing")
    public WebElement modalClosing;
    @FindBy(css = "div.header button.header__catalog-button")
    WebElement catalogButton;
    @FindBy(css = "div.col-header_logo .header_logo")
    WebElement headerLogo;
    @FindBy(css = "ul.bottom-header__list li.bottom-header__item:nth-of-type(1) a.bottom-header__link")
    WebElement actionLink;
    @FindBy(css = "ul.bottom-header__list li.bottom-header__item:nth-of-type(2) a.bottom-header__link")
    WebElement linkToBrands;
    @FindBy(css = "ul.bottom-header__list li.bottom-header__item:nth-of-type(3) a.bottom-header__link")
    WebElement liveBroadcast;
    @FindBy(css = "ul.bottom-header__list li.bottom-header__item:nth-of-type(4) a.bottom-header__link")
    WebElement productsFromAdvertising;
    @FindBy(css = ".bottom-header__item .bottom-header__link-liquidation")
    WebElement linkLiquidation;
    @FindBy(css = "ul.header__menu-list li.header__menu-item--profile")
    WebElement loginLink;
    //клик на избранное
    @FindBy(css = "li.header__menu-item:nth-of-type(3) .header__menu-link--default")
    WebElement linkFavourites;
    @FindBy(css = "li.header__menu-item:nth-of-type(4) .header__menu-link--default")
    WebElement linkBasket;
    @FindBy(css = ".search-group .col-search__input")
    WebElement searchInput;
    @FindBy(css = ".search-group .input-group-btn")
    WebElement searchButton;
    //поиск текста Жидкая резина "Фикс Про 3 в 1"
    @FindBy(css = "div.digi-product:nth-of-type(1) div.digi-product__label a")
    WebElement textSearch;
    //ссылка на города в header
    @FindBy(css = "div.top-contacts-header__container div.top-contacts-header__container-city")
    WebElement containerCity;
    //  получаем текс модального окна регионов
    @FindBy(css = ".modal-city-selection p.modal-city-selection__text")
    WebElement modalText;
    @FindBy(css = ".day-good-new__wrap")
    WebElement sliderSwiper;
    @FindBy(css = ".good-of-the-day ul.slick-dots li:nth-of-type(1)")
    WebElement slickDotsOne;
    @FindBy(css = ".good-of-the-day ul.slick-dots li:nth-of-type(2)")
    WebElement slickDotsTwo;
    @FindBy(css = ".good-of-the-day ul.slick-dots li:nth-of-type(3)")
    WebElement slickDotsThree;
    @FindBy(css = ".good-of-the-day ul.slick-dots li:nth-of-type(4)")
    WebElement slickDotsFour;
    @FindBy(css = ".good-of-the-day ul.slick-dots li:nth-of-type(5)")
    WebElement slickDotsFive;
    @FindBy(css = ".good-of-the-day ul.slick-dots li:nth-of-type(6)")
    WebElement slickDotsSix;
//    @FindBy(css = ".good-of-the-day ul.slick-dots li:nth-of-type(7)")
//    WebElement slickDotsSeven;

    //    @FindBy(css = ".good-of-the-day ul.slick-dots li:nth-of-type(8)")
//    WebElement slickDotsEight;
    @FindBy(css = ".banner-block_bottom-slider .slick-dots li:nth-of-type(1)")
    WebElement slickDotsRightOne;
    @FindBy(css = ".banner-block_bottom-slider .slick-dots li:nth-of-type(2)")
    WebElement slickDotsRightTwo;
    @FindBy(css = ".show-all-last-goods a")
    public WebElement linkViewAll;
    @FindBy(css = ".good-list__right.today-tv.slick-arrow")
    WebElement goodListRightSwiper;
    @FindBy(css = ".good-list__left.today-tv.slick-arrow")
    WebElement goodListLeftSwiper;
    @FindBy(css = "ul.action-banners__list li:nth-of-type(1) .banner-block__overlay")
    WebElement actionBannersOne;
    @FindBy(css = "ul.action-banners__list li:nth-of-type(2) .banner-block__overlay")
    WebElement actionBannersTwo;
    @FindBy(css = "ul.menu-desktop__col-level-1 .menu-desktop__item:nth-of-type(1)")
    WebElement catalogMenuWoman;
    @FindBy(css = ".menu-desktop__col-level-1 li.menu-desktop__item:nth-of-type(2)")
    public WebElement catalogMenuMen;
    //    ссылка товары для дома
    @FindBy(css = ".menu-desktop__col-level-1 li.menu-desktop__item:nth-of-type(5)")
    public WebElement householdGoods;
    @FindBy(xpath = "//a[text()=' Куртки женские    ']")
    WebElement womenJacketsCatalog;
    //    ссылка женской одежды-верхняя одежда
    @FindBy(xpath = "//a[text()=' Верхняя одежда    ']")
    WebElement outerwearСatalog;
    @FindBy(xpath = "//a[text()=' Блузы и туники    ']")
    WebElement blousesAndTunics;
    @FindBy(xpath = "//a[text()=' Платья    ']")
    WebElement dresses;
    //    Кнопка Показать все
    @FindBy(css = "div.filter-menu-wrapper button.left-menu-show-hide")
    WebElement buttonShowAll;
    @FindBy(xpath = "//a[text()=' Брюки женские    ']")
    WebElement womenTrousers;
    @FindBy(xpath = "//a[text()=' Термобелье    ']")
    WebElement thermalUnderwear;
    @FindBy(xpath = "//a[text()=' Леггинсы    ']")
    public WebElement leggings;
    @FindBy(xpath = "//a[text()='Куртки мужские']")
    WebElement menJacketsCatalog;
    @FindBy(xpath = "//a[text()='Хобби и аксессуары']")
    public WebElement hobbiesAndAccessories;
    @FindBy(xpath = "(//a[text()='Рыбалка и туризм'])[2]")
    public WebElement fishingAndTourism;

    @Step("Клик на Баннер")
    public void topBanner() {
        LOGGER.info("Клик на Баннер");
        topBanner.click();
    }
    @Step("Получаем текст элемента: {textCatalog.getText()}")
    public String textCatalog() {
        LOGGER.info("Получаем текст элемента: " + textCatalog.getText());
        return textCatalog.getText();
    }
    @Step("Закрыть элемент modalClosing")
    public void modalClosing() {
        LOGGER.info("Закрыть элемент");
        modalClosing.click();
    }
    @Step("Клик по элементу catalogButton")
    public PageHomeLeomax catalogButton() {
        LOGGER.info("Клик по элементу");
        catalogButton.click();
        return this;
    }
    @Step("Клик по элементу headerLogo")
    public void headerLogo() {
        LOGGER.info("Клик по элементу");
        headerLogo.click();
    }
    @Step("Клик по элементу actionLink")
    public PageHomeLeomax actionLink() {
        LOGGER.info("Клик по элементу");
        actionLink.click();
        return this;
    }
    @Step("Клик по элементу linkToBrands")
    public PageHomeLeomax linkToBrands() {
        LOGGER.info("Клик по элементу");
        linkToBrands.click();
        return this;
    }
    @Step("Клик по элементу liveBroadcast")
    public PageHomeLeomax liveBroadcast() {
        LOGGER.info("Клик по элементу");
        liveBroadcast.click();
        return this;
    }
    @Step("Клик по элементу productsFromAdvertising")
    public PageHomeLeomax productsFromAdvertising() {
        LOGGER.info("Клик по элементу");
        productsFromAdvertising.click();
        return this;
    }
    @Step("Клик по элементу linkLiquidation")
    public PageHomeLeomax linkLiquidation() {
        LOGGER.info("Клик по элементу");
        linkLiquidation.click();
        return this;
    }
    @Step("Клик по элементу loginLink")
    public void loginLink() {
        LOGGER.info("Клик по элементу");
        loginLink.click();
    }
    @Step("Клик по элементу linkFavourites")
    public PageHomeLeomax clickFavourites() {
        LOGGER.info("Клик по элементу");
        linkFavourites.click();
        return this;
    }
    @Step("Клик по элементу linkBasket")
    public PageHomeLeomax linkBasket() {
        LOGGER.info("Клик по элементу");
        linkBasket.click();
        return this;
    }
    @Step("Вносим текст: {text} в поле")
    public PageHomeLeomax searchInput(String text) {
        LOGGER.info("Вносим текст: " + text + " в поле");
        searchInput.sendKeys(text);
        return this;
    }
    @Step("Получаем текст элемента: {textSearch.getText()}")
    public String textSearch() {
        LOGGER.info("Получаем текст элемента: " + textSearch.getText());
        return textSearch.getText();
    }
    @Step("Клик по элементу searchButton")
    public void searchButton() {
        LOGGER.info("Клик по элементу");
        searchButton.click();
    }
    @Step("Клик по элементу containerCity")
    public void containerCity() {
        LOGGER.info("Клик по элементу");
        containerCity.click();
    }
    @Step("Клик по элементу modalText")
    public String modalText() {
        LOGGER.info("Получаем текст элемента: " + modalText.getText());
        return modalText.getText();
    }
    @Step("Клик по элементу sliderSwiper")
    public PageHomeLeomax sliderSwiper() {
        LOGGER.info("Клик по элементу");
        sliderSwiper.click();
        return this;
    }
    @Step("Клик по элементу slickDotsOne")
    public PageHomeLeomax slickDotsOne() {
        LOGGER.info("Клик по элементу");
        slickDotsOne.click();
        return this;
    }
    @Step("Клик по элементу slickDotsTwo")
    public PageHomeLeomax slickDotsTwo() {
        LOGGER.info("Клик по элементу");
        slickDotsTwo.click();
        return this;
    }
    @Step("Клик по элементу slickDotsThree")
    public PageHomeLeomax slickDotsThree() {
        LOGGER.info("Клик по элементу");
        slickDotsThree.click();
        return this;
    }
    @Step("Клик по элементу slickDotsFour")
    public PageHomeLeomax slickDotsFour() {
        LOGGER.info("Клик по элементу");
        slickDotsFour.click();
        return this;
    }
    @Step("Клик по элементу slickDotsFive")
    public PageHomeLeomax slickDotsFive() {
        LOGGER.info("Клик по элементу");
        slickDotsFive.click();
        return this;
    }
    @Step("Клик по элементу slickDotsSix")
    public PageHomeLeomax slickDotsSix() {
        LOGGER.info("Клик по элементу");
        slickDotsSix.click();
        return this;
    }

    //    public PageFactory.PageHomeLeomax slickDotsSeven(){
//        slickDotsSeven.click();
//        return this;
//    }
//    public PageFactory.PageHomeLeomax slickDotsEight(){
//        slickDotsEight.click();
//        return this;
//    }
    @Step("Клик по элементу slickDotsRightOne")
    public PageHomeLeomax slickDotsRightOne() {
        LOGGER.info("Клик по элементу");
        slickDotsRightOne.click();
        return this;
    }
    @Step("Клик по элементу slickDotsRightTwo")
    public PageHomeLeomax slickDotsRightTwo() {
        LOGGER.info("Клик по элементу");
        slickDotsRightTwo.click();
        return this;
    }
    @Step("Клик по элементу linkViewAll")
    public PageHomeLeomax linkViewAll() {
        LOGGER.info("Клик по элементу");
        linkViewAll.click();
        return this;
    }
    @Step("Клик по элементу goodListRightSwiper")
    public PageHomeLeomax goodListRightSwiper() {
        LOGGER.info("Клик по элементу");
        goodListRightSwiper.click();
        return this;
    }
    @Step("Клик по элементу goodListLeftSwiper")
    public PageHomeLeomax goodListLeftSwiper() {
        LOGGER.info("Клик по элементу");
        goodListLeftSwiper.click();
        return this;
    }
    @Step("Клик по элементу actionBannersOne")
    public PageHomeLeomax actionBannersOne() {
        LOGGER.info("Клик по элементу");
        actionBannersOne.click();
        return this;
    }
    @Step("Клик по элементу actionBannersTwo")
    public PageHomeLeomax actionBannersTwo() {
        LOGGER.info("Клик по элементу");
        actionBannersTwo.click();
        return this;
    }
    @Step("Клик по элементу catalogMenuWoman")
    public PageHomeLeomax catalogMenuWoman() {
        LOGGER.info("Клик по элементу");
        catalogMenuWoman.click();
        return this;
    }
    @Step("Клик по элементу womenJacketsCatalog")
    public PageHomeLeomax womenJacketsCatalog() {
        LOGGER.info("Клик по элементу");
        womenJacketsCatalog.click();
        return this;
    }
    @Step("Клик по элементу outerwearСatalog")
    public PageHomeLeomax outerwearCatalog() {
        LOGGER.info("Клик по элементу");
        outerwearСatalog.click();
        return this;
    }
    @Step("Клик по элементу blousesAndTunics")
    public PageHomeLeomax blousesAndTunics() {
        LOGGER.info("Клик по элементу");
        blousesAndTunics.click();
        return this;
    }
    @Step("Клик по элементу dresses")
    public PageHomeLeomax dresses() {
        LOGGER.info("Клик по элементу");
        dresses.click();
        return this;
    }
    @Step("Клик по элементу buttonShowAll")
    public PageHomeLeomax buttonShowAll() {
        LOGGER.info("Клик по элементу");
        buttonShowAll.click();
        return this;
    }
    @Step("Клик по элементу womenTrousers")
    public PageHomeLeomax womenTrousers() {
        LOGGER.info("Клик по элементу");
        womenTrousers.click();
        return this;
    }
    @Step("Клик по элементу thermalUnderwear")
    public PageHomeLeomax thermalUnderwear() {
        LOGGER.info("Клик по элементу");
        thermalUnderwear.click();
        return this;
    }
    @Step("Клик по элементу leggings")
    public PageHomeLeomax leggings() {
        LOGGER.info("Клик по элементу");
        leggings.click();
        return this;
    }
    @Step("Клик по элементу menJacketsCatalog")
    public PageHomeLeomax menJacketsCatalog() {
        LOGGER.info("Клик по элементу");
        menJacketsCatalog.click();
        return this;
    }
    @Step("Клик по элементу hobbiesAndAccessories")
    public PageHomeLeomax hobbiesAndAccessories() {
        LOGGER.info("Клик по элементу");
        hobbiesAndAccessories.click();
        return this;
    }
    @Step("Клик по элементу fishingAndTourism")
    public PageHomeLeomax fishingAndTourism() {
        LOGGER.info("Клик по элементу");
        fishingAndTourism.click();
        return this;
    }
}
