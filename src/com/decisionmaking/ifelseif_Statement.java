package com.decisionmaking;

public class ifelseif_Statement {

	public ifelseif_Statement() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sDay = "Monday";
		 int iDay = 1;
		 
		 if(sDay.equals("Sunday")){
		 System.out.println("Today is Sunday");
		 }else if(sDay.equals("Saturday")){
		 System.out.println("Today is Saturday");
		 }else{
		 System.out.println("Today is another Weekday");
		 }
		 
		 if(iDay==7){
		 System.out.println("Today is Sunday");
		 }else if(iDay==6){
		 System.out.println("Today is Saturday");
		 }else{
		 System.out.println("Today is a another Weekday");
		 }

	}

}
