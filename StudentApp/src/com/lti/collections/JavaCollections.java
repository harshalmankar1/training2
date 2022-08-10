package com.lti.collections;
import java.util.*;

public class JavaCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList <String> lists=new ArrayList<String>();
		lists.add("harshal");
		lists.add("MAnkar");
		lists.add("ram");
		
		Collections.sort(lists);
		
		Iterator itr=lists.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}
	

}
