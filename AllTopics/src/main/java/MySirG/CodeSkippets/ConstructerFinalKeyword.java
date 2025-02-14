package MySirG.CodeSkippets;

public class ConstructerFinalKeyword {
	
	private ConstructerFinalKeyword(int x)
	{
		System.out.println(x);
	}
	
	
//	private final ConstructerFinalKeyword()
//	{
//		
//	}

	public static void main(String[] args) {
		ConstructerFinalKeyword o = new ConstructerFinalKeyword(50);
	}

}

// constructer cannot be final
