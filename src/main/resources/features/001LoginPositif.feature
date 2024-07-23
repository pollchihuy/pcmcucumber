Feature: Login Positif

  Scenario: Pta001 Valid Login Username
    When Pta001 Mengakses Halaman Website
    And Pta001 Mengkosongkan Field Untuk Login
    And Pta001 Input Username Valid
    And Pta001 Input Password Valid Two
    And Pta001 Menekan Tombol Login
    Then Pta001 Validasi Label Sukses Di Halaman Home Page
    When Pta001 Klik Tombol Logout
    Then Pta001 Validasi Halaman Login