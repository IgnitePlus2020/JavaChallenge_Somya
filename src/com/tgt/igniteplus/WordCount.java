package com.tgt.igniteplus;
/*
no of word=no of spaces + one
 */
import java.util.Scanner;

public class WordCount {
    public static void main(String[]args){
        String str;
        Scanner in=new Scanner(System.in);
        System.out.println("String  : ");
        str=in.nextLine();

int i=0,count=1;
        while (i<str.length()){
            if(str.charAt(i)==' ')
                count++;
            i++;
        }
        System.out.println("number of words = "+count);
    }
}
/*
there are 7 words in this sentence.
number of words = 7
 */