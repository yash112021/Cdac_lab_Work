package demo.com.beans;
import java.time.LocalDate;
import java.util.Objects;

public class EmployeeSet implements Comparable<EmployeeSet>{


	private int id;
	private String name;
	private double Sal;
	private LocalDate dt;
	
	
public EmployeeSet(int id, String name, double sal, LocalDate dt) {
		super();
		this.id = id;
		this.name = name;
		Sal = sal;
		this.dt = dt;
	}


	@Override
public int hashCode() {
	return Objects.hash(name);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	EmployeeSet other = (EmployeeSet) obj;
	return Objects.equals(name, other.name);
}


	//getter setter 
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

	public double getSal() {
		return Sal;
	}

	public void setSal(double sal) {
		Sal = sal;
	}

	public LocalDate getDt() {
		return dt;
	}

	public void setDt(LocalDate dt) {
		this.dt = dt;
	}


	@Override
	public String toString() {
		return "TestEmployeeSet [id=" + id + ", name=" + name + ", Sal=" + Sal + ", dt=" + dt + "]";
	}


	@Override
	public int compareTo(EmployeeSet o) {
		
		return (int) (this.Sal - o.Sal);
	}
	
	
}






	

