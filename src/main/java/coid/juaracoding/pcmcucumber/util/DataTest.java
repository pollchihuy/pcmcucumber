package coid.juaracoding.pcmcucumber.util;

import java.util.Random;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Wed 20:15
@Last Modified Wed 20:15
Version 1.0
*/
public class DataTest {
    private static Random random = new Random();
    private static DataGenerator dGen = new DataGenerator();
    public static void main(String[] args) {
        /** 1. data otentikasi */
//        dataTestLogin(10);
        dataTestRegistrasi(10);
    }

    public static void dataTestLogin(int requestData){
        String [] strColumn = {"username","password"};
        System.out.println("|"+strColumn[0]+"|"+strColumn[1]+"|");
        for(int i=0;i<requestData;i++){
            System.out.println("|"+dGen.dataUsername().replace("|","")+"|"+dGen.dataPassword().replace("|","")+"|");
        }
    }

    public static void dataTestRegistrasi(int requestData){
        String [] strColumn = {"socoid",
                "namalengkap",
                "nohp",
                "norek",
                "nominaltrx",
        "rrn"};
        System.out.println("|"+strColumn[0]+"|"
                +strColumn[1]+"|"
                +strColumn[2]+"|"
                +strColumn[3]+"|"
                +strColumn[4]+"|"
                +strColumn[5]+"|"
        );


        for(int i=0;i<requestData;i++){
            System.out.println("|"+random.nextLong(1000000000L,9999999999L)+"|"+
                    dGen.dataNamaLengkap().replace("|", "")+"|"
                    +dGen.dataNoHp().replace("|","")+"|"
                    +random.nextLong(1000000000L,9999999999L)+"|"
                    +random.nextInt(100000,999999)+"|"
                    +random.nextLong(1000000000L,9999999999L)+"|");
        }
    }
}