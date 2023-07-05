package org.example;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailPage {

    WebDriver driver;

    public EmailPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@class, 'Button2 Button2_type_link Button2_view_action Button2_size_m Layout-m__compose--pTDsx qa-LeftColumn-ComposeButton ComposeButton-m__root--fP-o9')]")
    private WebElement writeBtn;

    @FindBy(xpath = "//*[contains(@class, 'composeYabbles')]")
    private WebElement EditTextEmailTo;

    @FindBy(xpath = "//*[contains(@class, 'cke_wysiwyg_div cke_reset cke_enable_context_menu cke_editable cke_editable_themed cke_contents_ltr cke_htmlplaceholder')]")
    private WebElement EditTextTo;

    @FindBy(xpath = "//*[contains(@class, 'Button2 Button2_view_action Button2_size_l')]")
    private WebElement SendTextBtn;

    public void entryWrite() {
        writeBtn.click();
    }

    public void InputEmailTo(String email) {
        EditTextEmailTo.sendKeys(email);
    }

    public void InputTextTo(String text) {
        EditTextTo.sendKeys(text);
    }

    public void sendText() {
        SendTextBtn.click();
    }
}
