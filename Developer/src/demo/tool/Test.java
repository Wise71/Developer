package demo.tool;

import java.io.*;
 
public class Test {
 
    public static void main(String[] args) {
    	try(BufferedReader br = new BufferedReader(new FileReader("C:\\notes5.txt")))
    	{
    	    //чтение построчно
    	    String s;
    	    while((s=br.readLine())!=null){
    	                 
    	        System.out.println(s);
    	    }
    	}
    	 catch(IOException ex){
    	             
    	    System.out.println(ex.getMessage() +"aaaa");
    	} 
    }   
}