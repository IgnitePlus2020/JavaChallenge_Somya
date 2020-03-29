package com.tgt.igniteplus;

import java.util.Scanner;

/*
reference: https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
 */
public class Permutations {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String str;
        System.out.print("enter String : ");
        str=in.nextLine();
        int stringLength= str.length();

        permute(str, 0, stringLength - 1);
    }


    public static void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);

                permute(str, l + 1, r);

                str = swap(str, l, i);
            }
        }
    }


    public static String swap(String string, int i, int j)
    {
        char temp;
        char[] characterArray = string.toCharArray();
        temp = characterArray[i];
        characterArray[i] = characterArray[j];
        characterArray[j] = temp;
        return String.valueOf(characterArray);
    }
}
/*
enter String : GOD
GOD
GDO
OGD
ODG
DOG
DGO
 */