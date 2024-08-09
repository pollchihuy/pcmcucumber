package coid.juaracoding.pcmcucumber;

import io.cucumber.core.cli.Main;

public class MainCucumber {

    public static void main(String[] args) {

        try {
            Main.main(new String[]
                    {
                            "-g","coid.juaracoding.pcmcucumber.impl.sociola.login",//INI ADALAH GLUE YANG KALIAN TULIS DI RUNNER CLASS KALIAN
                            "classpath:features",
                            "-p","pretty",
                            "-p","html:data-report/PTA/htmlreport/runner.html",
                            "-p","json:data-report/PTA/jsonreport/runner.json",
                            "-p","junit:data-report/PTA/junitreport/runner.xml",
                            "-m"
                    });
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Main Class Execption : "+e);
        }
    }
}