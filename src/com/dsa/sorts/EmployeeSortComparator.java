package com.dsa.sorts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSortComparator {
	
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(31, "Ganesh", "US"));
        list.add(new Employee(30, "Swapnil", "Uk"));
        list.add(new Employee(12, "Ganesh", "India"));
        list.add(new Employee(56, "Nilesh", "Somerset"));
		Collections.sort(list,new EmpSort());
		
		for(Employee emp : list){
			System.out.println(emp);
		}
	}
}

class EmpSort implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.age < o2.age){
            return 1;
        } else if(o1.age > o2.age){
            return -1;
        }else{
        	return 0;
        }
	}
}


class Employee {
	int age;
	String name;
	String address;
	
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", address=" + address + "]";
	}

	Employee (int age, String name,String address){
		this.age = age;
		this.address = address;
		this.name = name;
	}
}