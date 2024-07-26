#created_by : Paul Christian Malau
#created_date : 24/07/2024
#updated_by :
#updated_date :

Feature: Input Registrasi Positif

  Scenario: TC01111 Input Form Registrasi
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
    And TC0111 Mengisi Field Tanggal Transaksi
    And TC0111 Pilih Nama Merchant
    And TC0111 Mengisi Field Rrn
    And TC0111 Upload Foto Bukti Transaksi1
    And TC0111 Upload Foto Bukti Transaksi2
    And TC0111 Upload Foto Bukti Transaksi3
    And TC0111 Menekan Tombol Submit Data
    Then TC0111 Validasi Simpan Data