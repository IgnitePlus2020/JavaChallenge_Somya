package com.tgt.igniteplus;

import java.util.Scanner;
/*
average =sum_of_elements/no_of_elements
 */
public class Average {
    static float average(float[] elements,int n){
        float average=0,sum=0;
        for(int i=0;i<n;i++) {
            average +=( elements[i])/n;
        }
      //  average=sum/n;
        return average;
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


        System.out.println("Average=" + average(elements,n));
    }
}
/*
elements
 */