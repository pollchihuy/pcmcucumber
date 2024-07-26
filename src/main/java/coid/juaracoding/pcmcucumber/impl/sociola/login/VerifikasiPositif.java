package coid.juaracoding.pcmcucumber.impl.sociola.login;

import coid.juaracoding.pcmcucumber.page.sociola.*;
import coid.juaracoding.pcmcucumber.util.Constants;
import coid.juaracoding.pcmcucumber.util.GlobalFunction;
import coid.juaracoding.pcmcucumber.util.OpenCVFunction;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Wed 20:54
@Last Modified Wed 20:54
Version 1.0
*/
public class VerifikasiPositif {

    public WebDriver driver;
    private static ExtentTest extentTest;
    private SCLoginPage scLoginPage;
    private SCHomePage scHomePage;
    private boolean isValid = true;
    private SCVerifikasiPage scVerifikasiPage;
    private SCImageOnline scImageOnline;
    private Random random;
    private String parentWindow ;
    private String childWindow1;
    private String strLinkTransaksi1;
    private String pathRootDownload ;
    private String fileDownloadTransaksi1;
    private String fileRotate90Transaksi1;

    public VerifikasiPositif(){
        pathRootDownload = "D:\\download-automation";
        isValid = true;
        this.driver = LoginOutlineHooks.driver;
        random = new Random();
        scLoginPage = new SCLoginPage(driver);
        scHomePage = new SCHomePage(driver);
        scVerifikasiPage = new SCVerifikasiPage(driver);
        scImageOnline = new SCImageOnline(driver);
        extentTest = LoginOutlineHooks.extentTest;
    }

    @When("TC0141 Mengakses Halaman Website")
    public void tc0141_mengakses_halaman_website(){
        this.driver.get(Constants.URL_LOGIN);
        parentWindow = driver.getWindowHandle();// missal : id parent windows -> x903347
        extentTest.log(LogStatus.PASS, "TC0141 Mengakses Halaman Website");
    }
    @And("TC0141 Mengkosongkan Field Untuk Login")
    public void tc0141_mengkosongkan_field_untuk_login(){
        scLoginPage.getTxtFieldPassword().clear();
        scLoginPage.getTxtFieldUsername().clear();
        extentTest.log(LogStatus.PASS, "TC0141 Mengkosongkan Field Untuk Login");
    }
    @And("TC0141 Input Username Valid")
    public void tc0141_input_username_valid(){
        scLoginPage.getTxtFieldUsername().sendKeys("admintiara2");
        extentTest.log(LogStatus.PASS, "TC0141 Input Username Valid");
    }
    @And("TC0141 Input Password Valid")
    public void tc0141_input_password_valid(){
        scLoginPage.getTxtFieldPassword().sendKeys("a");
        extentTest.log(LogStatus.PASS, "TC0141 Input Password Valid");
    }
    @And("TC0141 Menekan Tombol Login")
    public void tc0141_menekan_tombol_login(){
        scLoginPage.getBtnSubmit().click();
        extentTest.log(LogStatus.PASS, "TC0141 Menekan Tombol Login");
    }
    @Then("TC0141 Validasi Halaman Home")
    public void tc0141_validasi_halaman_home(){
        String textHome = (scHomePage.getHomepageLogo()==null)?"":scHomePage.getHomepageLogo().getText();
        Assert.assertTrue(textHome.contains("Selamat datang"));
        extentTest.log(LogStatus.PASS, "TC0141 Validasi Halaman Home");
    }
    @When("TC0141 Memilih Menu Verifikasi")
    public void tc0141_memilih_menu_verifikasi(){
        scHomePage.getBtnMenuVerifikasi().click();
        extentTest.log(LogStatus.PASS, "TC0141 Memilih Menu Verifikasi");
    }
    @And("TC0141 Melakukan Searching Data")
    public void tc0141_melakukan_searching_data(){
        /** HARUS 2 kali di lakukan karena masih bugs ,
         * kalau hanya 1 kali nanti datanya gak fix yang muncul berdasarkan yang kita search */
        scVerifikasiPage.getTextSearch().sendKeys("981496514636302"+ Keys.ENTER);
        scVerifikasiPage.getTextSearch().sendKeys("981496514636302"+ Keys.ENTER);
        extentTest.log(LogStatus.PASS, "TC0141 Melakukan Searching Data");
    }

