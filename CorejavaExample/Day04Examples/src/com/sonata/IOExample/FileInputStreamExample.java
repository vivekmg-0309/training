package com.sonata.IOExample;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;//handling of error msg


public class FileInputStreamExample
{
	public static void main(String[] args) throws IOException{
		 FileOutputStream fos = new FileOutputStream("D://test.txt");
	      FileInputStream fis = new FileInputStream("D://test.txt");//
	      byte b = 68;
	      int i = 0;//check the condition is -1
	      char c;
	      try {
	    	  fos.write(b); //read the b value
	    	  //reading functionality
	    	  while((i = fis.read())!=-1) {
	    		  c = (char)i;//covert
	    		  System.out.print(c);//print
	    	  }
	    	  
	      }finally {
	    	  if(fos!=null)
	              fos.close();
	    	  if(fis!=null)
	              fis.close();
	      }} 
	}


