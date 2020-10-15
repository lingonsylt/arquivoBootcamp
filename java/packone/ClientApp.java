public class ClientApp {
    public static void main(String[] args) {
        Client client = new Client(1, "Schuman", "Rue de Paris", "engineer");
  
        client.clientStatus();
        
        System.out.printf("Nome do cliente: %s\n", client.getName());

        client.setName("Schumann");

        System.out.printf("Nome do cliente: %s\n", client.getName());
        
        client.clientStatus();

    }

}
