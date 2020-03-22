package com.tgt.igniteplus;

import java.util.Scanner;
/*
average =sum_of_elements/no_of_elements
 */
public class Average {
    static float Average(float[] ele,int n){
        float avg=0,sum=0;
        for(int i=0;i<n;i++) {
            avg +=( ele[i])/n;
        }
      //  avg=sum/n;
        return avg;
    }
    //DRIVER CODE
    public static void  main(String [] args){

        float[] elements=new float[100000];
        int n,i;
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the numbers of elements");
        n=in.nextInt();
        System.out.println("Enter the Array elements");
        for(i=0;i<n;i++)    elements[i] = in.nextFloat();


        System.out.println("Average=" + Average(elements,n));
    }
}
/*
Enter the numbers of elements
3
Enter the Array elements
10.3
7.9
8.8
Average=9.0
 */