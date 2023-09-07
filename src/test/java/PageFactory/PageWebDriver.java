package PageFactory;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class PageWebDriver {
    public static WebDriver driver;
    public static PageHomeLeomax pageHomeLeomax;
    public static PageFunction pageFunction;
    public static PageWomenClothing pageWomenClothing;
    public static PageBasket pageBasket;
    public static PageCheckout pageCheckout;
    public static Actions actions;
    public static ChromeOptions chromeOptions;
    public final static Logger LOGGER = LogManager.getLogger(PageWebDriver.class);
    public static String URL = "https://www.leomax.ru/";

    @Step("Настройка драйвера")
    @BeforeClass
    public static void setUp() {
        LOGGER.info("Путь до драйвера");
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        LOGGER.info("Иницилизация драйвера");
        driver = new ChromeDriver(chromeOptions);
        chromeOptions = new ChromeOptions();
//        Запуск без открытия окна true
        chromeOptions.setHeadless(true);
//        Установка размера окна
        chromeOptions.addArguments("window-size=1920,1080");
        driver = new ChromeDriver(chromeOptions);
//        Пока закомментировал, потому что эта настройка говорит открыть окно браузера
//        driver.manage().window().maximize();
        LOGGER.info("Тайминг в 5 секунд");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        LOGGER.info("Получение URL");
        driver.get(URL);
        driver.manage().deleteAllCookies();

        pageFunction = new PageFunction(driver);
        actions = new Actions(driver);
        pageWomenClothing = new PageWomenClothing(driver);
        pageBasket = new PageBasket(driver);
        pageHomeLeomax = new PageHomeLeomax(driver);
        pageCheckout = new PageCheckout(driver);
    }

    @Step("Закрытие драйвера")
    @AfterClass
    public static void tearDown() throws IOException {
//        LOGGER.info("Сделать скриншот при упавшем тесте ");
//        pageFunction.takeScreenshot();
        LOGGER.info("Выходим из драйвера");
        driver.quit();
    }
}
