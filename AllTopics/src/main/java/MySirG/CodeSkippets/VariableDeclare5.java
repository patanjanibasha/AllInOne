package MySirG.CodeSkippets;

import MySirG.CodeSkippets.VariableInstance6;

public class VariableDeclare5 {
int x;
	public static void main(String[] args) {
	    int x;
	    VariableDeclare5 o= new VariableDeclare5();
    	 System.err.println(o.x); 
    	// System.err.println(x); 
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