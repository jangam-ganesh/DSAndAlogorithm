package com.dsa.sorts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonSortComparable {

	public static void main(String[] args) {
		
		List<Person> empList = new ArrayList<Person>();
		empList.add(new Person(12, "Ganesh", 79, "Yeola"));
		empList.add(new Person(1, "Reva", 0, "Pune"));
		empList.add(new Person(12, "Chadrakant", 40, "Aurangabbad"));
		empList.add(new Person(23, "Mai", 5, "Pune"));
		empList.add(new Person(3, "Rucha", 0, "A. Baad"));

		//By Comparator : compare method call
		Collections.sort(empList, new Person());
		
		//By Comparable : compareTo Method call
		//Collections.sort(empList);
		for (Person emp : empList) {
			System.out.println(emp);
		}
	}
}

class Person implements Comparable<Person>, Comparator<Person> {

	Integer age;
	String name;
	int salary;
	String address;

	Person(int age, String name, int salary, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.salary = salary;
	}

	Person() {
	}

	public int compareTo(Person e1) {
		//System.out.println("In CampareTo...");
		if(sortByAge(e1)==0){
			return  this.name.compareTo(e1.name);
		}else{
			return sortByAge(e1);
		}
	}

	private int sortByAge(Person e1) {
		if (this.age > e1.age) {
			return 1;
		} else if (this.age < e1.age) {
			return -1;
		}else{
			return 0;
		}
	}

	public int compare(Person e1, Person e2) {
		//System.out.println("In compare...");
		if (e1.age.compareTo(e2.age) == 0) {
			return e1.name.compareTo(e2.name);
		} else {
			return e1.age.compareTo(e2.age);
		}
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
}
