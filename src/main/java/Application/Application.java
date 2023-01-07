package Application;

import ChainOfResponsibility.RequestHandler;
import decoratorBackup.Mozerella;
import decoratorBackup.Pizza;
import decoratorBackup.PlainPizza;
import decoratorBackup.TomatoSaus;
import entities.Auteur;
import entities.Boek;
import service.*;

import java.util.Scanner;

import static service.ChainService.getHandlerChain;

public class Application {

    public static void main(String[] args) {

        BoekService boekService = new BoekService();
        MenuService menuService = new MenuService();
        InsertForAllService insertForAllService = new InsertForAllService();
        SpecialMealDecService specialMealDecService = new SpecialMealDecService();

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number == 1) {
            insertForAllService.insertCrudAllTables();
            System.out.println("All tabels are provided of data!");
        }
        if (input.nextInt() == 2) {
            boekService.BoekZoeker("Stille Eer");
        }
        if (input.nextInt() == 3) {
            boekService.BookList();
        }
        if (input.nextInt() == 4) {
            boekService.BoekUpdate();
        }
        if (input.nextInt() == 5) {
            boekService.boekDelete();
        }
        if (input.nextInt() == 6) {
            Pizza basicPizza = new TomatoSaus(new Mozerella(new PlainPizza()));
            System.out.println("ingriedients: " + basicPizza.getDescription());
            System.out.println("price: " + basicPizza.getCost());
        }
        if (input.nextInt() == 7) {
            menuService.retrieveMenuList();
        }
        if (input.nextInt() == 8) {
            RequestHandler chain = getHandlerChain();
            String request = "We willen rustig lezen";  // vul een request in met de juiste woorden om de chain te starten
            System.out.println(request);
            chain.processRequest(request);

            request = "Honger";
            System.out.println(request);
            chain.processRequest(request);
        }
        if (input.nextInt() == 8) {
            System.out.println("Done");
        }

        //insertForAllService.insertCrudAllTables(); // insert doen op alle tables

        //boekService.BoekZoeker("Stille Eer");   // zoekt boek op met een specifiek naam

        //boekService.BookList();  // geeft de hele boeklijst weer in de bieb

        //boekService.BoekUpdate();  // doet een update op een boeknaam
        //menuService.retrieveMenuList();  // geeft het hele biebMenu weer

        //boekService.boekDelete(); // doet een delete op een boek

/*        SpecialMealDecService specialMealDecService = new SpecialMealDecService();
          specialMealDecService.specialApp();    // draait de decorator pattern
*/

       /* RequestHandler chain = getHandlerChain();
          String request = "We willen rustig lezen";  // vul een request in met de juiste woorden om de chain te starten
          System.out.println(request);
          chain.processRequest(request);

          request = "Honger!";
          System.out.println(request);
          chain.processRequest(request);
       */
    }
}


