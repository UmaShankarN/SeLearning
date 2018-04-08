package week7;

public class ReverseString {

	public static void main(String[] args) 
	{
		// Write a program to string reverse
		//Try 1
		String input = "Am a Hero".replaceAll("\\s", "");
		//System.out.println(input);
		String temp ="";
		int length = input.length();
		for(int i = length-1; i>=0;i--)
		{
			temp+= input.charAt(i);
		}
		System.out.println(temp);
		
		//Try 2
		StringBuilder sb = new StringBuilder(input);
		System.out.println(sb.reverse());
		//sb.append(input);
		System.out.println(sb);
	}

}
