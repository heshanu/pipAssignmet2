package pipAssingment;

public abstract class AbstractEmployee implements Employee {
	private String name;
	private String id;
	
	//set values using contructor
	public AbstractEmployee(String name, String id, String department) {
		this.name = name;
		this.id = id;
		this.department = department;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	private String department;
	
	public String getDetails() {
		return "name : "+name+", id : "+id+", department :"+department+", Salary : "+calculateSalary();
	}
	
	public double calculateSalary() {
		return 0;
	}
	


	

	
	
	

}
