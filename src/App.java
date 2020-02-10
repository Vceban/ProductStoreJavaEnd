
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vovan
 */
public class App {

    public static void main(String[] args) {
        List<Store> store = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
       //1. add product in store
       store.add(new Store("banan", 3, 15, 7));
       store.add(new Store("apple", 3, 3, 7));
       store.add(new Store("strowbery", 3,22, 7));
       store.add(new Store("apricot", 3, 2, 7));
       //2. to Monitor every product
       store.stream()
               .forEach(a -> System.out.println(a));
       //3. sold product, enter a count and store ybiraet ego
       for(int i = 0; i < store.size(); i++){
          boolean search = store.get(i).getName() == "banan";
          if(search)
              store.get(i).getCount() - ;
       }
      // store.stream()
        //       .filter((p)-> p.getName() == sc.nextLine())
          //     .forEach(a -> System.out.println(a));
       //4. profit together
       
       //5. profit each tovar
       for(int i = 0; i < store.size(); i++){
          double profit = store.get(i).getPriceUp() - store.get(i).getPrice();
                  System.out.println("Profit from " + store.get(i).getName() + " = " + profit);

       }
       
      // store.stream()
        //6.
        //6.1 sort by name
            store.sort((o1,o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(store);
        //6.2 sort by sroc godnosty
        
        //6.3 sort by price
            store.sort((o1,o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
        System.out.println(store);
        //6.4 sort by price naoborot
             store.sort((o1,o2) -> Double.compare(o2.getPrice(), o1.getPrice()));
        System.out.println(store);
    }

}
