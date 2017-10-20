package exercise1;

public abstract class Employee {
	private String name;
	public abstract int computeSalary();

	public abstract void sell();


	public abstract void workOneHour();

	public Employee(String name)
	{
		this.name=name;
	}

	public String getName() {
		return name;
	}

}
