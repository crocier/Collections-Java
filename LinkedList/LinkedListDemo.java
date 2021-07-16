package com.pratian.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {
	
	private LinkedList<Integer> list1 = new LinkedList<Integer>();
	private LinkedList<Integer> list2 = new LinkedList<Integer>();
	private LinkedList<Integer> resultList = new LinkedList<Integer>();
	
	
	public LinkedListDemo() {
		super();
	}

	public void createList1() {
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		
	}
	public void createList2()
	{
		list2.add(10);
		list2.add(12);
		list2.add(40);
		list2.add(50);
		list2.add(60);
	}
	public boolean checkEquality() {
		if(list1.size() == list2.size())
		{
			for(int i=0;i<list1.size();i++) {
				if(list1.get(i)!=list2.get(i)) {
					return false;
				}
			}
			return true;
		}
		else
			return false;
		
	}
	public void mergeList() {
		for(int i=0;i<list1.size();i++) {
			resultList.add(list1.get(i));
		}
		for(int j=0;j<list2.size();j++) {
		     if(resultList.contains(list2.get(j)))
		    	 continue;
		     else
		    	 resultList.add(list2.get(j));
		}
	}
	public void displayList(boolean flag) {
		if(flag)
		{
			System.out.println(list1);
		}
		else
			System.out.println(resultList);
	}
	
	//getters and setters
	public LinkedList<Integer> getList1() {
		return list1;
	}
	public void setList1(LinkedList<Integer> list1) {
		this.list1 = list1;
	}
	public LinkedList<Integer> getList2() {
		return list2;
	}
	public void setList2(LinkedList<Integer> list2) {
		this.list2 = list2;
	}
	public LinkedList<Integer> getResultList() {
		return resultList;
	}
	public void setResultList(LinkedList<Integer> resultList) {
		this.resultList = resultList;
	}


	

}
