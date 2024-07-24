#created_by : Paul Christian Malau
#created_date : 24/07/2024
#updated_by :
#updated_date :

Feature: Input Registrasi Positif

  Scenario: TC01111 Valid Login
    When TC0111 Mengakses Halaman Website
    And TC0111 Mengkosongkan Field Untuk Login
    And TC0111 Input Username Valid
    And TC0111 Input Password Valid
    And TC0111 Menekan Tombol Login
    Then TC0111 Validasi Halaman Home
    When TC0111 Memilih Menu Registrasi
    And TC0111 Menekan Tombol Add New Data
    And TC0111 Mengisi Field Soco Id
    And TC0111 Mengisi Field Nama Lengkap Nasabah
    And TC0111 Mengisi Field Nomor Handphone Yang Terdaftar Di Bca
    And TC0111 Mengisi Field Nomor Rekening Bca
    And TC0111 Memilih Opsi My Bca
    And TC0111 Mengisi Field Nominal Transaksi
    And TC0111 Mengisi Field Mengisi Nominal Cashback
    And TC0111 Mengisi Field Tanggal Transaksi
    And TC0111 Pilih Nama Merchant
    And TC0111 Mengisi Field Rrn
    And TC0111 Upload Foto Bukti Transaksi1
    And TC0111 Upload Foto Bukti Transaksi2
    And TC0111 Upload Foto Bukti Transaksi3
    And TC0111 Menekan Tombol Submit Data
#    Then TC0111 Mengkosongkan Field Untuk Login

#  Scenario: TC01121 Menuju Menu Registrasi
#    When TC0112 Menekan Menu Registrasi
#    And TC0112 Input Username Valid
#    And TC0112 Input Password Salah
#    And TC0112 Menekan Tombol Login
#    Then TC0112 Validasi Login Error Password Salah

  #  Scenario: TC01131 Menuju Menu Registrasi
#    When TC0112 Menekan Menu Registrasi
#    And TC0112 Input Username Valid
#    And TC0112 Input Password Salah
#    And TC0112 Menekan Tombol Login
#    Then TC0112 Validasi Login Error Password Salah

#  Scenario: TCTC01112 Username Salah
#    When Pta004 Mengkosongkan Field Untuk Login
#    And Pta004 Input Username Salah
#    And Pta004 Input Password Valid
#    And Pta004 Menekan Tombol Login
#    Then Pta004 Validasi Login Error Username Salah

#  Scenario: TC01122 Username Dan Password Salah
#    When Pta005 Mengkosongkan Field Untuk Login
#    And Pta005 Input Username Salah
#    And Pta005 Input Password Salah
#    And Pta005 Menekan Tombol Login
#    Then Pta005 Validasi Login Error Username Dan Password Salah