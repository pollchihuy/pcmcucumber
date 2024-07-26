package coid.juaracoding.pcmcucumber.util;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Wed 07:06
@Last Modified Wed 07:06
Version 1.0
*/
public class GenerateFunctionCucumber {

    public static void main(String[] args) {
//        generateLoginPositif();
//        generateInputRegistrasiPositif();
        generateVerifikasiPositif();
    }

    public static void  generateLoginPositif(){
        String [] strFunction = {
                "TC001 Mengakses Halaman Website",
                "TC001 Mengkosongkan Field Untuk Login",
                "TC001 Input Username Valid",
                "TC001 Input Password Valid",
                "TC001 Menekan Tombol Login",
                "TC001 Validasi Label Sukses Di Halaman Home Page",
                "TC001 Klik Tombol Logout",
                "TC001 Validasi Halaman Login"
        };

        for (int i = 0; i < strFunction.length; i++) {
            System.out.println("(\""+strFunction[i]+"\")");
            System.out.println("public void "+strFunction[i].replace(" ","_").toLowerCase()+"(){\n");
            System.out.println("extentTest.log(LogStatus.PASS, \""+strFunction[i]+"\");");
            System.out.println("}");
        }
    }

    public static void  generateInputRegistrasiPositif(){
        String [] strPrefix = {
                "@When",
                "@And",
                "@And",
                "@And",
                "@And",
                "@Then",
                "@When",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@Then"
        };
        String [] strFunction = {
                "TC0111 Mengakses Halaman Website     ",
                "TC0111 Mengkosongkan Field Untuk Login    ",
                "TC0111 Input Username Valid     ",
                "TC0111 Input Password Valid     ",
                "TC0111 Menekan Tombol Login     ",
                "TC0111 Validasi Halaman Home     ",
                "TC0111 Memilih Menu Registrasi     ",
                "TC0111 Menekan Tombol Add New Data   ",
                "TC0111 Mengisi Field Soco Id    ",
                "TC0111 Mengisi Field Nama Lengkap Nasabah   ",
                "TC0111 Mengisi Field Nomor Handphone Yang Terdaftar Di Bca",
                "TC0111 Mengisi Field Nomor Rekening Bca   ",
                "TC0111 Memilih Opsi My Bca    ",
                "TC0111 Mengisi Field Nominal Transaksi    ",
                "TC0111 Mengisi Field Mengisi Nominal Cashback   ",
                "TC0111 Mengisi Field Tanggal Transaksi    ",
                "TC0111 Pilih Nama Merchant     ",
                "TC0111 Mengisi Field Rrn     ",
                "TC0111 Upload Foto Bukti Transaksi1    ",
                "TC0111 Upload Foto Bukti Transaksi2    ",
                "TC0111 Upload Foto Bukti Transaksi3    ",
                "TC0111 Menekan Tombol Submit Data    ",
                "TC0111 Mengkosongkan Field Untuk Login    "


        };

        for (int i = 0; i < strFunction.length; i++) {
            String strFunctionz = strFunction[i].trim();
            System.out.println(strPrefix[i]+"(\""+strFunctionz+"\")");
            System.out.println("public void "+strFunctionz.replace(" ","_").toLowerCase()+"(){\n");
            System.out.println("extentTest.log(LogStatus.PASS, \""+strFunctionz+"\");");
            System.out.println("}");
        }
    }

    public static void  generateVerifikasiPositif(){
        String [] strPrefix = {
                "@When",
                "@And",
                "@And",
                "@And",
                "@And",
                "@Then",
                "@When",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@Then"
        };

        String [] strFunction = {
                "TC0141 Mengakses Halaman Website       ",
                "TC0141 Mengkosongkan Field Untuk Login      ",
                "TC0141 Input Username Valid       ",
                "TC0141 Input Password Valid       ",
                "TC0141 Menekan Tombol Login       ",
                "TC0141 Validasi Halaman Home       ",
                "TC0141 Memilih Menu Verifikasi       ",
                "TC0141 Melakukan Searching Data       ",
                "TC0141 Menekan Tombol Aksi       ",
                "TC0141 Switch Ke Tab Baru      ",
                "TC0141 Klik Tombol Rotasi90 Foto Bukti Transaksi1    ",
                "TC0141 Download Hasil Rotasi90 Foto Bukti Transaksi1    ",
                "TC0141 Rotasi Gambar Asli Foto Bukti Transaksi1    ",
                "TC0141 Compare Kedua Gambar Hasil Rotasi90 Transaksi1 Ke Website Image Online",
                "TC0141 Validasi Hasilnya        "


        };

        for (int i = 0; i < strFunction.length; i++) {
            String strFunctionz = strFunction[i].trim();
            System.out.println(strPrefix[i]+"(\""+strFunctionz+"\")");
            System.out.println("public void "+strFunctionz.replace(" ","_").toLowerCase()+"(){\n");
            System.out.println("extentTest.log(LogStatus.PASS, \""+strFunctionz+"\");");
            System.out.println("}");
        }
    }
}
