package com.tgt.igniteplus;

import java.util.Date;
import java.util.Scanner;

public class Ascii {
    static int convertToAsciiValue(char character){
        return (int)character;
    }
    public static void main(String[]args){
        char character;
        Scanner in=new Scanner(System.in);
        character=in.next().charAt(0);
        System.out.println(convertToAsciiValue(character));
    }
}
/*
@
64
 */