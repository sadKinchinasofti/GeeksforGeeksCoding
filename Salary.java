import java.util.Scanner;

public class Salary extends Employee{

	private double salary;
	public Salary(String name,String address,double salary) {
		// TODO Auto-generated constructor stub
		super(name, address);
		setSalary(salary);
	}
	public double setSalary(double newSalary) {
		if(newSalary > 0.0)
			salary=newSalary;
		return salary;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the employee name:");
		
		String name = sc.nextLine();
		System.out.println("Give the address of "+name);
		String address = sc.nextLine();
		System.out.println("Give the salary of "+name);
		double newSalary=sc.nextDouble();
		Salary s = new Salary(name, address, newSalary);
	}
}
