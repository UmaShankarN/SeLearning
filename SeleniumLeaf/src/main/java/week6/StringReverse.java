package week6;

public class StringReverse {

	public static void main(String[] args) 
	{
		String cName ="Cognizant India";
		String rev="";
		int length  = cName.length()-1;
		for(int i =length; i>=0;i--)
		{
			rev=rev+cName.charAt(i);
		}
		System.out.println("String after reverse: " +rev);	
		
//		
//		char[] ch = cName.toCharArray();
//		int length  = ch.length;
//		String[] rev = new String[length];
//		int j=0; 
//		for(int i = length-1; i>=0; i--)
//		{
//			rev[j]= rev[j]+ch[i];
//			j++;
//			//System.out.println(rev);
//		}
//System.out.println(rev[length-1]);
}

}
