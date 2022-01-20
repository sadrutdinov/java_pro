package com.sai.work_with_files;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) throws IOException {

        System.out.println("start");
        try (FileReader fileReader = new FileReader("src/com/sai/work_with_files/test1.txt")) {
            int character = 0;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("done");

    }
}
