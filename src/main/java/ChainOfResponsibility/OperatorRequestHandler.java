package ChainOfResponsibility;

public class OperatorRequestHandler extends AbstractRequestHandler {

    @Override
    protected String[] wordlist() {
        return new String[0];
    }

    @Override
    protected void handleRequest(String request) {

        System.out.println("Request handled by operator.");

    }
}
