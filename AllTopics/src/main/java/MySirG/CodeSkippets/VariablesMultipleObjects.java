package MySirG.CodeSkippets;

public class VariablesMultipleObjects {

	int age;         // Instance variable
    String name;     // Instance variable

    public static void main(String[] args) {
    	VariablesMultipleObjects obj1 = new VariablesMultipleObjects(); // First object
        obj1.age = 25;
        obj1.name = "Alice";

        VariablesMultipleObjects obj2 = new VariablesMultipleObjects(); // Second object
        obj2.age = 30;
        obj2.name = "Bob";

        System.out.println(obj1.name + " is " + obj1.age + " years old.");
        System.out.println(obj2.name + " is " + obj2.age + " years old.");
    }
}
