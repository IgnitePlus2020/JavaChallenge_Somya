package com.tgt.igniteplus;

import java.util.Scanner;

public class LargestOf3 {
    public static void main(String[] args){
        int num1,num2,num3;
        Scanner in=new Scanner(System.in);
        num1=in.nextInt();
        num2=in.nextInt();
        num3=in.nextInt();

       int max  =   num1>num2 ?   num1>num3?num1:num3:num2>num3?num2:num3;
       System.out.println(max);
    }
}
/*
10
45
-67
45
 */