package pipAssingment;

public class ContractEmployee extends AbstractEmployee{

	public ContractEmployee(String name, String id, String department, double contractAmount, int contractDuration) {
		super(name, id, department);
		this.contractAmount = contractAmount;
		this.contractDuration = contractDuration;
	}

	private double contractAmount;
	private int contractDuration;
	
	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return contractAmount*contractDuration;
	}

}
