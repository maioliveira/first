package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        //Enter data using BufferReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] meuArray = new String[10];

        //String name1, name2, name3, name4, name5, name6, name7, name8, name9, name10;

        System.out.println( "Write a name" );
                meuArray[0] = reader.readLine();
                    System.out.println( "You wrote " + meuArray[0]);

        System.out.println( "Write another name" );
                meuArray[1] = reader.readLine();
                    System.out.println( "You wrote " + meuArray[1]);

        System.out.println( "Write another name" );
                meuArray[2] = reader.readLine();
                    System.out.println( "You wrote " + meuArray[2]);

        System.out.println( "Write another name" );
                meuArray[3] = reader.readLine();
                    System.out.println( "You wrote " + meuArray[3]);

        System.out.println( "Write another name" );
                meuArray[4] = reader.readLine();
                    System.out.println( "You wrote " + meuArray[4]);

        System.out.println( "Write another name" );
                meuArray[5] = reader.readLine();
                    System.out.println( "You wrote " + meuArray[5]);

        System.out.println( "Write another name" );
                meuArray[6] = reader.readLine();
                    System.out.println( "You wrote " + meuArray[6]);

        System.out.println( "Write another name" );
                meuArray[7] = reader.readLine();
                    System.out.println( "You wrote " + meuArray[7]);

        System.out.println( "Write another name" );
                meuArray[8] = reader.readLine();
                    System.out.println( "You wrote " + meuArray[8]);

        System.out.println( "Write one last name" );
                meuArray[9] = reader.readLine();
                    System.out.println( "You wrote " + meuArray[9]);

        System.out.println(meuArray[0] + " ❤ " + meuArray[1] + " ❤ " + meuArray[2] + " ❤ " + meuArray[3] + " ❤ " + meuArray[4] + " ❤ " + meuArray[5] + " ❤ " + meuArray[6] + " ❤ " + meuArray[7] + " ❤ " + meuArray[8] + " ❤ " + meuArray[9]);

    }
}