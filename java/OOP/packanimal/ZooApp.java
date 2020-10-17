public class ZooApp{
	public static void main(String[] args){
		Dog caramelo = new Dog("Caramelo", 6, 15);
		Horse jamesBaxter = new Horse("James Baxter", 12, 5);
		Sloth sid = new Sloth("Sid", 30);

		caramelo.MakeSound("Bark, bark!");
		caramelo.Run(15);
		caramelo.Run(15);

		System.out.println();

		jamesBaxter.MakeSound("Ja-a-a-a-a-mes-Ba-a-a-a-a-xter");
		jamesBaxter.Run(20);
		jamesBaxter.Run(20);

		System.out.println();

		sid.MakeSound("ICE AGE!");
		sid.Climb(40,11);
	}
}
