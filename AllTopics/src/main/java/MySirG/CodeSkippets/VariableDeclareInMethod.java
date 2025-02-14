package MySirG.CodeSkippets;

public class VariableDeclareInMethod {
	
	int c ;
	public void m1()
	{
	//	int s;
		int s=10;
		System.out.println(s);
	}

	public static void main(String[] args) {
        int x=7;
        VariableDeclareInMethod o= new VariableDeclareInMethod();
        System.err.println(o.c); 
	}
}
