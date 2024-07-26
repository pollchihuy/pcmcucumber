package coid.juaracoding.pcmcucumber.page.sociola;

import coid.juaracoding.pcmcucumber.connection.DriverSingleton;
import coid.juaracoding.pcmcucumber.util.Constants;
import coid.juaracoding.pcmcucumber.util.GlobalFunction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SCImageOnline {

    private WebDriver driver;
    @FindBy(xpath = "//input[@name='uploadfile']")
    private WebElement uploadGambar1;

    @FindBy(xpath = "//input[@name='uploadfile2']")
    private WebElement uploadGambar2;

//    @FindBy(xpath = "//strong[contains(text(),'Congratulations student. You successfully logged i')]")
    @FindBy(xpath = "//input[@value='OK']")
    private WebElement btnOk;

    @FindBy(xpath = "/html/body/div/div[4]/span")
    private WebElement labelResult;

    public SCImageOnline() {
        this.driver= DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    public SCImageOnline(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement getUploadGambar1() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(uploadGambar1));
    }

    public WebElement getUploadGambar2() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(uploadGambar2));
    }

    public WebElement getBtnOk() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnOk));
    }

    public WebElement getLabelResult() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(labelResult));
    }
}