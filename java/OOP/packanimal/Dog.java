public class Dog extends Animal{
	private float
	position;

	public Dog(String name, int age, float position){
		super(name, age);
		this.position = position;
	}

	@Override
	public void MakeSound(String animalSound){
		System.out.printf("Hello, I'm a dog and this is my sound:\n%s\nSound good?\n", animalSound);
	}
	
	public void Run(float meters){
		float finalPosition = position + meters;

		System.out.printf("So, I'm %.2f meters from you.\nBark, bark! I'm running fast! Bark!\nNow i'm %.2f meters away from you! I've just ran %.2f meters\n", position, finalPosition, meters);

		position = finalPosition;
	}

	public float getPosition(){
		return position;
	}

	public void setPosition(float position){
		this.position = position;
	}
}
