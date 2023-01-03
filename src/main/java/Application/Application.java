package Application;

import ChainOfResponsibility.RequestHandler;
import entities.Auteur;
import entities.Boek;
import service.*;

import static service.ChainService.getHandlerChain;

public class Application {

    public static void main(String[] args) {

        BoekService boekService = new BoekService();
        MenuService menuService = new MenuService();
        InsertForAllService insertForAllService = new InsertForAllService();

        
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
