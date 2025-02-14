package MySirG.CodeSkippets;


 class ItsPublic
{
	int x=100;
}
 public class ClassPublic {

	public static void main(String[] args) {

		ItsPublic o = new ItsPublic();
		System.out.println(o.x);

	}

}

 
 // only main method  class should be public 
 // file must be save with mainmethod class 
 // its ok, both calsses are not public , but both should not public
 // 