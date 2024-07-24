#created_by : Paul Christian Malau
#created_date : 24/07/2024
#updated_by :
#updated_date :

Feature: Login Negatif

  Scenario: TC0021 Empty Login
    When TC0021 Mengakses Halaman Website
    And TC0021 Mengkosongkan Field Untuk Login
    And TC0021 Input Username Kosong
    And TC0021 Input Password Kosong
    And TC0021 Menekan Tombol Login
    Then TC0021 Validasi Message Error Login Kosong

  Scenario: TC0022 Username Dan Password Invalid
    When TC0022 Mengakses Halaman Website
    And TC0022 Mengkosongkan Field Untuk Login
    And TC0022 Input Username Invalid
    And TC0022 Input Password Invalid
    And TC0022 Menekan Tombol Login
    Then TC0022 Validasi Message Error Login Kosong

  Scenario: TC0023 Username Valid Dan Password Invalid
    When TC0023 Mengakses Halaman Website
    And TC0023 Mengkosongkan Field Untuk Login
    And TC0023 Input Username Valid
    And TC0023 Input Password Invalid
    And TC0023 Menekan Tombol Login
    Then TC0023 Validasi Message Error Login Kosong

  Scenario: TC0024 Username Empty Dan Password Invalid
    When TC0024 Mengakses Halaman Website
    And TC0024 Mengkosongkan Field Untuk Login
    And TC0024 Input Username Kosong
    And TC0024 Input Password Invalid
    And TC0024 Menekan Tombol Login
    Then TC0024 Validasi Message Error Login Kosong

  Scenario: TC0025 Username Valid Dan Password Kosong
    When TC0025 Mengakses Halaman Website
    And TC0025 Mengkosongkan Field Untuk Login
    And TC0025 Input Username Valid
    And TC0025 Input Password Kosong
    And TC0025 Menekan Tombol Login
    Then TC0025 Validasi Message Error Login Kosong

  Scenario: TC0026 Username Invalid Dan Password Kosong
    When TC0026 Mengakses Halaman Website
    And TC0026 Mengkosongkan Field Untuk Login
    And TC0026 Input Username Invalid
    And TC0026 Input Password Kosong
    And TC0026 Menekan Tombol Login
    Then TC0026 Validasi Message Error Login Kosong