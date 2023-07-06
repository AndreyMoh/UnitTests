package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class JutsuMainPage {

    WebDriver driver;

    public JutsuMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"search_b\"]/form/input[2]") private WebElement searchField;
    @FindBy(xpath = "//*[@id=\"search_b\"]/form/input[3]") private WebElement searchBtn;

    @FindBy(xpath = "//*[contains(@class, 'short-btn black video the_hildi')]")
    private WebElement newEpizode;

    @FindBy(xpath = "//*[contains(@class, 'videoAdUiSkipButton videoAdUiAction videoAdUiRedesignedSkipButton')]")
    private WebElement skipAdBtn;

    @FindBy(xpath = "//*[contains(@class, 'vjs-big-play-button')]")
    private WebElement playBtn;

    @FindBy(xpath = "//*[contains(@class, 'vjs-progress-holder vjs-slider vjs-slider-horizontal')]")
    private WebElement progressLine;
    public void sendRequest(String request) {
        searchField.sendKeys(request);
    }

    public void searchClick() {
        searchBtn.click();
    }

    public void epizodeClick() {
        newEpizode.click();
    }
    public void playClick() {
        playBtn.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void skipAdClick() {
        driver.manage().timeouts().implicitlyWait(16, TimeUnit.SECONDS);
        skipAdBtn.click();
    }
}
