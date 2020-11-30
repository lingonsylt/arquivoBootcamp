public class ZooApp{
	public static void main(String[] args){
		Dog caramelo = new Dog("Caramelo", 6, 15);
		Horse jamesBaxter = new Horse("James Baxter", 12, 5);
		Sloth sid = new Sloth("Sid", 30);

		caramelo.Run(15);
		System.out.println();
		caramelo.Run(76);

	}
	
}
