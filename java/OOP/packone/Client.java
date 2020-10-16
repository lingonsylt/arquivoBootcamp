public class Client {
     private int id;
     private String name;
     private String adress;
     private String job;

     public Client(int id, String name, String adress, String job){
             this.id = id;
             this.name = name;
             this.adress = adress;
             this.job = job;
     }

     public int getId(){
             return id;
     }

     public String getName(){
             return name;
     }

     public String getAdress(){
             return adress;
     }

     public String getJob(){
             return job;
     }

     public void setId(int id){
	     this.id = id;
     }

     public void setName(String name){
	     this.name = name;
     }

     public void setAdress(String adress){
	     this.adress = adress;
     }

     public void setJob(String job){
	     this.job = job;
     }

     public void clientStatus(){
	     System.out.printf("Id: %d. Nome: %s. Endereço: %s. Emprego: %s.\n", id, name, adress, job);
     }

}
