import PageFactory.PageWebDriver;
import PageFactory.TestListenerClass;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import io.qameta.allure.Owner;
import io.qameta.allure.junit4.DisplayName;
import jdk.jfr.Description;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(DataProviderRunner.class)
public class LeomaxTest extends PageWebDriver {
    TestListenerClass testListenerClass = new TestListenerClass();
    public final Logger LOGGER = LogManager.getLogger(this.getClass());

    @DisplayName("C01 Закрытие модального окна")
    @Description("Закрытие модального окна")
    @Owner("Писарев Михаил")
    @Test
    public void stage01_modalClosing() {
        testListenerClass.testFailed();
        pageFunction.modalClosing(pageHomeLeomax.modalClosing);
    }

    @DisplayName("C02 Клик на Баннер")
    @Description("Клик на ссылку Баннер и проверка по тексту баннера")
    @Owner("Писарев Михаил")
    @Test
    public void stage02_topBanner() {
        testListenerClass.testFailed();
        String textCatalog = "Тренды осени 2023. Оверсайз";
        stage01_modalClosing();
        pageHomeLeomax.topBanner();
        LOGGER.error("Проверка фактического текста с ожидаемым: " + " " + textCatalog + " = "
                + pageHomeLeomax.textCatalog());
        Assert.assertEquals("Некорректный текст", textCatalog, pageHomeLeomax.textCatalog());
        pageHomeLeomax.headerLogo();
    }

    @Test
    @DisplayName("C03 Клик на ссылку Акции")
    @Description("Клик на ссылку Акции")
    @Owner("Писарев Михаил")
    public void stage03_clickOnTheActionLink() {
        testListenerClass.testFailed();
        stage01_modalClosing();
        pageHomeLeomax.actionLink().headerLogo();
    }

    @Test
    @DisplayName("C04 Клик на ссылку Бренды")
    @Description("Клик на ссылку Бренды")
    @Owner("Писарев Михаил")
    public void stage04_clickALinkToBrands() {
        stage01_modalClosing();
        pageHomeLeomax.linkToBrands().headerLogo();
    }

    @Test
    @DisplayName("C05 Клик на ссылку Live трансляция")
    @Description("Клик на ссылку Live трансляция")
    @Owner("Писарев Михаил")
    public void stage05_liveBroadcast() {
        stage01_modalClosing();
        pageHomeLeomax.liveBroadcast().headerLogo();
    }

    @Test
    @DisplayName("C06 Клик на ссылку Товары из рекламы")
    @Description("Клик на ссылку Товары из рекламы")
    @Owner("Писарев Михаил")
    public void stage06_productsFromAdvertising() {
        stage01_modalClosing();
        pageHomeLeomax.productsFromAdvertising().headerLogo();
    }

    @Test
    @DisplayName("C07 Клик на ссылку Ликвидация")
    @Description("Клик на ссылку Ликвидация")
    @Owner("Писарев Михаил")
    public void stage07_linkLiquidation() {
        stage01_modalClosing();
        pageHomeLeomax.linkLiquidation().headerLogo();
    }

    @Test
    @DisplayName("C08 Клик на Войти")
    @Description("Клик на Войти")
    @Owner("Писарев Михаил")
    public void stage08_exitLoginLink() {
        pageHomeLeomax.loginLink();
        pageFunction.refresh();
    }

    @Test
    @DisplayName("C09 Клик на Избранное")
    @Description("Клик на Избранное")
    @Owner("Писарев Михаил")
    public void stage09_clickFavourites() {
        stage01_modalClosing();
        pageHomeLeomax.clickFavourites().headerLogo();
    }

    @Test
    @DisplayName("C10 Клик на Корзину ")
    @Description("Клик на Корзину")
    @Owner("Писарев Михаил")
    public void stage10_linkBasket() {
        stage01_modalClosing();
        pageHomeLeomax.linkBasket().headerLogo();
    }

    @Test
    @DisplayName("C11 Поиск товара ")
    @Description("Осуществляем поиск товара Жидкая резина и сверяемся по тексту")
    @Owner("Писарев Михаил")
    public void stage11_searchGroup() {
        String text = "Жидкая резина";
        String textSearch = "Жидкая резина \"Фикс Про 3 в 1\"";
        pageFunction.modalClosing(pageHomeLeomax.modalClosing);
        pageHomeLeomax.searchInput(text).searchButton();
        pageFunction.sleep(3000);
        LOGGER.error("Проверка фактического текста с ожидаемым: " + " " + textSearch + " = "
                + pageHomeLeomax.textSearch());
        Assert.assertEquals("Некорректный текст", textSearch, pageHomeLeomax.textSearch());
        pageHomeLeomax.headerLogo();
    }

