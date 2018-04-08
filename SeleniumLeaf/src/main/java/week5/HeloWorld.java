package week5;
public class HeloWorld {
	
	String world = "World";
	static String helo = "Hello";
	
    public void printMessageFromNonStaticMethod(){
    	System.out.println(helo + world);
    }
    
    public static void printMessageFromStaticMethod(){
    	HeloWorld h = new HeloWorld();
    	System.out.println(helo + h.world);
    }
	public static void main(String[] args) 
	{
		
		/*1. Create a Java file and initialize 2 string variables(1 static- "Hello" and 1 non static="World"). 
		 Create two methods(1 static and 1 non static) to print both the variables. Create a main method to call both methods

		Expected O/P: Hello World should be printed twice.*/
		printMessageFromStaticMethod();
		new HeloWorld()
		.printMessageFromNonStaticMethod();
	}

}