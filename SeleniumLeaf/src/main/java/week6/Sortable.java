package week6;

import java.util.ArrayList;
import java.util.List;

public class Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> learn = new ArrayList<>();
		
		//to print the list after adding item to learn list
		learn.add("1");
		learn.add("2");
		learn.add("3");
		learn.add("4");
		learn.add("5");
		System.out.println(learn);
		
		//to print the list after removing item at index 1
		learn.remove(1);
		System.out.println(learn);
		
		//to print the size of list
		System.out.println(learn.size());
		
		//to print the list after removing all item from list
//		learn.clear();
//		System.out.println(learn);
		
		if(learn.contains("1"))
		{
			System.out.println("list contains");
		}

	}

}
