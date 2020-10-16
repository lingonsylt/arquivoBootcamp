public class Person{
	private String
	name,
	adress,
	phoneNumber;

	public Person(String name, String adress, String phoneNumber){
		this.name = name;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
	}
	
	public void PersonStatus(){
		System.out.printf("Person status:\nName: %s.\nAdress: %s.\nPhone Number: %s.\n", name, adress, phoneNumber);
	}

	public String getName(){
		return name;
	}

	public String getAdress(){
		return adress;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setAdress(String adress){
		this.adress = adress;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
}
