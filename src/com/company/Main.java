package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        //Enter data using BufferReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //String[] meuArray = new String(10)

        System.out.println( "Write a name" );
            String name1;
                name1 = reader.readLine();
                    System.out.println( "You wrote " + name1);

        System.out.println( "Write another name" );
            String name2;
                name2 = reader.readLine();
                    System.out.println( "You wrote " + name2);

        System.out.println( "Write another name" );
            String name3;
                name3 = reader.readLine();
                    System.out.println( "You wrote " + name3);

        System.out.println( "Write another name" );
            String name4;
                name4 = reader.readLine();
                    System.out.println( "You wrote " + name4);

        System.out.println( "Write another name" );
            String name5;
                name5 = reader.readLine();
                    System.out.println( "You wrote " + name5);

        System.out.println( "Write another name" );
            String name6;
                name6 = reader.readLine();
                    System.out.println( "You wrote " + name6);

        System.out.println( "Write another name" );
            String name7;
                name7 = reader.readLine();
                    System.out.println( "You wrote " + name7);

        System.out.println( "Write another name" );
            String name8;
                name8 = reader.readLine();
                    System.out.println( "You wrote " + name8);

        System.out.println( "Write another name" );
            String name9;
                name9 = reader.readLine();
                    System.out.println( "You wrote " + name9);

        System.out.println( "Write one last name" );
            String name10;
                name10= reader.readLine();
                    System.out.println( "You wrote " + name10);

        System.out.println(name1 + " ❤ " + name2 + " ❤ " + name3 + " ❤ " + name4 + " ❤ " + name5 + " ❤ " + name6 + " ❤ " + name7 + " ❤ " + name8 + " ❤ " + name9 + " ❤ " + name10);

    }
}