Feature: Login Negatif

  Scenario: Pta002 Empty Login
    When Pta002 Mengakses Halaman Website
    And Pta002 Mengkosongkan Field Untuk Login
    And Pta002 Input Username Kosong
    And Pta002 Input Password Kosong
    And Pta002 Menekan Tombol Login
    Then Pta002 Validasi Login Error Empty String

  Scenario: Pta003 Password Salah
    When Pta003 Mengkosongkan Field Untuk Login
    And Pta003 Input Username Valid
    And Pta003 Input Password Salah
    And Pta003 Menekan Tombol Login
    Then Pta003 Validasi Login Error Password Salah

#  Scenario: Pta004 Username Salah
#    When Pta004 Mengkosongkan Field Untuk Login
#    And Pta004 Input Username Salah
#    And Pta004 Input Password Valid
#    And Pta004 Menekan Tombol Login
#    Then Pta004 Validasi Login Error Username Salah

#  Scenario: Pta005 Username Dan Password Salah
#    When Pta005 Mengkosongkan Field Untuk Login
#    And Pta005 Input Username Salah
#    And Pta005 Input Password Salah
#    And Pta005 Menekan Tombol Login
#    Then Pta005 Validasi Login Error Username Dan Password Salah