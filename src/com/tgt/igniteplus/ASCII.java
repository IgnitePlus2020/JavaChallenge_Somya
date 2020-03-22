package com.tgt.igniteplus;

import java.util.Date;
import java.util.Scanner;

public class ASCII {
    static int ASCIIValue(char c){
        return (int)c;
    }
    public static void main(String[]args){
        char c;
        Scanner in=new Scanner(System.in);
        c=in.next().charAt(0);
        System.out.println(ASCIIValue(c));
    }
}
/*
@
64
 */