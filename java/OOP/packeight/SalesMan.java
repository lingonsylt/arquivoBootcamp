public class SalesMan extends Person{
	private String
	team,
	shift;
	
	double
	salesAmount,
	commission;

	public SalesMan(String name, String adress, String phoneNumber, String team,
				  String shift, double salesAmount, double commission){
		super(name, adress, phoneNumber);
		this.team = team;
		this.shift = shift;
		this.salesAmount = salesAmount;
		this.commission = commission;
	}

	public void SalesManStatus(){
		System.out.printf(
			"Administrator status:\nName: %s.\nAdress: %s.\nPhone Number: %s.\nTeam: %s.\nShift: %s.\nSales amount: %.2f.\nCommission: %.2f", getName(), getAdress(), getPhoneNumber(), team, shift, salesAmount, commission
		);
	}

	public double SalesCommission(){
		double commissionPay = salesAmount * (commission/100);
		return commissionPay;
	}

	public String getTeam(){
		return team;
	}

	public String getShift(){
		return shift;
	}

	public double getSalesAmount(){
		return salesAmount;
	}

	public double getCommission(){
		return commission;
	}

	public void setTeam(String team){
		this.team = team;
	}

	public void setShift(String shift){
		this.shift = shift;
	}

	public void setSalesAmount(double salesAmount){
		this.salesAmount = salesAmount;
	}

	public void setCommission(double commission){
		this.commission = commission;
	}
}
