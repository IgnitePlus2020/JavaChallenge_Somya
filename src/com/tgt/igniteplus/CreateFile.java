package com.tgt.igniteplus;

import java.io.*;

public class CreateFile {
    public  static  void main(String[] args){
        try{
            File file=new File("C:\\Users\\SOMYA\\IdeaProjects\\JavaChallenge_Somya\\myfile.txt");
            if (file.createNewFile())System.out.println("Success!");
            else  System.out.println("Error file already exists.");
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
/*
Success!
 */