package com.tgt.igniteplus;
/*
reference: https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
 */
public class Permutations {
    public static void main(String[] args)
    {
        String str = "GOD";
        int strlen = str.length();

        permute(str, 0, strlen - 1);
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


    public static String swap(String s, int i, int j)
    {
        char temp;
        char[] c = s.toCharArray();
        temp = c[i];
        c[i] = c[j];
        c[j] = temp;
        return String.valueOf(c);
    }
}
/*
GOD
GDO
OGD
ODG
DOG
DGO

 */