    @Test
    @DisplayName("C12 Клик на ссылку модального окна Ваш регион")
    @Description("Клик на ссылку модального окна Ваш регион и закрытие модального окна")
    @Owner("Писарев Михаил")
    public void stage12_containerCity() {
        String modalText1 = "Ваш регион";
        pageHomeLeomax.containerCity();
        LOGGER.error("Проверка фактического текста с ожидаемым: " + " " + modalText1 + " = "
                + pageHomeLeomax.modalText());
        Assert.assertEquals("Некорректный текст", modalText1, pageHomeLeomax.modalText());
        pageHomeLeomax.containerCity();
    }

    @Test
    @DisplayName("C13 Клик по карточке  большого свайпера")
    @Description("Клик по карточке большого свайпера по первому элементу")
    @Owner("Писарев Михаил")
    public void stage13_sliderSwiper() {
        stage01_modalClosing();
        pageHomeLeomax.sliderSwiper().headerLogo();
    }

    @Test
    @DisplayName("C14 Клик на пагинацию большого свайпера")
    @Description("Клик на пагинацию большого свайпера по всем элементам пагинации")
    @Owner("Писарев Михаил")
    public void stage14_slickDots() {
        pageFunction.waitTenSeconds(By.cssSelector(".good-of-the-day ul.slick-dots li:nth-of-type(1)"));
        pageHomeLeomax.slickDotsOne().slickDotsTwo().slickDotsThree().slickDotsFour().slickDotsFive()
                .slickDotsSix().headerLogo();
    }

    @Test
    @DisplayName("C15 Переход к правому свайперу на главной страницы")
    @Description("Переход к элементу главной страницы к пагинации правому свайперу клик на 1 и 2 свайпер")
    @Owner("Писарев Михаил")
    public void stage15_slickDotsRight() {
        pageFunction.modalClosing(pageHomeLeomax.modalClosing);
        pageHomeLeomax.slickDotsRightOne().slickDotsRightTwo().headerLogo();
    }

    @Test
    @DisplayName("C16 Переход в раздел на главной страницы: Сегодня в прямом эфире Телемагазина Leomax")
    @Description("Переход в раздел на главной страницы: Сегодня в прямом эфире Телемагазина Leomax" +
            " и клик по кнопке: Смотреть все")
    @Owner("Писарев Михаил")
    public void stage16_linkViewAll() {
        pageFunction.modalClosingAndScrollToTheElement(pageHomeLeomax.linkViewAll);
        pageHomeLeomax.linkViewAll().headerLogo();
    }

    @Test
    @DisplayName("C17 Клик на пагинацию в разделе на главной страницы: Сегодня в прямом эфире Телемагазина Leomax ")
    @Description("Переход к элементу главной страницы к пагинации, клик на 1 и 2 элемент")
    @Owner("Писарев Михаил")
    public void stage17_swiperArrowRight() {
        pageFunction.modalClosingAndScrollToTheElement(pageHomeLeomax.linkViewAll);
        pageHomeLeomax.goodListLeftSwiper().goodListRightSwiper().headerLogo();
    }

    @Test
    @DisplayName("C18 Переход к первому элементу на главной страницы: Хиты продаж")
    @Description("Переход к элементу главной страницы в раздел Хиты продаж и сравнение по тексту")
    @Owner("Писарев Михаил")
    public void stage18_actionBannersOne() {
        String textCatalogOne = "Здоровое питание";
        pageFunction.javaScriptScrollToTheElement(pageHomeLeomax.linkViewAll);
        pageFunction.waitTenSeconds(By.cssSelector("ul.action-banners__list li:nth-of-type(1) .banner-block__overlay"));
        pageHomeLeomax.actionBannersOne().textCatalog();
        LOGGER.error("Проверка фактического текста с ожидаемым: " + " " + textCatalogOne + " = "
                + pageHomeLeomax.textCatalog());
        Assert.assertEquals("Некорректный текст", textCatalogOne, pageHomeLeomax.textCatalog());
        pageHomeLeomax.headerLogo();
    }

