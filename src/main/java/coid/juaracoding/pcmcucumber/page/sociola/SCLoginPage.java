package coid.juaracoding.pcmcucumber.page.sociola;

import coid.juaracoding.pcmcucumber.util.Constants;
import coid.juaracoding.pcmcucumber.util.GlobalFunction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SCLoginPage {
    private WebDriver driver;
    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement txtFieldUsername;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement txtFieldPassword;

    @FindBy(xpath = "//button[@class='login100-form-btn']")
    private WebElement btnSubmit;

    @FindBy(xpath = "//span[@class='login100-form-title p-b-41']")
    private WebElement labelLogin;

//    @FindBy(xpath = "")
//    private WebElement notifLoginError;

    public SCLoginPage(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement getTxtFieldUsername() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(txtFieldUsername));
    }

    public WebElement getTxtFieldPassword() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(txtFieldPassword));
    }

    public WebElement getBtnSubmit() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnSubmit));
    }

    public WebElement getLabelLogin() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(labelLogin));
    }
}