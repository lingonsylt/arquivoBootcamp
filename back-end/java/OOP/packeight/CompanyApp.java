public class CompanyApp{
	public static void main(String[] args){
		Adm rafaelAdm = new Adm("Rafael", "Rua da Marola, 420", "95252-4545", "Turma do Beck End", "Turno da tarde", 3000);
		SalesMan barbaraVendedora = new SalesMan("Bárbara", "Rua da Marola, 420", "96767-2424", "Turma do Beck End", "Turno da tarde", 420000, 15);

		rafaelAdm.AdmStatus();
		System.out.println();

		barbaraVendedora.SalesManStatus();
		System.out.println();
	}
}
