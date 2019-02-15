package Day3;

public class Employee {
	int Salary;
	int Bonus;
		
	int calculateSalary() {
		int totalSalary = Salary + Bonus;
		return totalSalary;
	}

}
