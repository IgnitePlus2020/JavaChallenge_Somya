package com.tgt.igniteplus;

import java.io.*;

public class WriteToFile {

        public  static  void main(String[] args){
            try{
                String fileContent="writing to this file";
                FileOutputStream outputStream=new FileOutputStream("C:\\Users\\SOMYA\\IdeaProjects\\JavaChallenge_Somya\\myfile.txt");
               byte[] strToBytes=fileContent.getBytes();
               outputStream.write(strToBytes);
               outputStream.close();
            }
            catch (IOException ioe){
                ioe.printStackTrace();

        }
    }
}
