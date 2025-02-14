package MySirG.CodeSkippets;

public class VariableFinal {

	final int MAX_VALUE = 100; // Initialized at the time of declaration

    final int MIN_VALUE;      // Must be initialized in the constructor

    public VariableFinal() {
        MIN_VALUE = 10;       // Initialized in the constructor
    }

    public static void main(String[] args) {
    	VariableFinal obj = new VariableFinal();
        System.out.println(obj.MAX_VALUE); // Prints: 100
        System.out.println(obj.MIN_VALUE); // Prints: 10
    }

}
