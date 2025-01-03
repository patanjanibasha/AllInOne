package Logical;

public class stringTricky {

	public static void main(String[] args) {
		String s1="hellow";
		String s2="hellow";
		String s3 = new String("hellow");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		//------------------------------------------
		byte a1=2;
		byte a2=3;
		int a3 = (a1+a2) ; // or
		System.out.println(a3);
		byte a4 = (byte)(a1+a2); 
		
		Integer x=200;
		Integer y= 200;
		
		System.out.println(x==y);
		
		Integer a=100;
		Integer b= 100;
		
		System.out.println(a==b);
		
		char x1= 'B';
		char x2= 'A';
		
		char x3= 'K';
		
		int one =(int)x1- (int)x2;
		int ten =(int)x3- (int)x2;
		
		System.out.println(one);
		System.out.println(ten);
		
		for(int i=one;i<=ten; i++)
		{
			System.out.println("Janibasha");
		}
		
		//---------------------------------------------
		
		char x11= 'B';
		char x22= 'A';
		
		int onee =(int)x11- (int)x22;
		
		String[] namecountfive = {"one", "two", "three", "four", "five"};
		
        for (int i=onee;i<namecountfive.length;i++ ) {
            System.out.println("Janibasha");
        }
        
      
	}

}
