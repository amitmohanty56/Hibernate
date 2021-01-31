package hibernate.mapping;

import hinernate.query.Employee;

public class RegularEmployee extends Employee{
	
	private int salary;
	private int bonus;
	
	public RegularEmployee() {
		System.out.println("Regular Employee Default Constructor");
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	

}
