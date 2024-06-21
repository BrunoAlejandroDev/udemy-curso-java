package entities;

public class OutsourcedEmployee extends Employee {

	// ATRIBUTOS
	private double additionalCharge;
	
	// CONSTRUTOR
	public OutsourcedEmployee() {
		
	}
	
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHours, double additionalCharge) {
		super(name, hours, valuePerHours); // atributos da superclasse
		this.additionalCharge = additionalCharge;
	}

	// GETTERS E SETTERS
	public double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + (additionalCharge * 1.1); // sobrescrita de um método da superclasse
	}
	
}
