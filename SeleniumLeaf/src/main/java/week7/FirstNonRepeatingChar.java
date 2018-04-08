package week7;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		// Write a Java program to print first non repeating character from String
		
		String input = "I will clear this interview".toLowerCase().replaceAll("[\\s+]", "");
		System.out.println(input);
		int count =0;
		//char[] inputArray = input.toCharArray();
		for(int i=0; i<input.length();i++)
		{
			for(int j=i+1; j<input.length();j++)
			{
				if(input.charAt(i) == input.charAt(j))
				{
					count++;
				}
			}
			if(count ==0)
			{
				System.out.println(input.charAt(i));
				break;
			}
			count=0;
		}
		
		//Try 2
//		char[] inputArray = input.toCharArray();
//		for(char c:inputArray)
//		{
//			int index = input.indexOf('c');
//			System.out.println(index);
//		
//		}
	}

}
