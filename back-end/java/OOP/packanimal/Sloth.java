public class Sloth extends Animal{ // 130 * 10 ^-3 0,130:b
	
	public Sloth(String name, int age){
		super(name, age);
	}

	// 15, 0,015
	
	@Override
	public void MakeSound(String animalSound){
		System.out.printf("Hello, I'm a sloth and this is my sound:\n%s\nSound good?\n", animalSound);
	}

	public void Climb(double meters, double climbingEffort){
		double climbingSpeed = meters * (climbingEffort * Math.pow(10,-3));
		double climbingTime = meters / climbingSpeed;

		System.out.printf("Man, I'm kinda lazy these days, I'll take %.2f minutes to climb this high, fine?", climbingTime);

	}
}
