package week6;

public class PrintingNextCharacter {

	public static void main(String[] args) 
	{
		String given = "A1B2C3";
		
		for (int i =0; i<=given.length()-1;i++)
		{
			 int a = given.charAt(i);
			 a++;
			 System.out.print((char)a);
			
		}
		
	}

}
