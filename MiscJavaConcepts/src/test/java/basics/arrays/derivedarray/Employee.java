package basics.arrays.derivedarray;
class Employee
{
	int empid;
	double salary;
	
	public Employee(int empid,double salary)
	{
		this.empid=empid;
		this.salary=salary;
	}
	
	public String toString() {
		return "EmpId:" + empid + " salary: " + salary;
	}
}