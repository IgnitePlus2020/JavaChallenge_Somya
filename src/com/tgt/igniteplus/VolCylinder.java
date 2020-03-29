package com.tgt.igniteplus;
/*
rad cylinder =pi*r^2*h
 */
import java.util.Scanner;

public class VolCylinder {

    static double volumeCylinder(double radius,double height){
        return Math.PI*radius*radius*height;
    }

    public static void main(String[]args){
        double radius,height;
        Scanner in=new Scanner(System.in);

        System.out.print("enter radius of cylinder : ");
        radius=in.nextDouble();
        System.out.print("enter height of cylinder : ");
        height= in.nextDouble();

        System.out.println("volume of cylinder = "+volumeCylinder(radius,height));
    }
}
/*
enter radius of cylinder : 3.75
enter height of cylinder : 3.1
volume of cylinder = 136.95380474243004
 */