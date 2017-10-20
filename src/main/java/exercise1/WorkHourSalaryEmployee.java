package exercise1;

public class WorkHourSalaryEmployee extends Employee {
	private int hourlyRate;
	private int hours=0;
	public WorkHourSalaryEmployee(String name,int hourlyRate)
	{
		super(name);
		this.hourlyRate=hourlyRate;
	}

	@Override
	public void sell() {

	}

	@Override
	public void workOneHour() {
		hours++;
	}

	@Override
	public int computeSalary() {
		return hourlyRate*hours;
	}
}
