package coid.juaracoding.pcmcucumber;

import io.cucumber.core.cli.Main;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Fri 22:00
@Last Modified Fri 22:00
Version 1.0
*/
public class MainCucumber {

    public static void main(String[] args) {

        try {
            Main.main(new String[]
                    {
                            "-g","coid.juaracoding.pcmcucumber.impl.sociola.login",
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
