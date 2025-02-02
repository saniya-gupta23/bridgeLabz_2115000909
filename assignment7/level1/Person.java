import java.util.*;
public class Person{
	private String name;
	private int age;
	private String address;

	public Person(){
		this.name = "unknown";
		this.age= 0;
		this.address = "not provided";
	}

	public Person(String name, int age, String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}

	//copy constructor 
	public Person(Person otherPerson){
		this.name = otherPerson.name; 
		this.age = otherPerson.age;
		this.address = otherPerson.address;
	}

	public String getName(){
		return name;	
	}

	public int getAge(){
		return age;
	}

	public String getAdress(){
		return address;
	}


	@Override 
	public String toString(){
		return "Person{name='" + name + " ', age=" + age + ", address='" + address + " '}";
	}

	public static void main(String args[]){
		Person originalPerson = new Person("Saniya", 22 , "kanpur");
		Person copiedPerson = new Person(originalPerson);


		System.out.println(originalPerson);
		System.out.println(copiedPerson);
	}
}
		
