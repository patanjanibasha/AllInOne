package MySirG.CodeSkippets;

import MySirG.CodeSkippets.VariableInstance6;

public class VariableDeclare4 {

	public static void main(String[] args) {
	   final int y=6;
	
    	 System.err.println(y); 
	}

}


//error
//0
//null
//GC value


//----------------
//we cannot declare variables in main method without intialization 
//int x;// error
//int x=10; //ok
//only in class level only we can declare
//we only can hav final type variable only in main method