#created_by : Paul Christian Malau
#created_date : 24/07/2024
#updated_by :
#updated_date :

Feature: Verifikasi Positif

  Scenario: TC0141 Validasi Menu Verifikasi
    When TC0141 Mengakses Halaman Website
    And TC0141 Mengkosongkan Field Untuk Login
    And TC0141 Input Username Valid
    And TC0141 Input Password Valid
    And TC0141 Menekan Tombol Login
    Then TC0141 Validasi Halaman Home
    When TC0141 Memilih Menu Verifikasi
    And TC0141 Melakukan Searching Data
    And TC0141 Menekan Tombol Aksi
    And TC0141 Switch Ke Tab Baru
    And TC0141 Klik Tombol Rotasi90 Foto Bukti Transaksi1
    And TC0141 Download Hasil Rotasi90 Foto Bukti Transaksi1
    And TC0141 Rotasi Gambar Asli Foto Bukti Transaksi1
    And TC0141 Compare Kedua Gambar Hasil Rotasi90 Transaksi1 Ke Website Image Online
    Then TC0141 Validasi Hasilnya