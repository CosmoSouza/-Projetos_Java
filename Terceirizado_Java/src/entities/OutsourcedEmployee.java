package entities;

public class OutsourcedEmployee extends Employee {
	
	private Double additionalCharge;
	
	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionCharge;
	}

	public Double getAdditionCharge() {
		return additionalCharge;
	}

	public void setAdditionCharge(Double additionCharge) {
		this.additionalCharge = additionCharge;
	}
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}

}
