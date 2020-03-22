package com.tgt.igniteplus;
/*
a=97
A=65
if small: subtract diff between a-A
else copy same
 */
import java.util.*;

public class ToUpper {
    static char[] toUpper(String s){
        char[] str=new char[s.length()];
        for (int i = 0; i <s.length() ; i++) {
          str[i]=  s.charAt(i)>='a' && s.charAt(i)<='z'?(char)(s.charAt(i)-('a'-'A')):s.charAt(i);
        }
        return str;
    }
    //DRIVER CODE
    public static void main(String[]args){
        String str;
        Scanner in=new Scanner(System.in);
        System.out.println("enter a string");
        str=in.nextLine();
        System.out.println(toUpper(str));
    }
}

/*
enter a string
The Hindu
THE HINDU
 */