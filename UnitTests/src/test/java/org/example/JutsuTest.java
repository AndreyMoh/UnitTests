package org.example;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JutsuTest {

    public static WebDriver driver;

    public static JutsuMainPage jutsuMainPage;

    @BeforeClass
    public static void setup() {

        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));

        driver = new ChromeDriver();


        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(ConfProperties.getProperty("jutsu"));
    }

    /**
     * тестовый метод для осуществления аутентификации
     */
    @Test
    public void loginTest() {

        jutsuMainPage = new JutsuMainPage(driver);

        jutsuMainPage.sendRequest("Магическая битва");
        jutsuMainPage.searchClick();
        jutsuMainPage.epizodeClick();
        jutsuMainPage.playClick();
        jutsuMainPage.skipAdClick();
    }

    /**
     * осуществление выхода из аккаунта с последующим закрытием окна браузера
     */
//    @AfterClass
//    public static void tearDown() {
//        driver.quit();
//    }
}
