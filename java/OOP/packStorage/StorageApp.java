import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class StorageApp{
    public static void main(String[] args){
        ArrayList<String> items = new ArrayList();
        ArrayList<String> update = new ArrayList();
        Scanner s = new Scanner(System.in);

        int
        option = 0,
        itemToRemove;

        items.add(new String("raquete"));
        items.add(new String("bola"));
        items.add(new String("overgrip"));
        items.add(new String("boné"));
        items.add(new String("gatorade"));
        items.add(new String("toalha"));
        items.add(new String("camiseta"));
        items.add(new String("corda"));

        do{
            System.out.println("Digite 1 para adicionar dados à lista.\nDigit"+
                               "e 2 para remover dados da lista.\nDigite 3 pa"+
                               "ra atualizar dadoss dados da lista.\nDigite 4"+
                               "4 para apresentar dados da lista\nDigite 0 pa"+
                               "ra finalizar.");
            option = s.nextInt();
        
            switch(option){
                case 1:
                    System.out.println("Digite nome do produto: ");
                    String updateItem = s.next();

                    update.add(new String(updateItem));

                    items.addAll(update);
                    break;

                case 2:
                    System.out.println("Digitex o nome do item à se remover");
                    String toRemove = s.next();
                    if(items.contains(toRemove)){
                        items.remove(toRemove);
                    }
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
