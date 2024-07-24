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

public class SCRegisterPage {

    private WebDriver driver;
    @FindBy(xpath = "//a[@class='btn btn-primary btn-block']")
    private WebElement btnAddNewData;

    /** Form Component */
    @FindBy(xpath = "//input[@id='SOCO']")
    private WebElement textSocoID;

    /** Text Field Nama Lengkap Nasabah*/
    @FindBy(xpath = "//input[@id='Customer_Name']")
    private WebElement txtNamaLengkapNasabah;

    /** Text Field Nama Lengkap Nasabah*/
    @FindBy(xpath = "//input[@id='Phone_Number']")
    private WebElement textNomorHPTerdaftarDiBCA;

    /** Text Field Nomor Rekening BCA*/
    @FindBy(xpath = "//input[@id='No_Rek_bca']")
    private WebElement textNoRekBCA;

    /** Select QRIS PAY */
    @FindBy(xpath = "//select[@id='Qris_Pay']")
    private WebElement selectQrisPay;

    /** Text Field Nominal Transaksi*/
    @FindBy(xpath = "//input[@id='Amount']")
    private WebElement txtNominalTransaksi;

    /** DatePicker Nomor Rekening BCA*/
    @FindBy(xpath = "//input[@id='Transaction_Date']")
    private WebElement dateTransaksi;

    /** Select Nama Merchant */
    @FindBy(xpath = "//select[@id='Merchant_Name']")
    private WebElement selectNamaMerchant;

    /** Text Field ID RRN */
    @FindBy(xpath = "//input[@id='RRN']")
    private WebElement textIDRRN;

    /** Upload Bukti Transaksi 1 */
    @FindBy(xpath = "//input[@id='Foto_Struk_EDC']")
    private WebElement uploadFotoBuktiTransaksi1;

    /** Upload Bukti Transaksi 2 */
    @FindBy(xpath = "//input[@id='Foto_Struk']")
    private WebElement uploadFotoBuktiTransaksi2;

    /** Upload Bukti Transaksi 3 */
    @FindBy(xpath = "//input[@id='Foto_Transaksi_3']")
    private WebElement uploadFotoBuktiTransaksi3;

    @FindBy(xpath = "//input[@id='btnsubmit']")
    private WebElement btnSubmit;

    public SCRegisterPage(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }


    public WebElement getBtnAddNewData() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnAddNewData));
    }

    public WebElement getTextSocoID() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(textSocoID));
    }

    public WebElement getTxtNamaLengkapNasabah() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(txtNamaLengkapNasabah));
    }

    public WebElement getTextNomorHPTerdaftarDiBCA() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(textNomorHPTerdaftarDiBCA));
    }

    public WebElement getTextNoRekBCA() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(textNoRekBCA));
    }

    public WebElement getSelectQrisPay() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(selectQrisPay));
    }

    public WebElement getTxtNominalTransaksi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(txtNominalTransaksi));
    }

    public WebElement getDateTransaksi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(dateTransaksi));
    }

    public WebElement getSelectNamaMerchant() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(selectNamaMerchant));
    }

    public WebElement getTextIDRRN() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(textIDRRN));
    }

    public WebElement getUploadFotoBuktiTransaksi1() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(uploadFotoBuktiTransaksi1));
    }

    public WebElement getUploadFotoBuktiTransaksi2() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(uploadFotoBuktiTransaksi2));
    }

    public WebElement getUploadFotoBuktiTransaksi3() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(uploadFotoBuktiTransaksi3));

    }

    public WebElement getBtnSubmit() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnSubmit));
    }
}
