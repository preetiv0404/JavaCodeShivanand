package com.loops;

public class enhancedForLoop {

	public enhancedForLoop() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Array of String storing days of the week
	     String days[] = { "Mon", "Tue", "Wed", "Thr", "Fri", "Sat", "Sun"};
	 
	     // Enhanced for loop, this will automatically iterate on the array list 
	     for (String dayName : days) {
	       System.out.println("Days ==> "+ dayName);
	     	}
	 
	     System.out.println("<==== Normal For Loop ====>");
	     // Normal for loop
	     for (int i=0; i < days.length; i++) {
	         System.out.println("Days ==> "+ days[i]);
	     	}

	}

}
