package com.array;

public class returningArray {

	public returningArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] aMake = ReturnArray();
		 for(int i = 0;i<=aMake.length-1;i++){
		 System.out.println("Printing all the values of an Array ==> " + aMake[i]);
		 }
	}
	//This method returns an Array of type String
	 public static String[] ReturnArray() {
	 String [] aArray = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};  
	   return aArray;
	 }
}
