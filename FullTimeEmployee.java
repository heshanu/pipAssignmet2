package pipAssingment;

public class FullTimeEmployee extends AbstractEmployee {

	public FullTimeEmployee(String name, String id, String department,double annulSalary) {
		super(name, id, department);
		this.annulSalary = annulSalary;
	}

	private double annulSalary=0;
	
	
	public double getAnnulSalary() {
		return annulSalary;
	}

	public void setAnnulSalary(double annulSalary) {
		this.annulSalary = annulSalary;
	}

	
	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return annulSalary;
	}
	


	


	
}
