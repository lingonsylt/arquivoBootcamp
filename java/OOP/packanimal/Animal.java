public abstract class Animal{
	private String
	name;

	private int
	age;

	public Animal(String name, int age){
		this.name = name;
		this.age = age;
	}

	abstract public void MakeSound(String animalSound);

	// Getters
	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	// Setters
	public void setName(final String name){
		this.name = name;
	}

	public void setAge(final int age){
		this.age = age;
	}
}
