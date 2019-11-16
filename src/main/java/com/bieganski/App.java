package com.bieganski;

import java.util.List;

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
