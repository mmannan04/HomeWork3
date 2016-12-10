package encapsulation;

public class EmployeeInfo {

	public static void main(String[] args) {
			Employee em1 = new Employee();
			em1.setEmployeeID(342);
			em1.setEmployeeName("Mai");
			em1.setEmployeeDOB("11-01-1992");
			em1.setEmployeeSSN("292-28-9872");
			
			System.out.println(em1.getEmployeeID()+ " " + em1.getEmployeeName()+ " " + em1.getEmployeeDOB()+ " " + em1.getEmployeeSSN ());
			
			Employee em2 = new Employee();
			em2.setEmployeeID(342);
			em2.setEmployeeName("May");
			em2.setEmployeeDOB("11-01-1993");
			em2.setEmployeeSSN("098-96-4094");
			
			System.out.println(em2.getEmployeeID()+ " " + em2.getEmployeeName()+ " " + em2.getEmployeeDOB()+ " " + em2.getEmployeeSSN ());
		
	}

	}

