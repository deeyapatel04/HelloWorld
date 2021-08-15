package com.company;
import java.io.*;


public class Main {

    public static void main(String[] args) {
        int x = 10;
        int y = 15;
	    // write your code here

        System.out.println(add(x, y));
        System.out.println(add(10, 20));
        System.out.println(add(x, y));
        System.out.println(add(x, y));

        int total = 0;
        for (int i=0; i<5; i=i+1) {
            total = total + i;
            System.out.println("loop-start");
            System.out.format("i=%d, total=%d\n", i, total);
            System.out.println("loop-end");
        }
        //System.out.println(total);
    }

    public static int add(int x, int y) {
        return x+y;
    }
}
