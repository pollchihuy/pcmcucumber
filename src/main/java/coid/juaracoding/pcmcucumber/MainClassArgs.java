package coid.juaracoding.pcmcucumber;

import coid.juaracoding.pcmcucumber.config.ContohConfig;

import java.util.HashMap;
import java.util.Map;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Fri 20:52
@Last Modified Fri 20:52
Version 1.0
*/
public class MainClassArgs {


    public static void main(String[] args) {
//        public ContohConfig(String delay,
//                String browser,
//        int timeout,
//        String url,
//        String extUrl,
//        String extUrl1,
//        String password)

        System.out.println("Delay : "+ContohConfig.getDelay());
        System.out.println("Browser : "+ContohConfig.getBrowser());
        System.out.println("Timeout : "+ContohConfig.getTimeout());
        System.out.println("Url : "+ContohConfig.getUrl());
        System.out.println("Ext Url : "+ContohConfig.getExtUrl());
        System.out.println("Url1 : "+ContohConfig.getExtUrl1());
        System.out.println("Password : "+ContohConfig.getPassword());
    }
}