    @Test
    @DisplayName("C19 Переход к второму элементу на главной страницы: Хиты продаж")
    @Description("Переход к элементу главной страницы в раздел Хиты продаж и сравнение по тексту")
    @Owner("Писарев Михаил")
    public void stage19_actionBannerTwo() {
        String textCatalogTwo = "Косметика и уход";
        pageFunction.javaScriptScrollToTheElement(pageHomeLeomax.linkViewAll);
        pageFunction.waitTenSeconds(By.cssSelector("ul.action-banners__list li:nth-of-type(2) .banner-block__overlay"));
        pageHomeLeomax.actionBannersTwo().textCatalog();
        LOGGER.error("Проверка фактического текста с ожидаемым: " + " " + textCatalogTwo + " = "
                + pageHomeLeomax.textCatalog());
        Assert.assertEquals("Некорректный текст", textCatalogTwo, pageHomeLeomax.textCatalog());
        pageHomeLeomax.headerLogo();
    }

    @Test
    @DisplayName("C20 Переход из каталога: Женская одежда - Куртки женские")
    @Description("Клик по кнопке Каталог переход Женская одежда и клик на элемент Куртки женские и сравнение по тексту")
    @Owner("Писарев Михаил")
    public void stage20_catalogMenuWomenClothing() {
        String textCatalog = "Куртки женские";
        stage01_modalClosing();
        pageHomeLeomax.catalogButton().catalogMenuWoman().womenJacketsCatalog().textCatalog();
        LOGGER.error("Проверка фактического текста с ожидаемым: " + " " + textCatalog + " = "
                + pageHomeLeomax.textCatalog());
        Assert.assertEquals("Некорректный текст", textCatalog, pageHomeLeomax.textCatalog());
        pageHomeLeomax.headerLogo();
    }

    @Test
    @DisplayName("C21 Переход из каталога: Женская одежда - Верхняя одежда")
    @Description("Клик по кнопке Каталог клик Женская одежда и клик на элемент Верхняя одежда" +
            " в фильтре сравнение по тексту")
    @Owner("Писарев Михаил")
    public void stage21_outerwearCatalog() {
        String textCatalog = "Верхняя одежда";
        stage01_modalClosing();
        pageHomeLeomax.catalogButton().catalogMenuWoman().outerwearCatalog().textCatalog();
        LOGGER.error("Проверка фактического текста с ожидаемым: " + " " + textCatalog + " = "
                + pageHomeLeomax.textCatalog());
        Assert.assertEquals("Некорректный текст", textCatalog, pageHomeLeomax.textCatalog());
        pageHomeLeomax.headerLogo();
    }

    @Test
    @DisplayName("C22 Переход из каталога: Женская одежда - Блузы и туники")
    @Description("Клик по кнопке Каталог клик Женская одежда и клик на элемент Блузы и туники " +
            "в фильтре сравнение по тексту")
    @Owner("Писарев Михаил")
    public void stage22_blousesAndTunics() {
        String textCatalog = "Блузы и туники";
        stage01_modalClosing();
        pageHomeLeomax.catalogButton().catalogMenuWoman().blousesAndTunics().textCatalog();
        LOGGER.error("Проверка фактического текста с ожидаемым: " + " " + textCatalog + " = "
                + pageHomeLeomax.textCatalog());
        Assert.assertEquals("Некорректный текст", textCatalog, pageHomeLeomax.textCatalog());
        pageHomeLeomax.headerLogo();
    }

    @Test
    @DisplayName("C24 Переход из каталога: Женская одежда - Платья")
    @Description("Клик по кнопке Каталог клик Женская одежда и клик на элемент Платья в фильтре сравнение по тексту ")
    @Owner("Писарев Михаил")
    public void stage23_dresses() {
        String textCatalog = "Модные платья 2023";
        stage01_modalClosing();
        pageHomeLeomax.catalogButton().catalogMenuWoman().buttonShowAll().dresses().textCatalog();
        LOGGER.error("Проверка фактического текста с ожидаемым: " + " " + textCatalog + " = "
                + pageHomeLeomax.textCatalog());
        Assert.assertEquals("Некорректный текст", textCatalog, pageHomeLeomax.textCatalog());
        pageHomeLeomax.headerLogo();
    }

