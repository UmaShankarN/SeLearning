package week5;

public class LongestSequence2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int[] input={-1,2,-3,-4,5,6,7,-8,9,10};
		
		
		int count =0;	
		int positiveCount =0;
		int endposition=0;
		int startPosition = 0;
		String output="";
		for(int i=0;i<input.length;i++)
		{
			if(input[i]>0)
			{
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
		System.out.println(endposition);
		System.out.println(startPosition);
		for(int i=startPosition; i<=endposition;i++)
		{
			//System.out.println(input[i]);
			output=output+input[i];
		}
			System.out.println("The Longest positive sequence is: " +output);
			System.out.println("The length of longest positive sequence is: " +output.length());
	}

}
