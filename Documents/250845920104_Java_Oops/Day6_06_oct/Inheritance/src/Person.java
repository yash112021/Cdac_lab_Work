import java.util.*;
public class Person {
	private static int id;
	private String name;
	private Date bdt;
	
	int cnt=1;
	
	//defauult constructor 
	public Person() {
		super();
	}


	//parametrized contructor
	public Person(String name, Date bdt) {
		super();
		this.id = cnt;
		cnt++;
		this.name = name;
		this.bdt = bdt;
	}

	//getter and setter method
	public static int getId() {
		return id;
	}

//
//	public static void setId(int id) {
//		Employee.id = id;
//	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getBdt() {
		return bdt;
	}


	public void setBdt(Date bdt) {
		this.bdt = bdt;
	}


	//tostring method
	@Override
	public String toString() {
		return "Employee [name=" + name + ", bdt=" + bdt + "]";
	}
	

}
