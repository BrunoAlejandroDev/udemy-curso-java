package exercicio2;

public class Employee {
	private String name;
	private double grossSalary;
	private double tax;
	
	// metodos publicos
	public String toString() {
		return "Employee: " + this.getName() +
				", $ " + String.format("%.2f", netSalary());
	}
	
	public double netSalary() {
		return this.getGrossSalary() - this.getTax();
	}
	
	public double increaseSalary(double percentage) {
		return this.grossSalary += this.grossSalary * percentage/100;
	}

	// getters e setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
}
