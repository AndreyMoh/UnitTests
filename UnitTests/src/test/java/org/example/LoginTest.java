package org.example;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    public static LoginPage loginPage;
    public static ProfilePage profilePage;
    public static EmailPage emailPage;
    public static WebDriver driver;

    /**
     * осуществление первоначальной настройки
     */
    @BeforeClass
    public static void setup() {

        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));

        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        profilePage = new ProfilePage(driver);
        emailPage = new EmailPage(driver);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(ConfProperties.getProperty("loginpage"));
    }

    /**
     * тестовый метод для осуществления аутентификации
     */
    @Test
    public void loginTest() {

        loginPage.inputLogin(ConfProperties.getProperty("login"));

        loginPage.clickLoginBtn();

        loginPage.inputPasswd(ConfProperties.getProperty("password"));
        loginPage.clickLoginBtn();

        profilePage.entryMainMenu();
        profilePage.entryMail();

        emailPage.entryWrite();
        emailPage.InputEmailTo(ConfProperties.getProperty("vovaLogin"));
        emailPage.InputTextTo(ConfProperties.getProperty("lorem"));
        emailPage.sendText();

        String user = profilePage.getUserName();
        System.out.println(user);
        System.out.println(ConfProperties.getProperty("lorem"));

        profilePage.entryMenu();
    }

    /**
     * осуществление выхода из аккаунта с последующим закрытием окна браузера
     */
    @AfterClass
    public static void tearDown() {
//        profilePage.entryMenu();
        profilePage.userLogout();
        driver.quit();
    }


}