package coid.juaracoding.pcmcucumber.impl.sociola.login;

import coid.juaracoding.pcmcucumber.page.sociola.SCHomePage;
import coid.juaracoding.pcmcucumber.page.sociola.SCLoginPage;
import coid.juaracoding.pcmcucumber.page.sociola.SCRegisterPage;
import coid.juaracoding.pcmcucumber.util.Constants;
import coid.juaracoding.pcmcucumber.util.GlobalFunction;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Wed 20:54
@Last Modified Wed 20:54
Version 1.0
*/
public class InputRegisterPositif {

    public WebDriver driver;
    private static ExtentTest extentTest;
    private SCLoginPage scLoginPage;
    private SCHomePage scHomePage;
    private boolean isValid = true;
    private SCRegisterPage scRegisterPage;
    private Random random ;

    public InputRegisterPositif(){
        isValid = true;
        this.driver = LoginOutlineHooks.driver;
        random = new Random();
        scLoginPage = new SCLoginPage(driver);
        scHomePage = new SCHomePage(driver);
        scRegisterPage = new SCRegisterPage(driver);
        extentTest = LoginOutlineHooks.extentTest;
    }

    @When("TC0111 Mengakses Halaman Website")
    public void tc0111_mengakses_halaman_website(){
        this.driver.get(Constants.URL_LOGIN);
        extentTest.log(LogStatus.PASS, "TC0111 Mengakses Halaman Website");
    }
    @And("TC0111 Mengkosongkan Field Untuk Login")
    public void tc0111_mengkosongkan_field_untuk_login(){
        scLoginPage.getTxtFieldPassword().clear();
        scLoginPage.getTxtFieldUsername().clear();
        extentTest.log(LogStatus.PASS, "TC0111 Mengkosongkan Field Untuk Login");
    }
    @And("TC0111 Input Username Valid")
    public void tc0111_input_username_valid(){
        scLoginPage.getTxtFieldUsername().sendKeys("admintiara2");
        extentTest.log(LogStatus.PASS, "TC0111 Input Username Valid");
    }
    @And("TC0111 Input Password Valid")
    public void tc0111_input_password_valid(){
        scLoginPage.getTxtFieldPassword().sendKeys("a");
        extentTest.log(LogStatus.PASS, "TC0111 Input Password Valid");
    }
    @And("TC0111 Menekan Tombol Login")
    public void tc0111_menekan_tombol_login(){
        scLoginPage.getBtnSubmit().click();
        extentTest.log(LogStatus.PASS, "TC0111 Menekan Tombol Login");
    }
    @Then("TC0111 Validasi Halaman Home")
    public void tc0111_validasi_halaman_home(){
        String textHome = (scHomePage.getHomepageLogo()==null)?"":scHomePage.getHomepageLogo().getText();
        Assert.assertTrue(textHome.contains("Selamat datang"));
        extentTest.log(LogStatus.PASS, "TC0111 Validasi Halaman Home");
    }
    @When("TC0111 Memilih Menu Registrasi")
    public void tc0111_memilih_menu_registrasi(){
        scHomePage.getBtnMenuRegister().click();
        extentTest.log(LogStatus.PASS, "TC0111 Memilih Menu Registrasi");
    }
    @And("TC0111 Menekan Tombol Add New Data")
    public void tc0111_menekan_tombol_add_new_data(){
        scRegisterPage.getBtnAddNewData().click();
        extentTest.log(LogStatus.PASS, "TC0111 Menekan Tombol Add New Data");
    }
    @And("TC0111 Mengisi Field Soco Id")
    public void tc0111_mengisi_field_soco_id(){
        scRegisterPage.getTextSocoID().sendKeys(String.valueOf(random.nextLong(1000000000L,9999999999L)));
        extentTest.log(LogStatus.PASS, "TC0111 Mengisi Field Soco Id");
    }
    @And("TC0111 Mengisi Field Nama Lengkap Nasabah")
    public void tc0111_mengisi_field_nama_lengkap_nasabah(){
        scRegisterPage.getTxtNamaLengkapNasabah().sendKeys(GlobalFunction.getDataGenerator().dataNamaLengkap());
        extentTest.log(LogStatus.PASS, "TC0111 Mengisi Field Nama Lengkap Nasabah");
    }
    @And("TC0111 Mengisi Field Nomor Handphone Yang Terdaftar Di Bca")
    public void tc0111_mengisi_field_nomor_handphone_yang_terdaftar_di_bca(){
        scRegisterPage.getTextNomorHPTerdaftarDiBCA().sendKeys(GlobalFunction.getDataGenerator().dataNoHp());
        extentTest.log(LogStatus.PASS, "TC0111 Mengisi Field Nomor Handphone Yang Terdaftar Di Bca");
    }
    @And("TC0111 Mengisi Field Nomor Rekening Bca")
    public void tc0111_mengisi_field_nomor_rekening_bca(){
        scRegisterPage.getTextNoRekBCA().sendKeys(String.valueOf(random.nextLong(1000000000L,9999999999L)));
        extentTest.log(LogStatus.PASS, "TC0111 Mengisi Field Nomor Rekening Bca");
    }
    @And("TC0111 Memilih Opsi My Bca")
    public void tc0111_memilih_opsi_my_bca(){
        Select s = new Select(scRegisterPage.getSelectQrisPay());
        /** Lebih baik menggunakan index karena kalau value kadang kita tidak tahu ada escape
         *  character atau tidak di dalam penulisan value nya ....
         */
        s.selectByIndex(0);
        extentTest.log(LogStatus.PASS, "TC0111 Memilih Opsi My Bca");
    }
    @And("TC0111 Mengisi Field Nominal Transaksi")
    public void tc0111_mengisi_field_nominal_transaksi(){
        scRegisterPage.getTxtNominalTransaksi().sendKeys(String.valueOf(random.nextInt(300000,999999)));
        extentTest.log(LogStatus.PASS, "TC0111 Mengisi Field Nominal Transaksi");
    }
    @And("TC0111 Mengisi Field Tanggal Transaksi")
    public void tc0111_mengisi_field_tanggal_transaksi(){
        scRegisterPage.getDateTransaksi().sendKeys(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        extentTest.log(LogStatus.PASS, "TC0111 Mengisi Field Tanggal Transaksi");
    }
    @And("TC0111 Pilih Nama Merchant")
    public void tc0111_pilih_nama_merchant(){
        Select s = new Select(scRegisterPage.getSelectNamaMerchant());
        s.selectByIndex(1);
        extentTest.log(LogStatus.PASS, "TC0111 Pilih Nama Merchant");
    }
    @And("TC0111 Mengisi Field Rrn")
    public void tc0111_mengisi_field_rrn(){
        scRegisterPage.getTextNoRekBCA().sendKeys(String.valueOf(random.nextLong(100000000000L,999999999999L)));
        extentTest.log(LogStatus.PASS, "TC0111 Mengisi Field Rrn");
    }
    @And("TC0111 Upload Foto Bukti Transaksi1")
    public void tc0111_upload_foto_bukti_transaksi1(){
        scRegisterPage.getUploadFotoBuktiTransaksi1().sendKeys(GlobalFunction.getFilePathInResources("\\data\\gambar-180.jpg"));
        extentTest.log(LogStatus.PASS, "TC0111 Upload Foto Bukti Transaksi1");
    }
    @And("TC0111 Upload Foto Bukti Transaksi2")
    public void tc0111_upload_foto_bukti_transaksi2(){
        scRegisterPage.getUploadFotoBuktiTransaksi2().sendKeys(GlobalFunction.getFilePathInResources("\\data\\gambar-awal.jpg"));
        extentTest.log(LogStatus.PASS, "TC0111 Upload Foto Bukti Transaksi2");
    }
    @And("TC0111 Upload Foto Bukti Transaksi3")
    public void tc0111_upload_foto_bukti_transaksi3(){
        scRegisterPage.getUploadFotoBuktiTransaksi3().sendKeys(GlobalFunction.getFilePathInResources("\\data\\gambar-180.jpg"));
        extentTest.log(LogStatus.PASS, "TC0111 Upload Foto Bukti Transaksi3");
    }
    @And("TC0111 Menekan Tombol Submit Data")
    public void tc0111_menekan_tombol_submit_data(){
        scRegisterPage.getBtnSubmit().click();
        extentTest.log(LogStatus.PASS, "TC0111 Menekan Tombol Submit Data");
    }

    @Then("TC0111 Validasi Simpan Data")
    public void tc0111_validasi_simpan_data(){
        String strValidasiLabel = scRegisterPage.getLabelPageRegister()==null?"":scRegisterPage.getLabelPageRegister().getText();
        if(strValidasiLabel.equals("")){
            Assert.assertEquals("a","b","Tidak Pindah Ke Halaman Registrasi Dan Komponen Tidak Ditemukan");
            extentTest.log(LogStatus.FAIL, "TC0111 Validasi Simpan Data");
        }
        System.out.println("Nilai dari Label Home : "+strValidasiLabel);
        Assert.assertEquals(strValidasiLabel,"List Data","Tidak Pindah Ke Halaman Registrasi");
//        scRegisterPage.getLabelPageRegister().getText()//NullPointerException
        extentTest.log(LogStatus.PASS, "TC0111 Validasi Simpan Data");
    }
}