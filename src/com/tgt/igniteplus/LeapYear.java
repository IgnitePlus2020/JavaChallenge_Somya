package com.tgt.igniteplus;

import java.util.Scanner;
/*
if :
year is divisible by 400 then leap_year
else if :
year is divisible by 100 then not_leap_year
else if:
 year is divisible by 4 then is_leap_year
else :
not_leap_year
 */
public class LeapYear {
    static Boolean leapYear(int year){
        if (year % 400 == 0)
            return true;

        if (year % 100 == 0)
            return false;

        if (year % 4 == 0)
            return true;
        return false;
    }

    public static void  main(String [] args){
        int year;
        Scanner in=new Scanner(System.in);
        year=in.nextInt();
        if(leapYear(year))
            System.out.println(year+" is leap year");
        else
            System.out.println(year+" is not leap year");
    }
}
/*
2020
2020 is leap year
******************************
1900
1900 is not leap year
 */