package day3;

public class demoEmployee {

	public static void main(String[] args) {
		Employee John;
		John= new Employee();
		John.Salary = 500000;
		John.Bonus = 5000;
		int totSal = John.calculateSalary();
		System.out.println("John's totls salary is "+totSal);
		

	}

}
