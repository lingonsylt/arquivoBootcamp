import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class StorageApp{
    public static void main(String[] args){
        ArrayList<Storage> items = new ArrayList();
        ArrayList<Storage> update = new ArrayList();
        Scanner s = new Scanner(System.in);

        int
        option = 0,
        itemToRemove;

        items.add(new Storage(1, 30f, "raquete"));
        items.add(new Storage(2, 86f, "bola"));
        items.add(new Storage(3, 46f, "overgrip"));
        items.add(new Storage(4, 38f, "boné"));
        items.add(new Storage(5, 41f, "gatorade"));
        items.add(new Storage(6, 64f, "toalha"));
        items.add(new Storage(7, 12f, "camiseta"));
        items.add(new Storage(8, 109f, "corda"));

        do{
            System.out.println("Digite 1 para adicionar dados à lista.\nDigit"+
                               "e 2 para remover dados da lista.\nDigite 3 pa"+
                               "ra atualizar dadoss dados da lista.\nDigite 4"+
                               "4 para apresentar dados da lista\nDigite 0 pa"+
                               "ra finalizar.");
            option = s.nextInt();
        
            switch(option){
                case 1:
                    System.out.println("Digite produto: ");
                    String updateItem = s.next();
                    update.add(new Storage(updateItem));
                    items.addAll(update);
                    break;

                case 2:
                    System.out.print("Digite id  do item à se remover: ");
                    String toRemove = s.nextInt();
                    items.remove(toRemove - 1);
                    break;

                case 3:
                    System.out.println("Digite o nome do item à se substituir");
                    String toReplace = s.next();
                    System.out.println("Digite o nome do item substituto");
                    String replacer = s.next();
                    if(items.contains(toReplace)){
                        items.remove(toReplace);
                        items.add(replacer);
                    }
                    break;

                case 4:
                    for(String item : items){
                        System.out.println(item);
                    }
                    break;

                case 0:
                    System.out.println("Programa finalizado");
                    break;

                default:
                    System.out.println("Opção inválida. Insira 1, 2, 3 ou 4.");
            }
        }while(option != 0);
    }
}
