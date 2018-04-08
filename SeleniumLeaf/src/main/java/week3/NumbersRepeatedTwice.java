package week3;

public class NumbersRepeatedTwice {

	public static void main(String[] args) 
	{
		
		int[] numbers={13,15,67,88,65,99,67,65,87,13};
		
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=i+1;j<numbers.length;j++)
			{
				if(numbers[i] == numbers[j])
				{
					System.out.println(numbers[i]);
				}
			}
		}
		
		
		
	}

}