    @And("TC0141 Menekan Tombol Aksi")
    public void tc0141_menekan_tombol_aksi(){
        /** Untuk case ini karena hanya 1 data yang muncul berdasarkan filter di step sebelumnya ,
         *  maka di hardcode pun tidak masalah untuk button view edit nya....
         *  namun di real case nya nanti usahakan ada pengecekan terlebih dahulu, apakah datanya ada atau tidak...
         *  guna mencegah error dan berjalan ke step step selanjutnya yang berhubungan dengan step ini.
         */
        scVerifikasiPage.getBtnEdit().click();
        extentTest.log(LogStatus.PASS, "TC0141 Menekan Tombol Aksi");
    }
    @And("TC0141 Switch Ke Tab Baru")
    public void tc0141_switch_ke_tab_baru(){
        /** ketika menekan tombol view pada record yang di search ditampilkan ke tab selanjutnya
         * tapi bisa di cover dengan fungsional berikut , sehingga cursor pindah ke tab yang akan kita olah nantinya....
         */
        Set<String> allWindowHandles = driver.getWindowHandles();

        Iterator<String> i1 = allWindowHandles.iterator();
        while (i1.hasNext()){
            childWindow1 = i1.next();// value childWindow1 saat looping pertama -> 44zs78d
            if(!parentWindow.equals(childWindow1)){ // x903347.equals(44zs78d)
                driver.switchTo().window(childWindow1);
            }
        }
        extentTest.log(LogStatus.PASS, "TC0141 Switch Ke Tab Baru");
    }

    @And("TC0141 Klik Tombol Rotasi90 Foto Bukti Transaksi1")
    public void tc0141_klik_tombol_rotasi90_foto_bukti_transaksi1(){
        /** Disini ada proses untuk rotasi,
         * sebaiknya gunakan delay sekitar 2 atau 3 detik sebelum lanjut ke step berikutnya
         * untuk menunggu proses rotasi nya berhasil terlebih dahulu
         */
        scVerifikasiPage.getBtnRotate90FotoBuktiTransaksi1().click();
        extentTest.log(LogStatus.PASS, "TC0141 Klik Tombol Rotasi90 Foto Bukti Transaksi1");
    }
    
    @And("TC0141 Download Hasil Rotasi90 Foto Bukti Transaksi1")
    public void tc0141_download_hasil_rotasi90_foto_bukti_transaksi1(){
        /** Link ini disiapkan sebelumnya kalau mau menggunakan data driven */
        fileDownloadTransaksi1 = pathRootDownload+"\\"+new SimpleDateFormat("ddmmyyyyHHMMssSSS").format(new Date())+"_transaksi1.jpg";
        /** Ambil link untuk mendownload gambar tersebut, cek terlebih dahulu apakah null atau tidaknya untuk menghandle error yang akan terjadi */
        strLinkTransaksi1 = scVerifikasiPage.getImageGambar()==null?"":scVerifikasiPage.getImageGambar().getAttribute("src");

        /** Ambil link untuk mendownload gambar tersebut, cek terlebih dahulu apakah null atau tidaknya untuk menghandle error yang akan terjadi */
        if(strLinkTransaksi1.equals("")){
            Assert.assertEquals("a","b","Link Gambar Tidak Ditemukan");
            return;
        }
        GlobalFunction.downloadImage(strLinkTransaksi1,fileDownloadTransaksi1);
        extentTest.log(LogStatus.PASS, "TC0141 Download Hasil Rotasi90 Foto Bukti Transaksi1");
    }

    @And("TC0141 Rotasi Gambar Asli Foto Bukti Transaksi1")
    public void tc0141_rotasi_gambar_asli_foto_bukti_transaksi1(){
        fileRotate90Transaksi1=pathRootDownload+"\\Gambar-Trx-1-Rotate-90.png";
        String strPathGambarAsli = GlobalFunction.getFilePathInResources("\\data\\sociola\\Gambar-Trx-1-Ori.png");
//        System.out.println("Path Gambar Asli : "+strPathGambarAsli);
        OpenCVFunction.rotateImage(strPathGambarAsli,
                fileRotate90Transaksi1,
        90,null);
        extentTest.log(LogStatus.PASS, "TC0141 Rotasi Gambar Asli Foto Bukti Transaksi1");
    }

    @And("TC0141 Compare Kedua Gambar Hasil Rotasi90 Transaksi1 Ke Website Image Online")
    public void tc0141_compare_kedua_gambar_hasil_rotasi90_transaksi1_ke_website_image_online(){
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.imgonline.com.ua/eng/similarity-percent.php");
        scImageOnline.getUploadGambar1().sendKeys(fileRotate90Transaksi1);
        scImageOnline.getUploadGambar2().sendKeys(fileDownloadTransaksi1);
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
        scImageOnline.getBtnOk().click();
        extentTest.log(LogStatus.PASS, "TC0141 Compare Kedua Gambar Hasil Rotasi90 Transaksi1 Ke Website Image Online");
    }

    @Then("TC0141 Validasi Hasilnya")
    public void tc0141_validasi_hasilnya(){
        String strResult = scImageOnline.getLabelResult()==null?"":scImageOnline.getLabelResult().getText();
        if(strResult.equals("")){
            Assert.assertEquals("a","b","Hasil Membandingkan Gambar Gagal");
            return;
        }
        double doResult = Double.parseDouble(strResult.replace(" %",""));
        boolean isValid = doResult>90;
        Assert.assertTrue(isValid,"Gambar tidak cocok!! Tingkat Kesamaan "+doResult);
        extentTest.log(LogStatus.PASS, "TC0141 Validasi Hasilnya");
    }
}