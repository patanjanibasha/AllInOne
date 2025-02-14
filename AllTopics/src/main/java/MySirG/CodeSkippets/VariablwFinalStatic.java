package MySirG.CodeSkippets;

public class VariablwFinalStatic {
	 final static double PI = 3.14159; // Constant initialized at the time of declaration
	    final static int MAX_USERS;

	    static {
	        MAX_USERS = 100; // Initialized in a static block
	    }

	    public static void main(String[] args) {
	        System.out.println("Value of PI: " + PI);       // Prints: 3.14159
	        System.out.println("Max Users: " + MAX_USERS); // Prints: 100
	    }

}
//Static variables declared as final are used to define constants in a class. 
//These are initialized only once, typically at the time of declaration or inside a static block.

// Why Use Final Variables?
// Immutability:

//final variables ensure that values remain constant, which is useful for defining constants like PI, E,
// or other fixed parameters