    @Test
    @DisplayName("C24 Переход из каталога: Женская одежда - Брюки женские")
    @Description("Клик по кнопке Каталог переход Женская одежда и клик на элемент Брюки женские")
    @Owner("Писарев Михаил")
    public void stage24_womenTrousers() {
        String textCatalog = "Брюки женские";
        stage01_modalClosing();
        pageHomeLeomax.catalogButton().catalogMenuWoman().buttonShowAll().womenTrousers().textCatalog();
        LOGGER.error("Проверка фактического текста с ожидаемым: " + " " + textCatalog + " = "
                + pageHomeLeomax.textCatalog());
        Assert.assertEquals("Некорректный текст", textCatalog, pageHomeLeomax.textCatalog());
        pageHomeLeomax.headerLogo();
    }

    @Test
    @DisplayName("C25 Переход из каталога: Женская одежда - Термобелье")
    @Description("Клик по кнопке Каталог переход Женская одежда и клик на элемент Термобелье")
    @Owner("Писарев Михаил")
    public void stage25_thermalUnderwear() {
        String textCatalog = "Термобелье";
        stage01_modalClosing();
        pageHomeLeomax.catalogButton().catalogMenuWoman().buttonShowAll().thermalUnderwear().textCatalog();
        LOGGER.error("Проверка фактического текста с ожидаемым: " + " " + textCatalog + " = "
                + pageHomeLeomax.textCatalog());
        Assert.assertEquals("Некорректный текст", textCatalog, pageHomeLeomax.textCatalog());
        pageHomeLeomax.headerLogo();
    }

    @Test
    @DisplayName("C26 Переход из каталога: Женская одежда - Легинсы")
    @Description("Клик по кнопке Каталог переход Женская одежда и клик на элемент Легинсы")
    @Owner("Писарев Михаил")
    public void stage26_leggings() {
        String textCatalog = "Леггинсы";
        stage01_modalClosing();
        pageHomeLeomax.catalogButton().catalogMenuWoman().buttonShowAll();
        pageFunction.actionClickOrPerform(1, pageHomeLeomax.leggings);
        pageHomeLeomax.leggings().textCatalog();
        LOGGER.error("Проверка фактического текста с ожидаемым: " + " " + textCatalog + " = "
                + pageHomeLeomax.textCatalog());
        Assert.assertEquals("Некорректный текст", textCatalog, pageHomeLeomax.textCatalog());
        pageHomeLeomax.headerLogo();
    }

    @Test
    @DisplayName("C27 Переход из каталога: Мужская одежда - Куртки мужские")
    @Description("Клик по кнопке Каталог переход Мужская одежда и клик на элемент Куртки мужские")
    @Owner("Писарев Михаил")
    public void stage27_catalogMenuMenClothing() {
        String textCatalog = "Мужские куртки";
        stage01_modalClosing();
        pageHomeLeomax.catalogButton();
        pageFunction.actionClickOrPerform(1, pageHomeLeomax.catalogMenuMen);
        pageHomeLeomax.menJacketsCatalog().textCatalog();
        LOGGER.error("Проверка фактического текста с ожидаемым: " + " " + textCatalog + " = "
                + pageHomeLeomax.textCatalog());
        Assert.assertEquals("Некорректный текст", textCatalog, pageHomeLeomax.textCatalog());
        pageHomeLeomax.headerLogo();
    }

    @Test
    @DisplayName("C28 Переход из каталога: Товары для дома на Хобби и аксессуары")
    @Description("Клик по кнопке Каталог переход на Товары для дома - Хобби и аксессуары" +
            " и клик на элемент Рыбалка и Туризм")
    @Owner("Писарев Михаил")
    public void stage28_householdGoods() {
        String textCatalog = "Хобби и аксессуары";
        stage01_modalClosing();
        pageHomeLeomax.catalogButton();
        pageFunction.actionClickOrPerform(1, pageHomeLeomax.householdGoods, pageHomeLeomax.hobbiesAndAccessories);
        pageHomeLeomax.hobbiesAndAccessories().textCatalog();
        LOGGER.error("Проверка фактического текста с ожидаемым: " + " " + textCatalog + " = "
                + pageHomeLeomax.textCatalog());
        Assert.assertEquals("Некорректный текст", textCatalog, pageHomeLeomax.textCatalog());
        pageHomeLeomax.headerLogo();
    }

