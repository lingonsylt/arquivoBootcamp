public class Adm extends Person{
	private String
	team,
	shift;
	
	double
	allowance;

	public Adm(String name, String adress, String phoneNumber, String team,
				  String shift, double allowance){
		super(name, adress, phoneNumber);
		this.team = team;
		this.shift = shift;
		this.allowance = allowance;
	}

	public void AdmStatus(){
		System.out.printf(
			"Administrator status:\nName: %s.\nAdress: %s.\nPhone Number: %s.\nTeam: %s.\nShift: %s.\nAllownce: %.2f.\n", getName(), getAdress(), getPhoneNumber(), team, shift, allowance
		);
	}

	public double AllowancePerPerson(int personNumber){
		double totalAllowance = allowance * personNumber;
		return totalAllowance;
	}

	public String getTeam(){
		return team;
	}

	public String getShift(){
		return shift;
	}

	public double getAllowance(){
		return allowance;
	}

	public void setTeam(String team){
		this.team = team;
	}

	public void setShift(String shift){
		this.shift = shift;
	}

	public void setAllowance(double allowance){
		this.allowance = allowance;
	}
}
