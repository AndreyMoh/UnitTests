package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainMenuPage {

    public WebDriver driver;

    public MainMenuPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@class, 'style-scope ytd-rich-item-renderer')]")
    private WebElement firstVideo;

    @FindBy(xpath = "//*[contains(@class, 'style-scope ytd-masthead')]")
    private WebElement searchEl;


    @FindBy(xpath = "//*[contains(@class, 'style-scope ytd-searchbox')]")
    private WebElement searchBtn;

    public void clickOnVideo() {
        firstVideo.click();
    }

    public void searchRequest(String request) {
        searchEl.sendKeys(request);
    }

    public void searchClick() {
        searchBtn.click();
    }
}
