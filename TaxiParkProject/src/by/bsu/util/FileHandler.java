package by.bsu.util;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Igor on 16.10.2016.
 */
public class FileHandler {
    public File createFile() throws IOException {
        final String FILE = "cars.txt";
        File file = null;
        try {
            file = new File(FILE);
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

    public ArrayList<String> readFile(File file) throws IOException {
        ArrayList<String> list = null;
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String str;
            while ((str = in.readLine()) != null) {
                list.add(str);
            }
        }
        catch (IOException e) {
            System.out.println("Exception occured" + e);
        }
        return list;
    }
}
