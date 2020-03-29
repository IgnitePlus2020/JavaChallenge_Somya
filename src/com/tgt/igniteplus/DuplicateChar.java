package com.tgt.igniteplus;

/*
hashing
if first occurrence:increase
if second occurrence:increase print
any more occurrences: continue;
 */
import java.util.Scanner;

public class DuplicateChar {
    public static void main(String[]args) {
        String str;

        int []countChar=new int[26];
        Scanner in = new Scanner(System.in);
        System.out.println("String  : ");
        str = in.nextLine();
        char[] s=str.toCharArray();

        for (int i = 0; i <s.length ; i++) {
            int count=countChar[s[i]-'a'];

            if(count==0)
                countChar[s[i]-'a']++;
            else if(count==1) {
                System.out.println(s[i]);
                //will not be printed on next encounter
                countChar[str.charAt(i)-'a']++;
            }

        }

    }
}
/*
String  :
abcahjdshc
a
h
c
 */