package service;

import ChainOfResponsibility.*;

public class ChainService {

    public static RequestHandler getHandlerChain(){

        RequestHandler food = new FoodRequestHandler();
        RequestHandler bieb = new BiebRequestHandler();
        RequestHandler auteur = new AuteurRequestHandler();
        RequestHandler student = new StudentSupportRequestHandler();
        RequestHandler operator = new OperatorRequestHandler();

        food.setNextHandler(bieb);
        bieb.setNextHandler(auteur);
        auteur.setNextHandler(student);
        student.setNextHandler(operator);

        return food;
    }

}