    @Test
    @DisplayName("C29 Переход из каталога: Товары для дома - Хобби и аксессуары и на Рыбалка и Туризм")
    @Description("Клик по кнопке Каталог переход и клик на элемент Рыбалка и Туризм")
    @Owner("Писарев Михаил")
    public void stage29_householdGoodsTwo() {
        String textCatalog = "Рыбалка и туризм";
        stage01_modalClosing();
        pageHomeLeomax.catalogButton();
        pageFunction.actionClickOrPerform(1, pageHomeLeomax.householdGoods, pageHomeLeomax.hobbiesAndAccessories,
                pageHomeLeomax.fishingAndTourism);
        pageHomeLeomax.fishingAndTourism().textCatalog();
        LOGGER.error("Проверка фактического текста с ожидаемым: " + " " + textCatalog + " = "
                + pageHomeLeomax.textCatalog());
        Assert.assertEquals("Некорректный текст", textCatalog, pageHomeLeomax.textCatalog());
        pageHomeLeomax.headerLogo();
    }

    //    Каталог Женской одежды
    @Test
    @DisplayName("C30 Поиск по фильтру: скидка-новизне из Каталога: Женской одежды")
    @Description("Клик по кнопке Каталог переход в каталог Женской одежды, клик по фильтру: скидка-новизне")
    @Owner("Писарев Михаил")
    public void stage30_linkNewnessCatalogWomenClothing() {
        String textCatalog = "Женская одежда";
        stage01_modalClosing();
        pageHomeLeomax.catalogButton().catalogMenuWoman();
        LOGGER.error("Проверка фактического текста с ожидаемым: " + " " + textCatalog + " = "
                + pageHomeLeomax.textCatalog());
        Assert.assertEquals("Некорректный текст", textCatalog, pageHomeLeomax.textCatalog());
        pageWomenClothing.linkDiscount();
        pageFunction.javaScriptScrollToTheElement(pageWomenClothing.linkNewness);
        pageWomenClothing.linkNewness();
        pageHomeLeomax.headerLogo();
    }

    @Test
    @DisplayName("C31 Поиск по фильтру: Куртки женские из Каталога: Женской одежды")
    @Description("Клик по кнопке Каталог переход в каталог Женской одежды, клик по фильтру: Куртки женские")
    @Owner("Писарев Михаил")
    public void stage31_linkWomenJacketsCatalogWomenClothing() {
        String textCatalog = "Женская одежда";
        String textJacketsCatalog = "Куртки женские";
        stage01_modalClosing();
        pageHomeLeomax.catalogButton().catalogMenuWoman();
        LOGGER.error("Проверка фактического текста с ожидаемым: " + " " + textCatalog + " = "
                + pageHomeLeomax.textCatalog());
        Assert.assertEquals("Некорректный текст", textCatalog, pageHomeLeomax.textCatalog());
        pageWomenClothing.jacketsCatalogWomenClothing();
        LOGGER.error("Проверка фактического текста с ожидаемым: " + " " + textJacketsCatalog + " = "
                + pageWomenClothing.textCatalogWomenClothing());
        Assert.assertEquals("Некорректный текст", textJacketsCatalog,
                pageWomenClothing.textCatalogWomenClothing());
    }

    @Test
    @DisplayName("C32 Фильтр по правому слайдеру цены и клик по кнопке: Посмотреть товары ")
    @Description("Перемещение фильтра (Правого слайдера) цены с помощью мыши и клик по кнопке посмотреть товары")
    @Owner("Писарев Михаил")
    public void stage32_sliderRightLabelWomenJacketsCatalogWomenClothing() {
        stage31_linkWomenJacketsCatalogWomenClothing();
        pageFunction.actionSliderOffset(pageWomenClothing.sliderRightLabel, -100, 0);
        pageWomenClothing.clickButtonViewProducts();
    }

    @Test
    @DisplayName("C33 Фильтр по левому слайдеру цены и клик по кнопке: Посмотреть товары ")
    @Description("Перемещение фильтра (Левого слайдера) цены с помощью мыши и клик по кнопке посмотреть товары")
    @Owner("Писарев Михаил")
    public void stage33_sliderLeftLabelWomenJacketsCatalogWomenClothing() {
        stage31_linkWomenJacketsCatalogWomenClothing();
        pageFunction.actionSliderOffset(pageWomenClothing.sliderLeftLabel, 80, 0);
        pageWomenClothing.clickButtonViewProducts();
    }

