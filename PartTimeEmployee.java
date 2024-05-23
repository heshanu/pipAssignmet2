package pipAssingment;

public class PartTimeEmployee extends AbstractEmployee{

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	private double hourlyRate;
	private int hoursWorked;
	
	public PartTimeEmployee(String name, String id, String department,double hourlyRate,int hoursWorked) {
		super(name, id, department);
		// TODO Auto-generated constructor stub
		this.hourlyRate=hourlyRate;
		this.hoursWorked=hoursWorked;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return hourlyRate*hoursWorked;
	}
	

}
