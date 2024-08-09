package coid.juaracoding.pcmcucumber.scenariomapping;

public enum LoginTesting {

//    T1("Tc0011 Valid Login");
    T1("TC00111 Valid Login");
//    T2("TC0021 Empty Login");
//    T3("TC0022 Username Dan Password Invalid"),
//    T4("TC0023 Username Valid Dan Password Invalid"),
//    T5("TC0024 Username Empty Dan Password Invalid"),
//    T6("TC0025 Username Valid Dan Password Kosong"),
//    T7("TC0026 Username Invalid Dan Password Kosong"),
//    T8("TC01111 Input Form Registrasi"),
//    T9("TC0141 Validasi Menu Verifikasi");

    private String testName;

    private LoginTesting(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }
}