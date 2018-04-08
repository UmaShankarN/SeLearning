package week5;

public class ToFindLongestPositiveSequence {

	public static void main(String[] args) 
	{
		//Integer Array
		int[] input1={-1,2,-3,-4,5,6,7,-8,9,10,11,13};
		int length =input1.length;
		//System.out.println(length);
		
		//Integer to String Array to add "-1" to end
		String[] array = new String[length+1];
		for(int i=0;i<input1.length;i++)
		{
			
			array[i]=String.valueOf(input1[i]);
		}
		
		array[length]="-1";
		//System.out.println(array.length);
		//System.out.println(array[10]);
		//Convert String array to integer array to perform validation
		Integer[] input=new Integer[array.length];
		//System.out.println(input.length);
		int k=0;
		for(String str: array)
		{
			input[k] =Integer.parseInt(str);
			k++;
		}
		
		
		//System.out.println(input[10]);
		//input.toString();
		int count =0;	
		int positiveCount =0;
		int endposition=0;
		int startPosition = 0;
		//String output="";
		for(int i=0;i<input.length;i++)
		{
			if(input[i]>0)
			{
				
				//System.out.println(array[i]);
				count++;
			}
			else if(input[i]<0 && count>positiveCount)
			{
				positiveCount = count;
				count=0;
				endposition= i-1;
				startPosition=endposition-positiveCount+1;
			}
		}
		//System.out.println(endposition);
		//System.out.println(startPosition);
		
		Integer[] output=new Integer[endposition-startPosition+1];
		int l=0;
		System.out.println("The Longest positive sequence is: ");
		for(int i=startPosition; i<=endposition;i++)
		{
			//System.out.println(input[i]);
			//output=output+input[i]
			output[l]=input[i];
			System.out.println(output[l]);
			l++;
		}
			//System.out.println("The Longest positive sequence is: " +output1);
			System.out.println("The length of longest positive sequence is: " +output.length);
	}

}
