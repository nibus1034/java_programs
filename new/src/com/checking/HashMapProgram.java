package com.checking;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]={1,2,3,4,5,5,1,1,2,1,1};
		System.out.println(arr.length);
		
		String ar=arr.toString();
		
		Set s= new HashSet();
		s.add(Integer.valueOf(ar));
		
		
		System.out.println("Set"+s);
		

		HashMap hm= new HashMap();
		int count=0;
		for(int i=0;i<arr.length;i++){
			count=0;
			for(int j=i+1;j<arr.length-1;j++){
			if(arr[i]==arr[j])
			{	count++;}
			
			hm.put(Integer.valueOf(arr[i]),Integer.valueOf(count));
			}
			
		}

		
		//webd
		System.out.println(hm);
	}

}
