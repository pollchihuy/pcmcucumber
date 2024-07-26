package coid.juaracoding.pcmcucumber;

import coid.juaracoding.pcmcucumber.config.ContohConfig;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Fri 21:04
@Last Modified Fri 21:04
Version 1.0
*/
public class MainClassScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Environment Variable : ");
        String argz = scanner.nextLine();
        String argsArr [] = argz.split(" ");

        Map<String,Object> map = new HashMap<>();
        String [] strArr = new String[2];
        for (int i = 0; i < argsArr.length; i++) {
            strArr = argsArr[i].split("=");
            map.put(strArr[0], strArr[1]);
        }
        new ContohConfig(map.get("DELAY").toString(),
                map.get("BROWSER").toString(),
                Integer.parseInt(map.get("TIMEOUT").toString()),
                map.get("URL").toString(),
                map.get("EXT_URL").toString(),
                map.get("EXT_URL1").toString(),
                map.get("PWD").toString()
        );

        if(!ContohConfig.getPassword().equals("huruhara@3212")){
            System.out.println("Wrong Password!!");
            System.exit(0);
        }
        System.out.println("Delay : "+ContohConfig.getDelay());
        System.out.println("Browser : "+ContohConfig.getBrowser());
        System.out.println("Timeout : "+ContohConfig.getTimeout());
        System.out.println("Url : "+ContohConfig.getUrl());
        System.out.println("Ext Url : "+ContohConfig.getExtUrl());
        System.out.println("Url1 : "+ContohConfig.getExtUrl1());
        System.out.println("Password : "+ContohConfig.getPassword());
    }
}
//SIT
//UAT ->
//PRODUCTION