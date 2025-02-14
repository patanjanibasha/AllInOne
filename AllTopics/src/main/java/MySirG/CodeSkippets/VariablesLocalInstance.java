package MySirG.CodeSkippets;

public class VariablesLocalInstance {
	int  x; // Instance variable, default value is 0 by JVM
    boolean b; // Instance variable, default value is false  by JVM

    public static void main(String[] args) {
    	int y ; // error when u call
    	boolean bl ;   // error when u call
    	
    	VariablesLocalInstance e = new VariablesLocalInstance();
        System.out.println(e.x); // Prints: 0 
        System.out.println(e.b); // Prints: false
        
     //   System.out.println(y); // error
     //   System.out.println(bl); //error 
    }
}
