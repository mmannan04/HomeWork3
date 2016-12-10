package encapsulation;

public class Employee{
	private int employeeID;
	private String employeeName;
	private String employeeSSN;
	private String employeeDOB;
	
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeSSN() {
		return employeeSSN;
	}
	public void setEmployeeSSN(String employeeSSN) {
		this.employeeSSN = employeeSSN;
	}
	public String getEmployeeDOB() {
		return employeeDOB;
	}
	public void setEmployeeDOB(String employeeDOB) {
		this.employeeDOB = employeeDOB;
	}

}
