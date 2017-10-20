package exercise2;

public class ProductionWorker implements Payable {
	private int salaryperpiece;
	private int piece=0;
	public ProductionWorker (int salaryperpiece){

		this.salaryperpiece=salaryperpiece;

	}
	public void produceOnePiece() {
		piece++;
	}

	public int computeSalary() {
		return salaryperpiece*piece;
	}
}
