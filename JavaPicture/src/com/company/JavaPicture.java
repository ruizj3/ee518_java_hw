package com.company;

import java.util.Scanner;
import java.lang.Math;

public class JavaPicture {
    private static Scanner scanner;

    public void firstPicture() {
        int  rows, j;
        scanner = new Scanner(System.in);

        System.out.print("Please Enter Number of Rows = ");
        rows = scanner.nextInt();

        int k = rows ;
        int i = 0 ;

        while( i <= k){
            j = 1;

            String str = new String(new char[k-i]).replace("\0", "#");
            String space = new String(new char[i]).replace("\0", " ");

            System.out.print(space);
            System.out.print(str);
            System.out.println();
            i++;
        }
    }

    public void secondPicture() {
        int rows, p;
        scanner = new Scanner(System.in);

        System.out.print("Please Enter Number of Rows = ");
        rows = scanner.nextInt();

        int k = rows ;
        int i = 1;
        int q = k;
        while (i <= k) {

            if (i == 1 || i == k) {
                String str = new String(new char[k]).replace("\0", "#");
                System.out.print(str);
                System.out.println();

            } else if (i < q){

                String str = new String(new char[1]).replace("\0", "#");
                String space = new String(new char[i-1]).replace("\0", " ");
                String space_2 = new String(new char[q-i-1]).replace("\0", " ");
                String space_3 = new String(new char[q-1]).replace("\0", " ");

                System.out.print(space);
                System.out.print(str);
                System.out.print(space_2);
                System.out.print(str);
                System.out.print(space_3);
                System.out.println();
            } else if (i > q) {
                String str = new String(new char[1]).replace("\0", "#");
                String space = new String(new char[i-1]).replace("\0", " ");
                String space_2 = new String(new char[i-q-1]).replace("\0", " ");
                String space_3 = new String(new char[q-1]).replace("\0", " ");

                System.out.print(space_3);
                System.out.print(str);
                System.out.print(space_2);
                System.out.print(str);
                System.out.print(space);
                System.out.println();

            } else {
                String str = new String(new char[1]).replace("\0", "#");
                String space = new String(new char[i-1]).replace("\0", " ");
                String space_3 = new String(new char[q-1]).replace("\0", " ");

                System.out.print(space_3);
                System.out.print(str);
                System.out.print(space);
                System.out.println();

            }

            i++;
            q--;
        }
    }

}
