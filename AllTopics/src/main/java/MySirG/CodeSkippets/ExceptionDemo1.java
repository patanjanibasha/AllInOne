package MySirG.CodeSkippets;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		try
		{
			int i=5/0;
		}
		catch(Exception e)
		{
			System.out.println("exception ex");
		}
//		catch(ArithmeticException e)
//		{
//			System.out.println("arthemetic ex");
//		}

	}

}
