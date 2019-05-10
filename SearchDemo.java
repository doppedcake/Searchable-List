/**
 * This application uses LInked Lists to search by name 
 * to get the portion size in ounces of the Food Object.
 * 
 */
package searchdemo;
import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 * @author Patrick
 */
public class SearchDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Food> Searchable = new LinkedList<>();
        Searchable.add(new Food("Spegheti", 12));
        Searchable.add(new Food("Pizza", 36));
        Searchable.add(new Food("Burger", 10));
        Searchable.add(new Food("Hotdog", 8));
        Scanner keyboard = new Scanner(System.in);
         boolean quit = false;
         System.out.println("Items in List:\n"
                 + "Spegheti\n"
                 + "Pizza\n"
                 + "Burger\n"
                 + "Hotdog" );
        int n;
        String f;
        int p;
        while(quit == false){
            System.out.println("Search, Add, Print, or Remove\n");
            System.out.printf("");
            System.out.println("Search: 1 \n "
                    + "Add: 2\n "
                    + "Print: 3\n"
                    + "Remove: 4\n"
                    + "Quit: 5");
            n =keyboard.nextInt();
            switch(n){
               
                case 1: 
                     System.out.println("Enter an Item: ");
                     f = keyboard.next();
                     for(int i = 0; i < Searchable.size(); i++){
                        if(f.equals(Searchable.get(i).getFood())){
                            System.out.println(Searchable.get(i).getFood()+
                                    " has " + Searchable.get(i).Oz + "oz");
                        }
                     }
                     
                    break;
                case 2:System.out.println("Add a new item:");
                    System.out.println("Enter item name:");
                    f = keyboard.next();
                    System.out.println("Enter the portion size:");
                    p = keyboard.nextInt();
                    Searchable.add(new Food(f,p));
                    break;
                case 3:
                    for(int i = 0; i < Searchable.size(); i++){
                        System.out.println(Searchable.get(i).getFood() + "\n");
                        }
                    break; 
                case 4: 
                    System.out.println("Which Item would you like to remove?");
                    f = keyboard.next();
                    for(int i = 0; i < Searchable.size(); i++){
                        if(f.equals(Searchable.get(i).getFood())){
                        Searchable.remove(Searchable.get(i));
                        }
                    }
                    break;
                case 5: quit = true;
                    break;
            }
        }    
    }
    
            
        
    
 
    
}
