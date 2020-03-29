package com.tgt.igniteplus;

import java.util.Scanner;
//check if a number is a perfect square
public class PerfectSquare {
   static Boolean perfectSquare(int n){
       System.out.println(Math.sqrt(n));
        if (Math.sqrt(n)==(int)Math.sqrt(n))
        return true;
        else return false;
    }


    public static void  main(String [] args){
        int n;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        if(perfectSquare(n))
        System.out.println(n+" is perfect square");
        else
            System.out.println(n+" is not perfect square");
    }
}
/*
2
1.4142135623730951
2 is not perfect square
*************************************
49
7.0
49 is perfect square
 */