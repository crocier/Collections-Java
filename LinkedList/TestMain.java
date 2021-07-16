package com.pratian.LinkedList;

public class TestMain {

	public static void main(String[] args) {
		
		LinkedListDemo demo = new LinkedListDemo();
		
		demo.createList1();
		System.out.println(demo.getList1());
		demo.createList2();
		System.out.println(demo.getList2());
		
		boolean flag = demo.checkEquality();
		System.out.println(flag);
		if(flag)
		{
			System.out.println("List1.....");
			demo.displayList(flag);
		}
		else {
			demo.mergeList();
			System.out.println("ResultList....");
			demo.displayList(flag);
		}

	}

}
