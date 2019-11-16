package com.bieganski;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BoardReader boardReader = new BoardReader();
        List<String> lines = boardReader.readFileToList("board.txt");
        for (String line:
             lines) {
            System.out.println(line);
        }
    }
}
