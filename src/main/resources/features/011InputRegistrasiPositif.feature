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
    And TC0111 Mengisi Field <socoid> Soco Id
    And TC0111 Mengisi Field <namalengkap> Nama Lengkap Nasabah
    And TC0111 Mengisi Field <nohp> Nomor Handphone Yang Terdaftar Di Bca
    And TC0111 Mengisi Field <norek> Nomor Rekening Bca
    And TC0111 Memilih Opsi My Bca
    And TC0111 Mengisi Field <nominaltrx> Nominal Transaksi
    And TC0111 Mengisi Field Tanggal Transaksi
    And TC0111 Pilih Nama Merchant
    And TC0111 Mengisi Field <rrn> Rrn
    And TC0111 Upload Foto Bukti Transaksi1
    And TC0111 Upload Foto Bukti Transaksi2
    And TC0111 Upload Foto Bukti Transaksi3
    And TC0111 Menekan Tombol Submit Data
    Then TC0111 Validasi Simpan Data

    Examples:
      |socoid|namalengkap|nohp|norek|nominaltrx|rrn|
      |7748325760|Bima Atmadja|+628143061755|3241343814|553589|8552149312|
      |9091167727|Aditya Pradhana|+628123671928|5635738268|109517|7068448614|
      |4070352206|Bambang Gondokusumo|088649755058|9018532121|161270|3651085601|
      |1490994738|Deni Fachriawan|+628180741107|4149100596|147987|7124650033|
      |3234220580|Diah Budiman|084428935679|7602248115|605259|4522869669|
      |3679970083|Erika Satria|081350603761|9308725133|107940|3773857973|
      |5559191418|Valentinus Ikhsan|082216693961|4114380722|402178|1846076238|
      |2199183465|Kemal Djunaedi|+628948485046|5833071052|254741|3678257535|
      |6480391291|Yoga Triwijaya|082120870622|8052703770|530644|7812655882|
      |5084564623|Yossi Yulianto|086811672563|9970640263|229296|9417599622|