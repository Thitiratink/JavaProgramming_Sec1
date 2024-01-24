
public class Employee {
	private String id;
	private String name;
	private double saraly;
	
	public Employee(String id,String name,double salary){
		this.id = id;
		this.name = name;
		this.saraly = salary;
	}
	public Employee(String id , String name) {
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public double getSalary() {
		return this.saraly;
	}
		
	
}
