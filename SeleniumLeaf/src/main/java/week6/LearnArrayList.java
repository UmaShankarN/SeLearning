package week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class LearnArrayList {

	public static void main(String[] args) 
	{
		 List<String> trainNameBeforeSort = new ArrayList<>();
		 trainNameBeforeSort.add("c");
		 trainNameBeforeSort.add("C");
		 trainNameBeforeSort.add("B");
		 System.out.println(trainNameBeforeSort);
		 Collections.sort(trainNameBeforeSort);
		 for(String train:trainNameBeforeSort)
		 {
			 System.out.println(train);
		 }
		 
		
	}

}
