package com.sivasoft;

import java.util.Comparator;

public class IdComparator implements Comparator<Employeee>{

	@Override
	public int compare(Employeee o1, Employeee o2) {
		if(o1.getId()==o2.getId()) {
		    return o1.getName().compareTo(o2.getName());	
		    }else if(o1.getId()>o2.getId()) {
		    	return 1;
		    }else
				return -1;
			}
	}


