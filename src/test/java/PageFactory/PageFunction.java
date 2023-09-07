package PageFactory;

import io.qameta.allure.Step;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static PageFactory.PageWebDriver.*;

public class PageFunction {
    public WebDriver driver;
    public final Logger LOGGER = LogManager.getLogger(this.getClass());

    public PageFunction(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //    Oжидание 10 секунд
    @Step("Неявное ожидание")
    public void waitTenSeconds(By by) {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }

    //    Сделает скриншот после тестов
    @Step("Сделает скриншот как тест упадет")
    public void takeScreenshot() throws IOException {
        Random random = new Random();
        var sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile, new File("C:\\Users\\Public\\Downloads\\screenshot"
                + random.nextInt() + ".png"));
    }

    //    Перезагрузка страницы
    public void refresh() {
        LOGGER.info("Перезагрузка страницы ");
        driver.navigate().refresh();
    }

    @Step("Явное ожидание")
    public void sleep(int sleep) {
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Step("Закрытие модального окна")
    //    Функция проверяет есть ли модальное окно. Если модальное окно есть то его закроет
    public void modalClosing(WebElement element) {
        LOGGER.info("Если " + element + " " + "отображается, выполнить: ");
        if (element.isDisplayed()) {
            pageHomeLeomax.modalClosing();
            sleep(3000);
        }
    }

    @Step("Адаптивная перегрузка метода c выбором действий")
    //    Адаптивная перегрузка метода c выбором действий либо перейти выбрав int select 1 либо клик выбрав int select 2
    public void actionClickOrPerform(int select, WebElement... element) {
        if (select == 1) {
            LOGGER.info("Переход: " + element[0]);
            actions.moveToElement(element[0]).perform();
            if (element.length >= 2) {
                LOGGER.info("Переход: " + element[1]);
                actions.moveToElement(element[1]).perform();
            }
            if (element.length >= 3) {
                LOGGER.info("Переход: " + element[2]);
                actions.moveToElement(element[2]).perform();
            }
        }
        if (select == 2) {
            actions.moveToElement(element[0]).click().perform();
            if (element.length >= 2) {
                actions.moveToElement(element[1]).click().perform();
            }
            if (element.length >= 3) {
                actions.moveToElement(element[2]).click().perform();
            }
            if (element.length >= 4) {
                actions.moveToElement(element[3]).click().perform();
            }
            if (element.length >= 5) {
                actions.moveToElement(element[4]).click().perform();
            }
        }
    }

    //    функция  выполняет смещение элемента по заданным координатам x,y
    @Step("Функция  выполняет смещение элемента по заданным координатам x,y")
    public void actionSliderOffset(WebElement element, int x, int y) {
        LOGGER.info("Cмещение элемента по заданным координатам x,y " + element + x + y);
        actions.moveToElement(element).dragAndDropBy(element, x, y).perform();
    }

    //    функция  выполняет смещение элемента по заданным координатам x,y работая с двумя элементами
    @Step("Функция  выполняет смещение элемента по заданным координатам x,y работая с двумя элементами")
    public void actionSliderOffset(WebElement element, int x, int y, WebElement element1, int x1, int y1) {
        LOGGER.info("Cмещение элемента по заданным координатам x,y работая с двумя элементами: " + element + " " + x
                + " " + y + " и " + element1 + " " + x1 + " " + y1);
        actions.moveToElement(element).dragAndDropBy(element, x, y)
                .dragAndDropBy(element1, x1, y1).perform();
    }

    //    Функция проверяет есть ли модальное окно. Если модальное окно есть то его закроет.
    //    выполнит скролл до нужного веб элемента используя java script
    @Step("Закрытие модального окна используя JS {element}")
    public void javaScriptScrollToTheElement(WebElement element) {
        if (pageHomeLeomax.modalClosing.isDisplayed()) {
            pageHomeLeomax.modalClosing();
            sleep(3000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
        }
    }

    //    Функция проверяет есть ли модальное окно. Если модальное окно есть то его закроет.
    //    выполнит скролл до нужного веб элемента используя action
    @Step("Закрытие модального окна используя action {element}")
    public void modalClosingAndScrollToTheElement(WebElement element) {
        if (pageHomeLeomax.modalClosing.isDisplayed()) {
            pageHomeLeomax.modalClosing();
            sleep(3000);
            actions.moveToElement(element).perform();
        }
    }

    //    Если товара нет на складе то выполнит клик по второму элементу
    @Step("Если товара нет на складе то выполнит клик по второму элементу {element}")
    public void ifTheProductIsNotInStock(WebElement element) {
        if (element.isDisplayed()) {
            pageWomenClothing.clickSizeWomenTwo();
            pageFunction.sleep(500);
        }
    }
    //    public WebElement list (String a, int b) {
    //        return driver.findElement(By.xpath("(//a[text()[contains(.,'"+a+"')]])["+b+"]"));
    //    }
}
