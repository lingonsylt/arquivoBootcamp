public class EmployeeApp{
	public static void main (String[] args){
		Employee rafael = new Employee(
			1,33225566, 15, "Rafael", "Java dev", "Rua da Marola, 420", 2500, 10.50
		);

		rafael.EmployeeStatus();
		
		rafael.FinalWage();
	}
}