    @Test
    @DisplayName("C34 Поиск товара по фильтру из каталога женской одежды")
    @Description("Фильтр: слайдер по цене, цвет, тип, Размер, Сезон, Бренды, Слайдер скидка")
    @Owner("Писарев Михаил")
    public void stage34_fullFilterOfTheProductCatalogWomen() {
        String textFilters = "Найдено 0 товаров";
        stage31_linkWomenJacketsCatalogWomenClothing();
        pageFunction.actionSliderOffset(pageWomenClothing.sliderLeftLabel, 10, 0);
        pageFunction.actionClickOrPerform(2,
                pageWomenClothing.clickCheckboxColorBlue,
                pageWomenClothing.clickCheckboxDenimJacket,
                pageWomenClothing.clickCheckbox46,
                pageWomenClothing.clickCheckboxDemiSeason,
                pageWomenClothing.clickCheckboxWithoutABrand);
        pageFunction.actionSliderOffset(pageWomenClothing.sliderDiscountLeftLabel, 10, 0,
                pageWomenClothing.sliderDiscountRightLabel, -80, 0);
        pageWomenClothing.buttonFiltersDemonstrate();
        pageFunction.sleep(3000);
        LOGGER.error("Проверка фактического текста с ожидаемым: " + " " + textFilters + " = "
                + pageWomenClothing.textFiltersSearch());
        Assert.assertEquals("Некорректный текст", textFilters, pageWomenClothing.textFiltersSearch());
    }

    @Test
    @DisplayName("C35 Добавление одного товара в корзину")
    @Description("Добавление товара в корзину из каталога женской одежды")
    @Owner("Писарев Михаил")
    public void stage35_addingAnItemToTheCart() {
        String textModalWindowCard = "Выберите параметры";
        String textYourShoppingCart = "Ваша корзина";
        pageFunction.modalClosing(pageHomeLeomax.modalClosing);
        pageHomeLeomax.catalogButton().catalogMenuWoman();
        pageFunction.actionClickOrPerform(1, pageWomenClothing.productCardFirst);
        pageWomenClothing.buttonBasketCatalog();
        LOGGER.error("Проверка фактического текста с ожидаемым: " + " " + textModalWindowCard + " = "
                + pageWomenClothing.textModalWindowCard());
        Assert.assertEquals("Некорректный текст", textModalWindowCard, pageWomenClothing.textModalWindowCard());
        pageFunction.sleep(1000);
        pageWomenClothing.filterColorOneInTheModalWindow().clickSizeWomenOne();
//        Если товара нет на складе кликаем на второй элемент
        pageFunction.ifTheProductIsNotInStock(pageWomenClothing.productIsTemporarilyOutOfStock);
//        Добавим полученный текст кода товара в String из окна "Выберите параметры"
        String textProductCode = pageWomenClothing.productCodeModalWindows();
        pageWomenClothing.buttonBasketSelectTheParamers();
        pageHomeLeomax.linkBasket();
        LOGGER.error("Проверка фактического текста с ожидаемым: " + " " + textYourShoppingCart + " = "
                + pageBasket.textYourShoppingCart());
        Assert.assertEquals("Некорректный текст", textYourShoppingCart, pageBasket.textYourShoppingCart());
        LOGGER.error("Проверка фактического текста с ожидаемым: " + " " + textProductCode + " = "
                + pageBasket.productCodeOne());
        Assert.assertEquals("Некорректный текст", textProductCode, pageBasket.productCodeOne());
        pageHomeLeomax.headerLogo();
    }

    @Test
    @DisplayName("C36 Добавление товара и увеличение кол-ва товара в корзине")
    @Description("Добавление товара в корзину - переход в корзину + увеличение кол-ва товара и удаление")
    @Owner("Писарев Михаил")
    public void stage36_addingAndRemovingAnItemInTheShoppingCart() {
        String text = "Товар удалён. Восстановить";
        stage35_addingAnItemToTheCart();
        pageHomeLeomax.linkBasket();
        pageFunction.sleep(1000);
        pageBasket.filterPlusShoppingCart().filterMinusShoppingCart();
        String textProductCode = pageBasket.productCodeOne();
        pageBasket.buttonIconClose().textOfTheDeletedProduct();
        LOGGER.error("Проверка фактического текста с ожидаемым: " + " " + text + " = "
                + pageBasket.textOfTheDeletedProduct());
        Assert.assertEquals("некорректный текст", text, pageBasket.textOfTheDeletedProduct());
//        Восстановим удаленный товар в корзине и сделаем проверку
        pageBasket.linkRestore();
        LOGGER.error("Проверка фактического текста с ожидаемым: " + " " + textProductCode + " = "
                + pageBasket.productCodeOne());
        Assert.assertEquals("Некорректный текст", textProductCode, pageBasket.productCodeOne());
        pageHomeLeomax.headerLogo();
    }

