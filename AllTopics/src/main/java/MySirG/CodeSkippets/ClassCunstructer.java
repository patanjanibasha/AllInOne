package MySirG.CodeSkippets;

public class ClassCunstructer {
	
	private int x;
	
	public void ClassCunstructer(int a)
	{
	System.out.println(a);
	}

	public static void main(String[] args) {
		ClassCunstructer o = new ClassCunstructer();
		System.out.println("class name same as method name but should not hav return type then only its called constructre");
	}

}
