package coid.juaracoding.pcmcucumber;

import coid.juaracoding.pcmcucumber.util.OpenCVFunction;

public class Main {
    public static void main(String[] args) {
        /** example compare image */
//        String filename1 = "D:\\SQA-Batch-16\\pcmcucumber\\src\\main\\resources\\data\\gambar-awal.png";
//        String filename2 = "D:\\SQA-Batch-16\\pcmcucumber\\src\\main\\resources\\data\\gambar-awal.png";
//        String filename2 = "D:\\download-automation\\gambar-180-abu-abu.png";
//        System.out.println(ManipulateImage.compareImage(filename1,filename2));

        OpenCVFunction.rotateImage("D:\\SQA-Batch-16\\pcmcucumber\\src\\main\\resources\\data\\gambar-awal.png",
                "D:\\SQA-Batch-16\\pcmcucumber\\src\\main\\resources\\data\\gambar-awal-rot-90.png",
                90);
        OpenCVFunction.loadLibraries();
    }
}