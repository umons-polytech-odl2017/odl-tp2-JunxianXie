package exercise1;

public class BaseSalaryPLusComissionEmployee extends Employee{
	private int basesalary;
	private int comission;
	private int sales=0;


	public BaseSalaryPLusComissionEmployee(String name,int basesalary,int comission)
	{
		super(name);
		this.basesalary=basesalary;
		this.comission=comission;

	}

	public int computeSalary() {
		return basesalary+comission*sales;
	}

	@Override
	public void workOneHour() {
	}

	@Override
	public void sell() {
		sales++;
	}

}
