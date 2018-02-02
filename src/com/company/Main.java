package com.company;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        FileReader colors = new FileReader("html.txt");
        Scanner colors2 = new Scanner(colors);
        String[] htmlName = new String[148];
        for (int i=0; i<148; i++){

            htmlName[i] = colors2.next();
            colors2.nextLine();
        }

        String[] hex = new String[148];


        Scanner colors3 = new Scanner(colors);
        for (int i=0; i<148; i++){

            colors3.next();
            hex[i] = colors3.next();
            colors2.nextLine();
        }

        Scanner userIn = new Scanner(System.in);
        System.out.println("Enter an html color and get the hexadecimal value!");
        String color = userIn.nextLine().toLowerCase();
        int arr = -1;
        for (int i=0; i<148; i++){

            if (htmlName[i].contains(color)){
                arr = i;
            }
        }
        if (arr == -1){
            System.exit(1);

        }
        System.out.println(hex[arr]);

        colors2.close();

    }
}
