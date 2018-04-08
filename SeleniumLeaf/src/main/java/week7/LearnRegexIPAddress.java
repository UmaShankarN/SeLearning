package week7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegexIPAddress {

	public static void main(String[] args) 
	{
		//verify the given IP address is in valid format "192.168.1.2" using regex
		//String ipAddress = "(\\d|[1-9]\\d|1\\d\\d|2([0-4]\\d|5[0-5]))\\.(\\d|[1-9]\\d|1\\d\\d|2([0-4]\\d|5[0-5]))\\.(\\d|[1-9]\\d|1\\d\\d|2([0-4]\\d|5[0-5]))\\.(\\d|[1-9]\\d|1\\d\\d|2([0-4]\\d|5[0-5]))$";
		String ipAddress = "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
		//String ipAddress = "[0-9]|[0-9][0-9]";
		Pattern p = Pattern.compile(ipAddress);
		Matcher match = p.matcher("255.255.255.255");
		System.out.println(match.matches());
		
	}

}
