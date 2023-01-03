package ChainOfResponsibility;

public class FoodRequestHandler extends AbstractRequestHandler {

    protected String[] wordlist() {
        return new String[]{"food", "water", "rations", "hungry"};
    }


    protected void handleRequest(String request) {
        System.out.println(" Request handled by kitchen. ");
    }
}
