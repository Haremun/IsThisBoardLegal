package com.bieganski.board;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BoardReader {

    public List<String> readFileToList(String fileName) {
        if (fileName == null)
            throw new NullPointerException("File name can't be null!");

        List<String> lines = new ArrayList<>();

        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource(fileName); //get File URL
        //System.out.println(resource.toString());
        if (resource != null)
            try {
                File file = new File(resource.getFile()); //loading file
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                while ((line = br.readLine()) != null) {
                    lines.add(line); //adding each line to list
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        else {
            throw new IllegalArgumentException("There is no file like: " + fileName);
        }
        return lines;
    }
}
