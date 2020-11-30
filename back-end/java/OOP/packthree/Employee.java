public class Employee{
	private int
	id,
	phoneNumber,
	age;

	private String
	name,
	job,
	adress;

	private float
	wage;
	
	private double
	payrollTax;

	public Employee(int id, int phoneNumber, int age, String name, String job,
					String adress, float wage, double payrollTax){
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.name = name;
		this.job = job;
		this.adress = adress;
		this.wage = wage;
		this.payrollTax = payrollTax;
	}
	
	public void EmployeeStatus(){
		System.out.printf(
			"Employee Status:\nId: %d.\nName: %s.\nAge: %d.\nJob: %s.\nWage: %.2f.\nPayroll tax: %.2f.\nPhone number: %d.\nAdress: %s.\n", id, name, age, job, wage, payrollTax, phoneNumber, adress
		);
	}

	public void FinalWage(){
		double takeHomePay = (double) wage - (wage * (payrollTax/100));

		System.out.printf("The pay received by the employee after the deduction of taxes: %.2f", takeHomePay);
	}
	
	// Getters
	public int getId(){
		return id;
	}

	public int getPhoneNumber(){
		return phoneNumber;
	}

	public int getAge(){
		return age;
	}

	public String getName(){
		return name;
	}

	public String getJob(){
		return job;
	}

	public String getAdress(){
		return adress;
	}

	public float getWage(){
		return wage;
	}

	public double getPayrollTax(){
		return payrollTax;
	}

	// Setters
	public void setId(){
		this.id = id;
	}

	public void setPhoneNumber(){
		this.phoneNumber = phoneNumber;
	}

	public void setAge(){
		this.age = age;
	}

	public void setName(){
		this.name = name;
	}

	public void setJob(){
		this.job = job;
	}

	public void setAdress(){
		this.adress = adress;
	}

	public void setWage(){
		this.wage = wage;
	}

	public void setPayrollTax(){
		this.payrollTax = payrollTax;
	}
}
