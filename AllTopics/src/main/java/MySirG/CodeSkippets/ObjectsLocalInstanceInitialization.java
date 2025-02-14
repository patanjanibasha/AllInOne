package MySirG.CodeSkippets;

public class ObjectsLocalInstanceInitialization 
{
		String str; 		// Instance variable, default value is null
	    Object obj; 		// Instance variable, default value is null
	    
	    

	    public static void main(String[] args) 
	    {
	    	ObjectsLocalInstanceInitialization e = new ObjectsLocalInstanceInitialization();
	        System.out.println(e.str); // Prints: null
	        System.out.println(e.obj); // Prints: null 
	        
	     //   Object objNotCreated; // Local variable, not initialized
	     //    System.out.println(objNotCreated); // Compilation error: variable obj might not have been initialized
	    }

}
