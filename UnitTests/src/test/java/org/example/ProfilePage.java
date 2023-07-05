package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

    //*[@id="__next"]/div/header/div[4]/div/a[1]/div/div[1]
    public WebDriver driver;

    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * определение локатора меню пользователя
     */
    @FindBy(xpath = "//*[contains(@class, 'ListItem MenuItem MenuItem_mail')]")
    private WebElement mailItem;
    @FindBy(xpath = "//*[contains(@class, 'UserID-Avatar')]")
    private WebElement mainMenu;

    @FindBy(xpath = "//*[contains(@class, 'user-account__name')]")
    private WebElement userMenu;

    @FindBy(xpath = "//*[contains(@class, 'menu__item menu__item_type_link count-me legouser__menu-item legouser__menu-item_action_exit legouser__menu-item legouser__menu-item_action_exit')]")
    private WebElement logoutBtn;

    public String getUserName() {
        return userMenu.getText();
    }

    public void entryMenu() {
        userMenu.click();
    }
    public void entryMainMenu() {
        mainMenu.click();
    }

    public void userLogout() {
        logoutBtn.click();
    }

    public void entryMail() {
        WebDriver a = driver.switchTo().frame(driver.findElement(By.className("UserWidget-Iframe")));
        a.findElement(By.xpath("//a[@href='https://mail.yandex.ru']")).click();
    }
}