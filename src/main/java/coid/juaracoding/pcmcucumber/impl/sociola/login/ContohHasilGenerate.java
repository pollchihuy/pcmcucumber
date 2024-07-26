//package coid.juaracoding.pcmcucumber.impl.sociola.login;
//
//import coid.juaracoding.pcmcucumber.page.sociola.SCHomePage;
//import coid.juaracoding.pcmcucumber.page.sociola.SCImageOnline;
//import coid.juaracoding.pcmcucumber.page.sociola.SCLoginPage;
//import coid.juaracoding.pcmcucumber.page.sociola.SCVerifikasiPage;
//import coid.juaracoding.pcmcucumber.util.Constants;
//import coid.juaracoding.pcmcucumber.util.GlobalFunction;
//import coid.juaracoding.pcmcucumber.util.OpenCVFunction;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WindowType;
//import org.testng.Assert;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Iterator;
//import java.util.Random;
//import java.util.Set;
//
///*
//IntelliJ IDEA 2024.1.4 (Ultimate Edition)
//Build #IU-241.18034.62, built on June 21, 2024
//@Author pollc a.k.a. Paul Christian
//Java Developer
//Created on Wed 20:54
//@Last Modified Wed 20:54
//Version 1.0
//*/
//public class ContohHasilGenerate {
//
//    public WebDriver driver;
//    private static ExtentTest extentTest;
//    private SCLoginPage scLoginPage;
//    private SCHomePage scHomePage;
//    private boolean isValid = true;
//    private SCVerifikasiPage scVerifikasiPage;
//    private SCImageOnline scImageOnline;
//    private Random random;
//    private String parentWindow ;
//    private String childWindow ;
//    private String strLinkTransaksi1;
//    private String pathRootDownload ;
//    private String fileDownloadTransaksi1;
//    private String fileRotate90Transaksi1;
//
//    public ContohHasilGenerate(){
//        pathRootDownload = "D:\\download-automation";
//        isValid = true;
//        this.driver = LoginOutlineHooks.driver;
//        random = new Random();
//        scLoginPage = new SCLoginPage(driver);
//        scHomePage = new SCHomePage(driver);
//        scVerifikasiPage = new SCVerifikasiPage(driver);
//        scImageOnline = new SCImageOnline(driver);
//        extentTest = LoginOutlineHooks.extentTest;
//    }
//
//    @When("TC0141 Mengakses Halaman Website")
//    public void tc0141_mengakses_halaman_website(){
//
//        extentTest.log(LogStatus.PASS, "TC0141 Mengakses Halaman Website");
//    }
//    @And("TC0141 Mengkosongkan Field Untuk Login")
//    public void tc0141_mengkosongkan_field_untuk_login(){
//
//        extentTest.log(LogStatus.PASS, "TC0141 Mengkosongkan Field Untuk Login");
//    }
//    @And("TC0141 Input Username Valid")
//    public void tc0141_input_username_valid(){
//
//        extentTest.log(LogStatus.PASS, "TC0141 Input Username Valid");
//    }
//    @And("TC0141 Input Password Valid")
//    public void tc0141_input_password_valid(){
//
//        extentTest.log(LogStatus.PASS, "TC0141 Input Password Valid");
//    }
//    @And("TC0141 Menekan Tombol Login")
//    public void tc0141_menekan_tombol_login(){
//
//        extentTest.log(LogStatus.PASS, "TC0141 Menekan Tombol Login");
//    }
//    @Then("TC0141 Validasi Halaman Home")
//    public void tc0141_validasi_halaman_home(){
//
//        extentTest.log(LogStatus.PASS, "TC0141 Validasi Halaman Home");
//    }
//    @When("TC0141 Memilih Menu Verifikasi")
//    public void tc0141_memilih_menu_verifikasi(){
//
//        extentTest.log(LogStatus.PASS, "TC0141 Memilih Menu Verifikasi");
//    }
//    @And("TC0141 Melakukan Searching Data")
//    public void tc0141_melakukan_searching_data(){
//
//        extentTest.log(LogStatus.PASS, "TC0141 Melakukan Searching Data");
//    }
//    @And("TC0141 Menekan Tombol Aksi")
//    public void tc0141_menekan_tombol_aksi(){
//
//        extentTest.log(LogStatus.PASS, "TC0141 Menekan Tombol Aksi");
//    }
//    @And("TC0141 Switch Ke Tab Baru")
//    public void tc0141_switch_ke_tab_baru(){
//
//        extentTest.log(LogStatus.PASS, "TC0141 Switch Ke Tab Baru");
//    }
//    @And("TC0141 Klik Tombol Rotasi90 Foto Bukti Transaksi1")
//    public void tc0141_klik_tombol_rotasi90_foto_bukti_transaksi1(){
//
//        extentTest.log(LogStatus.PASS, "TC0141 Klik Tombol Rotasi90 Foto Bukti Transaksi1");
//    }
//    @And("TC0141 Download Hasil Rotasi90 Foto Bukti Transaksi1")
//    public void tc0141_download_hasil_rotasi90_foto_bukti_transaksi1(){
//
//        extentTest.log(LogStatus.PASS, "TC0141 Download Hasil Rotasi90 Foto Bukti Transaksi1");
//    }
//    @And("TC0141 Rotasi Gambar Asli Foto Bukti Transaksi1")
//    public void tc0141_rotasi_gambar_asli_foto_bukti_transaksi1(){
//
//        extentTest.log(LogStatus.PASS, "TC0141 Rotasi Gambar Asli Foto Bukti Transaksi1");
//    }
//    @And("TC0141 Compare Kedua Gambar Hasil Rotasi90 Transaksi1 Ke Website Image Online")
//    public void tc0141_compare_kedua_gambar_hasil_rotasi90_transaksi1_ke_website_image_online(){
//
//        extentTest.log(LogStatus.PASS, "TC0141 Compare Kedua Gambar Hasil Rotasi90 Transaksi1 Ke Website Image Online");
//    }
//    @Then("TC0141 Validasi Hasilnya")
//    public void tc0141_validasi_hasilnya(){
//        extentTest.log(LogStatus.PASS, "TC0141 Validasi Hasilnya");
//    }
//}