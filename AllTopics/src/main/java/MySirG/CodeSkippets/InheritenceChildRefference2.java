package MySirG.CodeSkippets;

class Parent1
{
	void A()
	{
		System.out.println("parent member P called");
	}
}

class Child1  extends Parent1
{
	// no overring - early binding
	void B()
	{
		System.out.println("child member P called");
	}
}

public class InheritenceChildRefference2 {

	public static void main(String[] args) {
		 Parent1 op= new Child1();
		 op.A();
		// op.B();
	}
}
