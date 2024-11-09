package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/admin/IdeaProjects/JavaAdvancedFeatures46/src/io/hello.txt");
            FileOutputStream outputStream = new FileOutputStream("/Users/admin/IdeaProjects/JavaAdvancedFeatures46/src/io/outputFile.txt");

            int c;
            while ((c = fileInputStream.read()) != -1){
                outputStream.write(c);
            }

        }catch (IOException fileNotFoundException){
            System.out.println("File not found" + fileNotFoundException);
        }
    }

}
