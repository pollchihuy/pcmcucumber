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

public class SCHomePage {

    private WebDriver driver;
    @FindBy(xpath = "//a[@class='nav-link active']")
    private WebElement btnMenuRegister;

    @FindBy(xpath = "//a[@class='nav-link active']")
    private WebElement btnMenuVerifikasi;

//    @FindBy(xpath = "//strong[contains(text(),'Congratulations student. You successfully logged i')]")
    @FindBy(xpath = "//center[normalize-space()='Selamat datang, admintiara2']")
    private WebElement homepageLogo;

    @FindBy(xpath = "//p[normalize-space()='Logout']")
    private WebElement btnLogout;

    public SCHomePage() {
        this.driver= DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    public SCHomePage(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement getBtnMenuRegister() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnMenuRegister));
    }

    public WebElement getBtnMenuVerifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnMenuVerifikasi));
    }

    public WebElement getHomepageLogo() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(homepageLogo));
    }

    public WebElement getBtnLogout() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnLogout));
    }

    //    public WebElement getBtnMenuRegister() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
//                .until(ExpectedConditions.visibilityOf(btnMenuRegister));
//    }
//
//    public WebElement getBtnMenuVerifikasi() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
//                .until(ExpectedConditions.visibilityOf(btnMenuVerifikasi));
//    }
//
//    public WebElement getHomepageLogo() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
//                .until(ExpectedConditions.visibilityOf(homepageLogo));
//    }
//
//    public WebElement getBtnLogout() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
//                .until(ExpectedConditions.visibilityOf(btnLogout));
//    }
}