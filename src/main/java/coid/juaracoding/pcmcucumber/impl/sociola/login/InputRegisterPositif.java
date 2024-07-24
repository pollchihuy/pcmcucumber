package coid.juaracoding.pcmcucumber.impl.sociola.login;

import coid.juaracoding.pcmcucumber.page.sociola.SCHomePage;
import coid.juaracoding.pcmcucumber.page.sociola.SCLoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

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

    public InputRegisterPositif(){
        isValid = true;
        this.driver = LoginOutlineHooks.driver;
        scLoginPage = new SCLoginPage(driver);
        scHomePage = new SCHomePage(driver);
        extentTest = LoginOutlineHooks.extentTest;
    }

    @When("TC0111 Mengakses Halaman Website")
    public void tc0111_mengakses_halaman_website(){

        extentTest.log(LogStatus.PASS, "TC0111 Mengakses Halaman Website");
    }
    @And("TC0111 Mengkosongkan Field Untuk Login")
    public void tc0111_mengkosongkan_field_untuk_login(){

        extentTest.log(LogStatus.PASS, "TC0111 Mengkosongkan Field Untuk Login");
    }
    @And("TC0111 Input Username Valid")
    public void tc0111_input_username_valid(){

        extentTest.log(LogStatus.PASS, "TC0111 Input Username Valid");
    }
    @And("TC0111 Input Password Valid")
    public void tc0111_input_password_valid(){

        extentTest.log(LogStatus.PASS, "TC0111 Input Password Valid");
    }
    @And("TC0111 Menekan Tombol Login")
    public void tc0111_menekan_tombol_login(){

        extentTest.log(LogStatus.PASS, "TC0111 Menekan Tombol Login");
    }
    @Then("TC0111 Validasi Halaman Home")
    public void tc0111_validasi_halaman_home(){

        extentTest.log(LogStatus.PASS, "TC0111 Validasi Halaman Home");
    }
    @When("TC0111 Memilih Menu Registrasi")
    public void tc0111_memilih_menu_registrasi(){

        extentTest.log(LogStatus.PASS, "TC0111 Memilih Menu Registrasi");
    }
    @And("TC0111 Menekan Tombol Add New Data")
    public void tc0111_menekan_tombol_add_new_data(){

        extentTest.log(LogStatus.PASS, "TC0111 Menekan Tombol Add New Data");
    }
    @And("TC0111 Mengisi Field Soco Id")
    public void tc0111_mengisi_field_soco_id(){

        extentTest.log(LogStatus.PASS, "TC0111 Mengisi Field Soco Id");
    }
    @And("TC0111 Mengisi Field Nama Lengkap Nasabah")
    public void tc0111_mengisi_field_nama_lengkap_nasabah(){

        extentTest.log(LogStatus.PASS, "TC0111 Mengisi Field Nama Lengkap Nasabah");
    }
    @And("TC0111 Mengisi Field Nomor Handphone Yang Terdaftar Di Bca")
    public void tc0111_mengisi_field_nomor_handphone_yang_terdaftar_di_bca(){

        extentTest.log(LogStatus.PASS, "TC0111 Mengisi Field Nomor Handphone Yang Terdaftar Di Bca");
    }
    @And("TC0111 Mengisi Field Nomor Rekening Bca")
    public void tc0111_mengisi_field_nomor_rekening_bca(){

        extentTest.log(LogStatus.PASS, "TC0111 Mengisi Field Nomor Rekening Bca");
    }
    @And("TC0111 Memilih Opsi My Bca")
    public void tc0111_memilih_opsi_my_bca(){

        extentTest.log(LogStatus.PASS, "TC0111 Memilih Opsi My Bca");
    }
    @And("TC0111 Mengisi Field Nominal Transaksi")
    public void tc0111_mengisi_field_nominal_transaksi(){

        extentTest.log(LogStatus.PASS, "TC0111 Mengisi Field Nominal Transaksi");
    }
    @And("TC0111 Mengisi Field Mengisi Nominal Cashback")
    public void tc0111_mengisi_field_mengisi_nominal_cashback(){

        extentTest.log(LogStatus.PASS, "TC0111 Mengisi Field Mengisi Nominal Cashback");
    }
    @And("TC0111 Mengisi Field Tanggal Transaksi")
    public void tc0111_mengisi_field_tanggal_transaksi(){

        extentTest.log(LogStatus.PASS, "TC0111 Mengisi Field Tanggal Transaksi");
    }
    @And("TC0111 Pilih Nama Merchant")
    public void tc0111_pilih_nama_merchant(){

        extentTest.log(LogStatus.PASS, "TC0111 Pilih Nama Merchant");
    }
    @And("TC0111 Mengisi Field Rrn")
    public void tc0111_mengisi_field_rrn(){

        extentTest.log(LogStatus.PASS, "TC0111 Mengisi Field Rrn");
    }
    @And("TC0111 Upload Foto Bukti Transaksi1")
    public void tc0111_upload_foto_bukti_transaksi1(){

        extentTest.log(LogStatus.PASS, "TC0111 Upload Foto Bukti Transaksi1");
    }
    @And("TC0111 Upload Foto Bukti Transaksi2")
    public void tc0111_upload_foto_bukti_transaksi2(){

        extentTest.log(LogStatus.PASS, "TC0111 Upload Foto Bukti Transaksi2");
    }
    @And("TC0111 Upload Foto Bukti Transaksi3")
    public void tc0111_upload_foto_bukti_transaksi3(){

        extentTest.log(LogStatus.PASS, "TC0111 Upload Foto Bukti Transaksi3");
    }
    @And("TC0111 Menekan Tombol Submit Data")
    public void tc0111_menekan_tombol_submit_data(){

        extentTest.log(LogStatus.PASS, "TC0111 Menekan Tombol Submit Data");
    }
}