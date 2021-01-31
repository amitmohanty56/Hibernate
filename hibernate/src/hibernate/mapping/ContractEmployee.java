package hibernate.mapping;

import hinernate.query.Employee;

public class ContractEmployee extends Employee{
	
	private String contractPeriod;
	private int hourlyRate;
	
	public ContractEmployee() {
		System.out.println("Contract Employee default Constructor");
	}
	
	public String getContractPeriod() {
		return contractPeriod;
	}
	public void setContractPeriod(String contractPeriod) {
		this.contractPeriod = contractPeriod;
	}
	public int getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	

}
