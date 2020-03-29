package com.tgt.igniteplus;

import java.util.Scanner;

public class ReplaceChar {
    public static void main(String[] args)
    {
        String str;
        char replaceChar,replaceWithChar;
        Scanner in=new Scanner(System.in);
        System.out.print("enter String : ");
        str=in.nextLine();
        System.out.print("enter character to be replaced : ");
        replaceChar=in.next().charAt(0);
        System.out.print("replace with character : ");
        replaceWithChar=in.next().charAt(0);
        char[]s=str.toCharArray();
        for (int i = 0; i <str.length(); i++) {
            if(s[i]==replaceChar)
                s[i]=replaceWithChar;
        }
      str=new String(s);
        System.out.println(str);

    }

}
/*
enter character to be replaced : a
replace with character : $
I $m $lw$ys re$dy to le$rn $lthough i do not $lw$ys like being t$ught
 */