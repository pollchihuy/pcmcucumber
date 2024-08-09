package coid.juaracoding.pcmcucumber.impl.sociola.login;

import coid.juaracoding.pcmcucumber.page.sociola.SCHomePage;
import coid.juaracoding.pcmcucumber.page.sociola.SCLoginPage;
import coid.juaracoding.pcmcucumber.util.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class LoginPositif {

    public WebDriver driver;
    private static ExtentTest extentTest;
    private SCLoginPage scLoginPage;
    private SCHomePage scHomePage;
    private boolean isValid = true;
    public static String strEstafet;
    public static String strAuth;

    public LoginPositif(){
        isValid = true;
        this.driver = LoginOutlineHooks.driver;
        scLoginPage = new SCLoginPage(driver);
        scHomePage = new SCHomePage(driver);
        extentTest = LoginOutlineHooks.extentTest;
    }

    @BeforeTest
    public void initials(){
        isValid = true;
    }

    @When("TC0011 Mengakses Halaman Website")
    public void tc0011_mengakses_halaman_website(){
        this.driver.get(Constants.URL_LOGIN);
        extentTest.log(LogStatus.PASS, "TC0011 Mengakses Halaman Website");
    }
    @And("TC0011 Mengkosongkan Field Untuk Login")
    public void tc0011_mengkosongkan_field_untuk_login(){
        scLoginPage.getTxtFieldPassword().clear();
        scLoginPage.getTxtFieldUsername().clear();
        extentTest.log(LogStatus.PASS, "TC0011 Mengkosongkan Field Untuk Login");
    }
    @And("^TC0011 Input (.*) Valid")
    public void tc0011_input_username_valid(String username){
//        if(true){
//            isValid = false;
//            extentTest.log(LogStatus.ERROR, "TC0011 Input Username Valid");
//            return;
//        }
        scLoginPage.getTxtFieldUsername().sendKeys("admintiara2");
//        scLoginPage.getTxtFieldUsername().sendKeys(username);
        extentTest.log(LogStatus.PASS, "TC0011 Input Username Valid");
    }
    @And("^TC0011 Input (.*) Valids")
    public void tc0011_input_password_valids(String password){
        strEstafet = "Ini Estafet";
        if(!isValid){
            extentTest.log(LogStatus.SKIP, "TC0011 Input Password Valid");
            return;
        }
        scLoginPage.getTxtFieldPassword().sendKeys("a");
//        scLoginPage.getTxtFieldPassword().sendKeys(password);
        extentTest.log(LogStatus.PASS, "TC0011 Input Password Valid");
    }
    @And("TC0011 Menekan Tombol Login")
    public void tc0011_menekan_tombol_login(){
        if(!isValid){
            extentTest.log(LogStatus.SKIP, "TC0011 Menekan Tombol Login");
            return;
        }
        scLoginPage.getBtnSubmit().click();
        extentTest.log(LogStatus.PASS, "TC0011 Menekan Tombol Login");
    }
    @Then("TC0011 Validasi Label Sukses Di Halaman Home Page")
    public void tc0011_validasi_label_sukses_di_halaman_home_page(){
        if(!isValid){
            extentTest.log(LogStatus.SKIP, "TC0011 Validasi Label Sukses Di Halaman Home Page");
            return;
        }
        String textHome = (scHomePage.getHomepageLogo()==null)?"":scHomePage.getHomepageLogo().getText();
        if(textHome.equals("")){
            isValid = false;
        }
        Assert.assertTrue(textHome.contains("Selamat datang"));
        extentTest.log(LogStatus.PASS, "TC0011 Validasi Label Sukses Di Halaman Home Page");
    }
    @And("TC0011 Klik Tombol Logout")
    public void tc0011_klik_tombol_logout(){
        if(!isValid){
            extentTest.log(LogStatus.SKIP, "TC0011 Validasi Label Sukses Di Halaman Home Page");
            return;
        }
        scHomePage.getBtnLogout().click();
        extentTest.log(LogStatus.PASS, "TC0011 Klik Tombol Logout");
    }
    @Then("TC0011 Validasi Halaman Login")
    public void tc0011_validasi_halaman_login(){
        if(!isValid){
            Assert.assertEquals("a","b");
            extentTest.log(LogStatus.SKIP, "TC0011 Validasi Label Sukses Di Halaman Home Page");
            return;
        }
        String strLabelLogin = scLoginPage.getLabelLogin().getText();
        Assert.assertEquals(strLabelLogin,"SOCIOLLA TUNJUNGAN SURABAYA");
        extentTest.log(LogStatus.PASS, "TC0011 Validasi Halaman Login");
    }

    ///** start  - case ke 1 dari login negatif */
//    @When("Pta002 Mengakses Halaman Website")
//    public void pta002_mengakses_halaman_website(){
//        this.driver.get(Constants.URL_LOGIN);
//        extentTest.log(LogStatus.PASS, "Pta002 Mengakses Halaman Website");
//    }
//
//    @And("Pta002 Mengkosongkan Field Untuk Login")
//    public void pta002_mengkosongkan_field_untuk_login(){
//        PALoginPage.clear();
//        extentTest.log(LogStatus.PASS, "Pta002 Mengkosongkan Field Untuk Login");
//    }
//
//    @And("Pta002 Input Username Kosong")
//    public void pta002_input_username_kosong(){
//        PALoginPage.inputUsername("");
//        extentTest.log(LogStatus.PASS, "Pta002 Input Username Kosong");
//    }
//
//    @And("Pta002 Input Password Kosong")
//    public void pta002_input_password_kosong(){
//        PALoginPage.inputPassword("");
//        extentTest.log(LogStatus.PASS, "Pta002 Input Password Kosong");
//    }
//
//    @And("Pta002 Menekan Tombol Login")
//    public void pta002_menekan_tombol_login(){
//        PALoginPage.clickLogin();
//        extentTest.log(LogStatus.PASS, "Pta002 Menekan Tombol Login");
//    }
//    /** end  - case ke 1 dari login negatif */
//    @Then("Pta002 Validasi Login Error Empty String")
//    public void pta002_validasi_login_error_empty_string(){
//        String strLoginError = PALoginPage.notificationLoginError();
//        Assert.assertEquals("Your username is invalid!",strLoginError);
//        extentTest.log(LogStatus.PASS, "Pta002 Validasi Login Error Empty String");
//    }
//
//    /** start  - case ke 2 dari login negatif */
//    @When("Pta003 Mengkosongkan Field Untuk Login")
//    public void pta003_mengkosongkan_field_untuk_login(){
//        PALoginPage.clear();
//        extentTest.log(LogStatus.PASS, "Pta003 Mengkosongkan Field Untuk Login");
//    }
//
//    @And("Pta003 Input Username Valid")
//    public void pta003_input_username_valid(){
//        PALoginPage.inputUsername("student");
//        extentTest.log(LogStatus.PASS, "Pta003 Input Username Valid");
//    }
//
//    @And("Pta003 Input Password Salah")
//    public void pta003_input_password_salah(){
//        PALoginPage.inputPassword("password@1234");
//        extentTest.log(LogStatus.PASS, "Pta003 Input Password Salah");
//    }
//
//    @And("Pta003 Menekan Tombol Login")
//    public void pta003_menekan_tombol_login(){
//        PALoginPage.clickLogin();
//        extentTest.log(LogStatus.PASS, "Pta003 Menekan Tombol Login");
//    }
//
//    @Then("Pta003 Validasi Login Error Password Salah")
//    public void pta003_validasi_login_error_password_salah(){
//        Assert.assertEquals("Your password is invalid!", PALoginPage.notificationLoginError());
//        extentTest.log(LogStatus.PASS, "Pta003 Validasi Login Error Password Salah");
//    }

/** end  - case ke 2 dari login negatif */

    /** start  - case ke 3 dari login negatif */



}