package collections;

import java.util.Objects;

public class Student implements Comparable<Student> {
	String name;
	int rollNo;
	public Student(String name,int r) {
		this.name=name;
		rollNo=r;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(rollNo);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return rollNo == other.rollNo;
	}

	@Override
	public int compareTo(Student that) {
		//if this.roll is bigger then it return a positive value 
		//and current will be considered bigger else that will be bigger
		return this.rollNo-that.rollNo;
	}
	
	 

}
