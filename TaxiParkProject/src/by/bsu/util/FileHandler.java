package by.bsu.util;

import java.io.*;

/**
 * Created by Igor on 16.10.2016.
 */
public class FileHandler {
    public File createFile() throws IOException {
        File file = null;
        try {
            file = new File("C:/file.txt");
            if (file.createNewFile())
                System.out.println("Success!");
            else
                System.out.println("Error, file already exists.");
        } catch (IOException e) {
            System.out.println("Exception occured" + e);
        }
        return file;
    }

    public void appendString(File file, String str) throws IOException {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(file));
            out.write(str);
            out.close();
        }
        catch (IOException e) {
            System.out.println("Exception occured" + e);
        }
    }

    public void readFile(File file) throws IOException {
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
        }
        catch (IOException e) {
            System.out.println("Exception occured" + e);
        }
    }
}
