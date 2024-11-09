package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileReader reader = new FileReader("/Users/admin/IdeaProjects/JavaAdvancedFeatures46/src/io/hello.txt");
            FileWriter writer = new FileWriter("/Users/admin/IdeaProjects/JavaAdvancedFeatures46/src/io/outputCharacterStream.txt");

            int c;
            while ((c = reader.read()) != -1) {
                writer.append((char) c);
            }

            writer.close();
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
