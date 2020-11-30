public abstract class Animal{
	private String
	name;
	

	private int
	age;
	
	// TODO: pensar na versão do Rubens
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
	public void setName(String name){
		this.name = name;
	}

	public void setAge(int age){
		this.age = age;
	}
}
