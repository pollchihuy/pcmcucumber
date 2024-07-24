package coid.juaracoding.pcmcucumber.util;

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
        String [] strColumn = {"username",
                "password",
        "alamat",
        "nohp",
        "email"};
        System.out.println("|"+strColumn[0]+"|"
                +strColumn[1]+"|"
                +strColumn[2]+"|"
                +strColumn[3]+"|"
                +strColumn[4]+"|"
        );
        for(int i=0;i<requestData;i++){
            System.out.println("|"+dGen.dataUsername().replace("|",
                    "")+"|"+dGen.dataPassword().replace("|",
                    "")+"|"+dGen.dataAlamat().replace("|",
                    "")+"|"+dGen.dataNoHp().replace("|",
                    "")+"|"+dGen.dataEmail().replace("|",
                    "")+"|");
        }
    }
}