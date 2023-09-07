package PageFactory;

import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TestListenerClass extends PageWebDriver{

    public void testFailed() {
        Allure.getLifecycle().addAttachment("Скриншот", "image/png", "png",
                ((TakesScreenshot) PageWebDriver.driver).getScreenshotAs(OutputType.BYTES));
    }
//    @After
//    public void testSuccessful() {
//        Allure.getLifecycle().addAttachment("Скриншот после успешного прохождения теста", "image/png", "png",
//                ((TakesScreenshot) PageWebDriver.driver).getScreenshotAs(OutputType.BYTES));
//    }
}
