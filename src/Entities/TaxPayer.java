package Entities;

public class TaxPayer {

	private double salaryIncome;
	private double servicesIncome;
	private double capitalIncome;
	private double healthSpending;
	private double educationSpending;
	
	public TaxPayer() {
		
	}

	public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending,
			double educationSpending) {

		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(double educationSpending) {
		this.educationSpending = educationSpending;
	}

	public double salaryTax() {
		double salaryTax = 0;
		double salary = salaryIncome / 12;

		if (salary < 3000.00) {
			salaryTax = 0;
		} else {
			if (salary > 3000 && salary < 5000) {
				salaryTax = salaryIncome * 0.1;
			} else {
				if (salary > 5000.00) {
					salaryTax = salaryIncome * 0.2;
				}
			}

		}
		return salaryTax;
	}

	public double servicesTax() {
		
		return servicesIncome*0.15;

	}

	public double capitalTax() {
		return capitalIncome*0.2;

	}

	public double grossTax() {
	return salaryTax() + servicesTax() + capitalTax();
	}

	public double taxRebate() {
		double taxRebate = 0;
		if (healthSpending + educationSpending < grossTax()*0.3) {
			taxRebate = healthSpending + educationSpending;
		}
		else {
			taxRebate = grossTax()*0.3;
		}
		return taxRebate;
	}

	public double netTax() {
		return grossTax() - taxRebate();
	}

}

