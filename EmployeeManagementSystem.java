package pipAssingment;

public class EmployeeManagementSystem {

	public static void main(String[] args) {
		
		//create fulltime employee
		FullTimeEmployee fullEmp=new FullTimeEmployee("Heshan", "1", "IT",500);
		System.out.println(fullEmp.getDetails());
		
		//create partime employee
		PartTimeEmployee partEmp=new PartTimeEmployee("Umayanga","2","HR",101.5,5);
		System.out.println(partEmp.getDetails());
		
		ContractEmployee conEmp=new ContractEmployee ("Chethiya","3","AUDIT",107.5,10);
		System.out.println(conEmp.getDetails());
	}

}
