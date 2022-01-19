package com.sai.work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = "Когда, стройна и светлоока,\n" +
                "Передо мной стоит она…\n" +
                "Я мыслю: «В день Ильи-пророка\n" +
                "Она была разведена!\n";


        String s = "Privet";

        FileWriter writer = null;

        try {
            writer = new FileWriter("src/com/sai/work_with_files/test1.txt", true);
//            for (int i = 0; i < rubai.length(); i++) {
//                writer.write(rubai.charAt(i));
//            }

            writer.write(rubai);
            writer.write(s);
            System.out.println("done");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }


    }






}
