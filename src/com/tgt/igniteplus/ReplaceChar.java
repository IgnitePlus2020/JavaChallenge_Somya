package com.tgt.igniteplus;

import java.util.Scanner;

public class ReplaceChar {
    public static void main(String[] args)
    {
        String str;
        Scanner in=new Scanner(System.in);
        System.out.print("enter String : ");
        str=in.nextLine();
        char[]s=str.toCharArray();
        for (int i = 0; i <str.length(); i++) {
            if(s[i]=='a')
                s[i]='$';
        }
      str=new String(s);
        System.out.println(str);

    }

}
/*
enter String : I am always ready to learn although i do not always like being taught
I $m $lw$ys re$dy to le$rn $lthough i do not $lw$ys like being t$ught
 */