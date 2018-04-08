package week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LearnArrayListCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stack1 = new ArrayList();
		stack1.add("BAGMATI EXPRESS");
		stack1.add("BANGALORE EXP");
		stack1.add("BANGALORE MAI");
		stack1.add("BRINDAVAN EXP");
		stack1.add("GHY BNC EXPRESS");
		System.out.println(stack1);
		List<String> stack2 = new ArrayList();
		stack2.add("BAGMATI EXPRESS");
		stack2.add("BANGALORE EXP");
		stack2.add("BANGALORE MAI");
		stack2.add("BRINDAVAN EXP");
		stack2.add("GHY BNC EXPRESS");	
		//stack2.add("HWH BNC SF SPLOnly on 26-Sep");
		System.out.println(stack2);
		if(stack1.containsAll(stack2))
		
			System.out.println("Matches");
			else
			System.out.println("Not matches");
		
		if(Arrays.equals(stack1.toArray(), stack2.toArray()))
			System.out.println("Matches");
		else
		System.out.println("Not matches");
		
		if(stack1 == stack2)
			System.out.println("Matches");
		else
			System.out.println("Not matches");
	}

}
