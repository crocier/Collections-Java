package com.pratian.treeset;

import java.util.Comparator;

public class SortBalance implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		double d1 = (double)o1;
		double d2 = (double)o2;
		if(d1>d2)
			return 1;
		else if(d1<d2)
			return -1;
		else 
		    return 0;
	}



}
