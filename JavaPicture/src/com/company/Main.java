package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        JavaPicture jp = new JavaPicture();

        jp.firstPicture();
        jp.secondPicture();

        RecursionTest rc = new RecursionTest();

        List<Integer> nList = Arrays.asList(8, 20, 50);
        for (Integer integer : nList) {

            rc.letsAdd(integer);
        }

    }
}
