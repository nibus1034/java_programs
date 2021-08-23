package com.checking;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadfromFile {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
	String address="C:/Users/subin/Downloads/hii.txt";
	File f=new File(address);
	FileReader fr=new FileReader(f);
	BufferedReader br =new BufferedReader(fr);
	StringBuffer sb=new StringBuffer();
//	if(br.readLine().isEmpty() || br.readLine()==""){
//		System.out.println("Content Empty");
//	}
//	else{
		//fileName=fileName.concat(br.readLine());
		//System.out.println(br.readLine());
	String s;
		while((s=br.readLine())!=null)
	{
		//	System.out.println(s);
			sb.append(s);
	}
		
	System.out.println(sb);	
	}

}
