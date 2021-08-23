package com.checking;

public class JavaPrgm_to_printinOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

     int i=1,j=5;
     
//     for(int i=1; i <=10;i++){
//    	 int  c=0;
//    	while(c!=i)
//    	 {
//    		 c=c+1;
//    		 System.out.print(c+" ");
//    		
//    	 }
//    	System.out.println();
//     }
     for(int x=i;x<=j;x++)
     {
    	 for(int y=1;y<=x;y++){
    		 System.out.print(y);
    		 System.out.print(" ");
    		 
    	 }
    	 System.out.println();
     }

	}

}
