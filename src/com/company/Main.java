package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        //Enter data using BufferReader
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.println( "Write a name" );

        // Reading data using readLine
        String name1 = reader.readLine();

        // Printing the read line
        System.out.println( "You wrote " + name1);

        System.out.println( "Write another name" );

        // Reading data using readLine
        String name2 = reader.readLine();

        // Printing the read line
        System.out.println( "You wrote " + name2);

        System.out.println(name1 + " ❤ " + name2);

        // ❤
    }
}
