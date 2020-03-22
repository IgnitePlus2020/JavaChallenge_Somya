package com.tgt.igniteplus;

import java.util.Scanner;

public class UglyNumber {
    public static Boolean uglyNum(int num){
        while(num%2==0)
            num/=2;
        while(num%3==0)
            num/=3;
        while(num%5==0)
            num/=5;
        if (num==1) return true;
        else return false;
    }
    public static void main(String []args){
        int num;
        Scanner in=new Scanner(System.in);
        num=in.nextInt();

        if (uglyNum(num))
            System.out.println(num+" is an ugly number");
        else  System.out.println(num+ " is not an ugly number");

    }
}
/*
1
1is an ugly number
65
65 is not an ugly number
**********************************
1
1 is an ugly number
 */
