package com.tgt.igniteplus;

import java.util.Scanner;

public class LargestOf3 {
    public static void main(String[] args){
        int a,b,c;
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();

       int max  =   a>b ?   a>c?a:c:b>c?b:c;
       System.out.println(max);
    }
}
/*
10
45
-67
45
 */