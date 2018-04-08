package week7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegEx {

	public static void main(String[] args) 
	{
	Pattern p = Pattern.compile("[0-9]+");
	Matcher match = p.matcher("Amazon has 12014 and 24500");
	int temp = 0;
	while(match.find())
	{
//		String a = match.group();
//		System.out.println(a);
		temp = temp+ Integer.parseInt(match.group());
	}
System.out.println(temp);
	}

}
