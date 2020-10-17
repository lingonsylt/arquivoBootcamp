public class Horse extends Animal{
	private float
	position;

	public Horse(String name, int age, float position){
		super(name, age);
		this.position = position;
	}

	@Override
	public void MakeSound(String animalSound){
		System.out.printf("Hello, I'm a horse and this is my sound:\n%s\nSound good?\n", animalSound);
	}
	
	public void Run(float meters){
		float finalPosition = position + meters;

		System.out.printf("So, I'm %.2f meters from you.\nNeigh, neigh! I'm running fast! Neigh!\nNow i'm %.2f meters away from you! I've just ran %.2f meters\n", position, finalPosition, meters);

		position = finalPosition;
	}

	public String getPosition(){
		return position;
	}

	public void setPosition(String position){
		this.position = position;
	}
}
