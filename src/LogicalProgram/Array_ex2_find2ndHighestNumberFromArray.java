package LogicalProgram;

import java.util.ArrayList;
import java.util.TreeSet;

public class Array_ex2_find2ndHighestNumberFromArray 
{
	public static void main(String[] args) 
	{
		int ar []= {10,30,40,50,50,60,60};
		TreeSet<Integer> ts=new TreeSet<>(); //{10, 30, 40, 50, 60}
		for(int num:ar)
		{
			ts.add(num);
		}
		
		ArrayList<Integer> al=new ArrayList<>(ts);   //{10, 30, 40, 50, 60}
		System.out.println(al.get(al.size()-2));	
	}
}