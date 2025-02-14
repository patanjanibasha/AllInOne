package MySirG.CodeSkippets;

class Parent
{
	void p()
	{
		System.out.println("parent member P called");
	}
}

class Child  extends Parent
{
	//  overring 
	void p()
	{
		System.out.println("child member P called");
	}
}

public class InheritenceChildRefference{
	
	public static void main(String[] args) {
		
     Parent op= new Child();
     op.p();  // can call child  member bcz we are using reff of parent but object is child...
     // concept of binding, if iny method ovverrid it will be a late binding.
     // the refference pointing which object in that class object method will call
     
     // if u want skip oerrided method
   //  Parent op2 = null ;//= new Parent();
     Parent op2 = new Parent();
     op2.p();
     
	}

}
