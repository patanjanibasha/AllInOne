package MySirG.CodeSkippets;

public class VariablestaticInInstancemethod {

	public void m1()
	{
		int x=10;
		System.out.println(x);
		
	//	static int y =100;
	//	System.out.println(y);
		
		final int z=10;
	//	z=100;
		System.out.println(z);
	}
	public static void main(String[] args) {
		
		VariablestaticInInstancemethod o = new VariablestaticInInstancemethod();
		o.m1();
	}

}


// instace methods cannot have static variables