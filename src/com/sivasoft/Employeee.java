package com.sivasoft;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Employeee implements Comparable<Employeee>{

	private int id;
	private String name;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employeee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int compareTo(Employeee o) {
    if(id==o.id) {
    return 0;	
    }else if(id>o.id) {
    	return 1;
    }else
		return -1;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employeee other = (Employeee) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
		
	public static void main(String[] args) {
		List<Employeee> employees = new ArrayList<Employeee>();
		Employeee s1 = new Employeee(101,"Banu");
		Employeee s2 = new Employeee(109,"Siva");
		Employeee s3 = new Employeee(105,"Mani");
		Employeee s4 = new Employeee(98,"Sankar"); 
		Employeee s5 = new Employeee(105,"Ashok"); 
		employees.add(s1);
		employees.add(s2);
		employees.add(s3);
		employees.add(s4);
		employees.add(s5);
	//	Collections.sort(employees,new NameComparator());
		
		//bubbleSort
		for (int i = 0; i < employees.size() - 1; i++)
		  {
		     for (int j = 0; j < employees.size() - i -1; j++)
		     {
		        if (employees.get(j).compareTo(employees.get(j+1)) > 0)
		        {
		           Employeee temp = employees.get(j+1);
		           employees.set(j+1, employees.get(j));
		           employees.set(j, temp);
		        }
		     }
		  }
		System.out.println(employees);
		List<Employeee> sortList = employees.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    //    System.out.println(sortList);

		
		List<Employeee> sortedList = employees.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).collect(Collectors.toList());
     //   System.out.println(sortedList);
        
	//	System.out.println(employees);
		}
	
	
	
}
