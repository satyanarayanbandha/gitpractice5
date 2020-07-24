package com.DataFlair.FileHandling; 
import java.io.FileReader;  
public class ReadContentsFromFile {
  
    public static void main(String args[])throws Exception{    
          FileReader filereadObj=new FileReader("/home/dfuser/Desktop/dataflair.txt");    
          int iterator;    
          while((iterator=filereadObj.read())!=-1)    
          System.out.print((char)iterator);    
          filereadObj.close();    
    }    
}