package coid.juaracoding.pcmcucumber;

import coid.juaracoding.pcmcucumber.util.OpenCVFunction;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        /** example compare image */
//        String filename1 = "D:\\SQA-Batch-16\\pcmcucumber\\src\\main\\resources\\data\\gambar-awal.jpg";
//        String filename2 = "D:\\SQA-Batch-16\\pcmcucumber\\src\\main\\resources\\data\\gambar-awal.jpg";
//        String filename2 = "D:\\download-automation\\gambar-180-abu-abu.png";
//        System.out.println(ManipulateImage.compareImage(filename1,filename2));

//        OpenCVFunction.rotateImage("D:\\SQA-Batch-16\\pcmcucumber\\src\\main\\resources\\data\\gambar-awal.jpg",
//                "D:\\SQA-Batch-16\\pcmcucumber\\src\\main\\resources\\data\\gambar-awal-rot-90.png",
//                90);

        OpenCVFunction.rotateImage("D:\\SQA-Batch-16\\pcmcucumber\\src\\main\\resources\\data\\Gambar-Trx-1-Ori.png",
                "D:\\download-automation\\gambar-awal-rot-90.png",
                90);
//        OpenCVFunction.loadLibraries();
//        System.out.println("1000000000".length());
//        System.out.println("9999999999".length());
//        System.out.println("6546546546".length());

        String strLabelOne = "";
        String strLabelTwo = "";
        String strLabelThree = "";

        strLabelOne = "OK";// true -> false
        strLabelTwo = "List Data";// true
        strLabelThree = "copyright 2000";

        // 1. Komponen nya ada perubahan dari xpath ataupun id?
        // 2. boolean isValid = (strLabelOne.equals("OK") ||
        // strLabelTwo.equals("List Data") ||
        // strLabelThree.equals("copyright 2000"))
        // Assert.assertTrue(isValid);// PASS / Lolos
    }
}