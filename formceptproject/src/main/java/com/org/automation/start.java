package com.org.automation;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.security.auth.login.Configuration;



public class start {
	
	public String[][] initialize (String id,int size)
	{
		String arr[][]=new String[6][];
		
		
		for(int i=0;i<6;i++)
		{
			arr[i]=new String[size] ;
		}
		
	try
	{
	
		InputStream fileInput = getClass().getClassLoader().getResourceAsStream("config.properties");
		Properties properties = new Properties();
		properties.load(fileInput);
		fileInput.close();
		
		String foos=properties.getProperty(id);
		
	    String[] names=	foos.split("\\}");
	    int i=0;
	    for(String name:names)
	    	{
	    	int j=0;
	    	
	    	 
	    	
	    	  String[] names1=name.split("\\,");
	    	for(String k:names1)
	    	{   
	    		
	    		 arr[i][j]=k;
	    	     j++;
	    	}
	    	i++;
	    	  
	    	}
		        
		        
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
		

return arr;
	}
	
	
}

