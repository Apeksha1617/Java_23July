package filehandling;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(
                    "/home/vaibhav/JavaBatches/July18/src/filehandling/test2.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Welcome");
            System.out.println("file write successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        FileReader fileReader =null;

        try {
            fileReader = new FileReader("/home/vaibhav/JavaBatches/July18/src/filehandling/test2.txt");
            int i = fileReader.read();
            while (i>0){
                System.out.println((char) i);
                i = fileReader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}