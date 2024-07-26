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

public class SCVerifikasiPage {

    private WebDriver driver;
    @FindBy(xpath = "//input[@class='form-control form-control-sm']")
    private WebElement textSearch;

    @FindBy(xpath = "//tbody/tr[1]/td[11]/a[1]/i[1]")
    private WebElement btnEdit;

    @FindBy(xpath = "//button[@id='btnEdit']")
    private WebElement btnEditForm;

    @FindBy(xpath = "//textarea[@id='Note']")
    private WebElement textAreaNote;

    @FindBy(xpath = "//div[@id='div-Foto_Struk_EDC']//a[1]")
    private WebElement btnRotate90FotoBuktiTransaksi1;

    @FindBy(xpath = "//form[@id='rotate_form1']//a[1]")
    private WebElement btnRotate90FotoBuktiTransaksi2;

    @FindBy(xpath = "//form[@id='rotate_form2']//a[1]")
    private WebElement btnRotate90FotoBuktiTransaksi3;

    /** Routing Component , keluar saat menekan tombol Edit */
    @FindBy(xpath = "//button[@id='btnUpdate']")
    private WebElement btnSaveAfterEdit;

    /** Form Edit Menu Verifikasi */
    /** Text Field Nama Lengkap Nasabah*/
    @FindBy(xpath = "//input[@id='Customer_Name']")
    private WebElement txtNamaLengkapNasabah;

    /** Text Field Nama Lengkap Nasabah*/
    @FindBy(xpath = "//input[@id='Phone_Number']")
    private WebElement textNomorHPTerdaftarDiBCA;

    /** Text Field Nomor Rekening BCA*/
    @FindBy(xpath = "//input[@id='No_Rek_bca']")
    private WebElement textNoRekBCA;

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

    /** Edit + Upload Bukti Transaksi 1 */
    @FindBy(xpath = "//*[@id=\"div-Foto_Struk_EDC\"]/img")
    private WebElement freeKlikFotoBuktiTransaksi1;

    @FindBy(xpath = "//*[@id=\"imgInp_edc\"]")
    private WebElement uploadFotoBuktiTransaksi1;

    @FindBy(xpath = "//*[@id=\"btnupload\"]")
    private WebElement btnSaveEditFotoBuktiTransaksi1;

    /** Edit + Upload Bukti Transaksi 2 */
    @FindBy(xpath = "//*[@id=\"rotate_form1\"]/img")
    private WebElement freeKlikFotoBuktiTransaksi2;

    @FindBy(xpath = "//*[@id=\"imgInp\"]")
    private WebElement uploadFotoBuktiTransaksi2;

    @FindBy(xpath = "//*[@id=\"btnupload2\"]")
    private WebElement btnSaveEditFotoBuktiTransaksi2;

    /** Upload Bukti Transaksi 3 */
    @FindBy(xpath = "//*[@id=\"rotate_form2\"]/img")
    private WebElement freeKlikFotoBuktiTransaksi3;

    @FindBy(xpath = "//input[@id='Foto_Transaksi_3']")
    private WebElement uploadFotoBuktiTransaksi3;

    @FindBy(xpath = "//input[@id='btnsubmit']")
    private WebElement btnSubmit;

    @FindBy(xpath = "//button[@id='btnVerifikasi']")
    private WebElement btnVerifikasi;

    @FindBy(xpath = "//h1[normalize-space()='List Data Register']")
    private WebElement labelPageVerifikasi;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div[1]/form/div/div[2]/div/div[2]/div[1]/img")
    private WebElement imageGambar;

    public SCVerifikasiPage(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement getTextSearch() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(textSearch));
    }

    public WebElement getBtnEdit() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnEdit));
    }

    public WebElement getBtnEditForm() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnEditForm));
    }

    public WebElement getTextAreaNote() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(textAreaNote));
    }

    public WebElement getBtnRotate90FotoBuktiTransaksi1() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnRotate90FotoBuktiTransaksi1));
    }

    public WebElement getBtnRotate90FotoBuktiTransaksi2() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnRotate90FotoBuktiTransaksi2));
    }

    public WebElement getBtnRotate90FotoBuktiTransaksi3() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnRotate90FotoBuktiTransaksi3));
    }

    public WebElement getBtnSaveAfterEdit() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnSaveAfterEdit));
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

    public WebElement getFreeKlikFotoBuktiTransaksi1() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(freeKlikFotoBuktiTransaksi1));
    }

    public WebElement getUploadFotoBuktiTransaksi1() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(uploadFotoBuktiTransaksi1));
    }

    public WebElement getBtnSaveEditFotoBuktiTransaksi1() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnSaveEditFotoBuktiTransaksi1));
    }

    public WebElement getFreeKlikFotoBuktiTransaksi2() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(freeKlikFotoBuktiTransaksi2));
    }

    public WebElement getUploadFotoBuktiTransaksi2() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(uploadFotoBuktiTransaksi2));
    }

    public WebElement getBtnSaveEditFotoBuktiTransaksi2() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnSaveEditFotoBuktiTransaksi2));
    }

    public WebElement getFreeKlikFotoBuktiTransaksi3() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(freeKlikFotoBuktiTransaksi3));
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

    public WebElement getBtnVerifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnVerifikasi));
    }

    public WebElement getLabelPageVerifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(labelPageVerifikasi));
    }

    public WebElement getImageGambar() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(imageGambar));
    }
}