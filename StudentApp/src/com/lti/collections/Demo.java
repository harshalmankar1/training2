package com.lti.collections;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		int nums[]= {22,5,12,5,4,3,6,7,2};
		
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(5);
		list.add(15);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(6);
		list.add(4);
		
		//before sort
		System.out.println(list);
		
		Collections.sort(list);
		//after sort
		System.out.println(list);
		
		List<Integer> li1=new ArrayList<Integer>();
		li1.add(12);
		li1.add(12);
		li1.add(12);
		
		li1.add(12);
		Iterator<Integer> itr=li1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		for(int i:li1)
		{
			System.out.println(i);
		}
		
		
		Set<Integer> s=new HashSet<Integer>();
		
		s.add(4);
		s.add(2);
		s.add(3);
		s.add(1);
		s.add(1);
		
		for(int i:s)
		{
			System.out.println(i);
		}
		
		Map<Integer,String> map1=new HashMap<Integer,String>();
		
		map1.put(1,"Harshal");
		map1.put(1,"Harshal");
		map1.put(2,"Harshal");
		
		System.out.println(map1.entrySet());
		
		Collections.sort(li1);
		System.out.println(list);
		
		
  		
		
		
		
	}

}
