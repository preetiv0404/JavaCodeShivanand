package com.loops;

public class continueloop {

	public continueloop() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// This will print -- 0,1,2,4,5
		 for(int Count = 0;Count<=5;Count++){ 
		 if(Count==3){
		 continue; 
		 }
		 System.out.println("Count is ==> " + Count);
		 }
		 
		 // This will just print -- 3
		 System.out.println("<==== Next Count ====>");
		 for(int Count = 0;Count<=5;Count++){
		 if(Count==3){
		 System.out.println("Count is ==> " + Count);
		 continue; 
		 }

	}

}
}