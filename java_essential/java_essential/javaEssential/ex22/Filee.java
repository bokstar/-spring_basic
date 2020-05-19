package javaEssential.ex22;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Filee {


    public static void main(String[] args) {
    try {
        RandomAccessFile randomAccessFile = new RandomAccessFile("data.txt","rw");

        System.out.println(randomAccessFile.getFilePointer());
        randomAccessFile.writeInt(50);

        System.out.println(randomAccessFile.getFilePointer());
        randomAccessFile.seek(30);
        System.out.println(randomAccessFile.getFilePointer());
    }catch (IOException ie){
        ie.printStackTrace();
    }


    }

}
