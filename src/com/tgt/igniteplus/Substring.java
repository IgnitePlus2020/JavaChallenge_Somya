package com.tgt.igniteplus;

import java.util.Scanner;
/*
Naive string matching algorithm  :O(N)=n^2
 */
public class Substring {
    public  static  void  main(String[] args){

            String str1,str2;
            Scanner in=new Scanner(System.in);
            System.out.println("String 1 : ");
            str1=in.nextLine();
            System.out.println("String 2 : ");
            str2=in.nextLine();
            int s1Len=str1.length(),s2Len=str2.length();

        System.out.println(s1Len-s2Len);

            for (int i=0;i<=s1Len-s2Len;i++){
                int j;
                for (j=0; j <s2Len ; j++) {
                    if(str1.charAt(i+j)!=str2.charAt(j))
                        break;

                }
                if(j==s2Len)
                    System.out.println("pattern found at pos : "+(i+1));
            }
    }
}
/*
String 1 :
abchfabc
String 2 :
abc
5
pattern found at pos : 1
pattern found at pos : 6
 */