    @Test
    @DisplayName("C37 Добавление двух разных товаров в корзину")
    @Description("Добавление двух разных товаров в корзину из каталога женской одежды")
    @Owner("Писарев Михаил")
    public void stage37_addingTwoDifferentProductsToTheCart() {
        String textModalWindowCard = "Выберите параметры";
        String textYourShoppingCart = "Ваша корзина";
        pageHomeLeomax.catalogButton().catalogMenuWoman();
        pageFunction.actionClickOrPerform(1, pageWomenClothing.productCardFirst);
        pageWomenClothing.buttonBasketCatalog();
        LOGGER.error("Проверка фактического текста с ожидаемым: " + " " + textModalWindowCard + " = "
                + pageWomenClothing.textModalWindowCard());
        Assert.assertEquals("Некорректный текст", textModalWindowCard, pageWomenClothing.textModalWindowCard());
        pageFunction.sleep(500);
        pageWomenClothing.filterColorOneInTheModalWindow().clickSizeWomenOne();
//        Добавим полученный текст кода товара в String из окна "Выберите параметры"
        String textProductCodeOne = pageWomenClothing.productCodeModalWindows();
        pageWomenClothing.buttonBasketSelectTheParamers();
        pageFunction.refresh();
        pageFunction.actionClickOrPerform(1, pageWomenClothing.productCardFirstTwo);
        pageWomenClothing.buttonBasketCatalog();
        LOGGER.error("Проверка фактического текста с ожидаемым: " + " " + textModalWindowCard + " = "
                + pageWomenClothing.textModalWindowCard());
        Assert.assertEquals("Некорректный текст", textModalWindowCard, pageWomenClothing.textModalWindowCard());
        pageFunction.sleep(500);
        pageWomenClothing.filterColorTwoInTheModalWindow().clickSizeWomenTwo();
//        Добавим полученный текст кода товара в String из окна "Выберите параметры"
        String textProductCodeTwo = pageWomenClothing.productCodeModalWindows();
        pageWomenClothing.buttonBasketSelectTheParamers();
        pageFunction.sleep(500);
        pageHomeLeomax.linkBasket();
        LOGGER.error("Проверка фактического текста с ожидаемым: " + " " + textYourShoppingCart + " = "
                + pageBasket.textYourShoppingCart());
        Assert.assertEquals("Некорректный текст", textYourShoppingCart, pageBasket.textYourShoppingCart());
        LOGGER.error("Проверка фактического текста с ожидаемым: " + " " + textProductCodeOne + " = "
                + pageBasket.productCodeTwo());
        Assert.assertEquals("Некорректный текст", textProductCodeOne, pageBasket.productCodeTwo());
        LOGGER.error("Проверка фактического текста с ожидаемым: " + " " + textProductCodeTwo + " = "
                + pageBasket.productCodeOne());
        Assert.assertEquals("Некорректный текст", textProductCodeTwo, pageBasket.productCodeOne());
        pageHomeLeomax.headerLogo();
    }

    @DataProvider()
    public static Object[][] testExampleProvider() {
        return new Object[][]{
                {"Писарев Михаил", "9171095411"},
                {"Писарев Михаил", "9171095411"},
                {"Писарев Михаил", "9171095411"}
        };
    }

    @Test
    @Ignore
    @DisplayName("Оформление заказа из Корзины")
    @Description("Оформление заказа с помощью нескольких параметров валидных и не валидных значений")
    @Owner("Писарев Михаил")
    @UseDataProvider("testExampleProvider")
    public void stage38_makingAnOrder(String name, String personalMobile) {
        stage35_addingAnItemToTheCart();
        pageFunction.actionClickOrPerform(1, pageBasket.buttonQuickOrder);
        pageBasket.buttonQuickOrder();
        pageBasket.fieldPersonalName(name).fieldPersonalMobile(personalMobile);
    }
}