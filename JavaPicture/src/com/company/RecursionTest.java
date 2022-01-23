package com.company;

import java.util.*;
import java.io.*;

public class RecursionTest {

    private static Scanner scanner;

    public void letsAdd(int nIntegers) {

        //scanner = new Scanner(System.in);

        //System.out.print("Please Enter Largest Integer for Summation = ");
        //nIntegers = scanner.nextInt();
        int i = 1;
        int j = 0;
        while(i <= nIntegers){
            j += i;
            i++;
        }
        System.out.println("Total Summation = "+j);

    }

}
