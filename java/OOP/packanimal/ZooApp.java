public class ZooApp{
	public static void main(String[] args){
		Dog caramelo = new Dog("Caramelo", 6, 15);
		Horse jamesBaxter = new Horse("James Baxter", 12, 5);
		Sloth sid = new Sloth("Sid", 30);

		caramelo.MakeSound("Bark, bark!");
		caramelo.Run(15);
		System.out.println();
		caramelo.Run(15);

		System.out.println();

		jamesBaxter.MakeSound("Ja-a-a-a-a-mes-Ba-a-a-a-a-xter");
		jamesBaxter.Run(20);
		System.out.println();
		jamesBaxter.Run(20);

		System.out.println();

		sid.MakeSound("ICE AGE!");
		sid.Climb(10,5);
		
		System.out.println();

		System.out.printf("Nome: %s\nIdade: %d", caramelo.getName(), caramelo.getAge());
		
		System.out.println();

		caramelo.setName("Teste");
		caramelo.setAge(14);
		
		System.out.printf("Nome: %s\nIdade: %d", caramelo.getName(), caramelo.getAge());
	}
	
}
