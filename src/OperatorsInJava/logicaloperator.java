package OperatorsInJava;

public class logicaloperator {

	public logicaloperator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean Output_1 = true;
		 boolean Output_2 = false;
		 System.out.println("Check if both the boolean variables are true : " + (Output_1 && Output_2));
		 System.out.println("Check if even one of the boolean varibale is true : " + (Output_1 || Output_2));
		 System.out.println("Change the state of the Output_1 to false : " + (!Output_1));

	}

}
