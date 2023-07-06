package org.example;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class YoutubeTest {

    public static WebDriver driver;

    public static MainMenuPage mainMenu;
    @BeforeClass
    public static void setup() {

        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));

        driver = new ChromeDriver();


        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(ConfProperties.getProperty("youtube"));
    }

    @Test
    public void youtubeTest() {

        mainMenu = new MainMenuPage(driver);

        mainMenu.searchRequest(ConfProperties.getProperty("request"));
        mainMenu.searchClick();
        mainMenu.clickOnVideo();
    }

    @AfterClass
    public static void tearDown() {

        driver.quit();
    }
}
