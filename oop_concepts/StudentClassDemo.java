package oop_concepts;

public class StudentClassDemo {

	String name;
	int age;
	String address;

	public StudentClassDemo(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;

	}

	public void setName(int age) {
		this.age = age;

	}

	public void setAddress(String address) {
		this.address = address;

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;

	}

	public String getAddress() {
		return address;
	}
	
	public String PrintMethod()
	{
		return("Student name is: "+this.getName()+", Age is: "+this.getAge()+", Address is: "+this.getAddress());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentClassDemo Starlord = new StudentClassDemo ("Starlord",45,"Earth");
		
		System.out.println(Starlord.getName());
		System.out.println(Starlord.getAge());
		System.out.println(Starlord.getAddress());
		
		System.out.println(Starlord.PrintMethod());
		

	}

}
