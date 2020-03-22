package com.tgt.igniteplus;

import java.util.Scanner;

public class ConcatenateStrings {

/*
+ operator concatenates two strings
 */
        public static void main(String[]args){
            String str1,str2;
            Scanner in=new Scanner(System.in);
            System.out.println("String 1 : ");
            str1=in.nextLine();
            System.out.println("String 2 : ");
            str2=in.nextLine();

          String  str=str1+str2;
          System.out.println(str);
        }
}
/*
String 1 :
abc
String 2 :
def
abc def
 */