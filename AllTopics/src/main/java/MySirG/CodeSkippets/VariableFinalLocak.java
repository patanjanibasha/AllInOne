package MySirG.CodeSkippets;

public class VariableFinalLocak {

	    public static void main(String[] args) {
	        final int localVar; // Declared
	        localVar = 50;      // Initialized

	        // localVar = 60;   // Error: Cannot reassign a value to a final variable
	        System.out.println(localVar); // Prints: 50
	    }
	}


// use after initializes
// cannot re-asign value