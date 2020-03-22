package com.tgt.igniteplus;
/*
rad cylinder =pi*r^2*h
 */
import java.util.Scanner;

public class VolCylinder {

    static double volumeCylinder(double r,double h){
        return Math.PI*r*r*h;
    }

    public static void main(String[]args){
        double r,h;
        Scanner in=new Scanner(System.in);

        System.out.print("enter radius of cylinder : ");
        r=in.nextDouble();
        System.out.print("enter radius of cylinder : ");
        h= in.nextDouble();

        System.out.println("volume of cylinder = "+volumeCylinder(r,h));
    }
}
/*
enter radius of cylinder : 3.75
enter radius of cylinder : 3.1
volume of cylinder = 136.95380474243004
 */