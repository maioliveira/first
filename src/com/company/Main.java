package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        //Enter data using BufferReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] meuArray = new String[10];

        int arrayLength = meuArray.length;
        int contador = 0;
        while (contador < arrayLength) {
            System.out.println("Write a name");
            meuArray[contador] = new String(reader.readLine());
            System.out.println("You put " + meuArray[contador]);

            contador++;
        }

        //int contador2 = 0;
        //while (contador2 < arrayLength) {
        for (int contador2 = 0; contador2 < arrayLength; contador2++) {
            System.out.print(meuArray[contador2]);

          //contador2++;

            if (! (contador2 >= arrayLength)) {
                System.out.print(" ❤ ");

            }
        }
    }
}