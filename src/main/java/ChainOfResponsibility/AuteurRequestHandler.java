package ChainOfResponsibility;

public class AuteurRequestHandler extends AbstractRequestHandler{
    @Override
    protected String[] wordlist() {
        return new String[]{
                "auteur","Auteur"
        };
    }

    @Override
    protected void handleRequest(String request) {

        System.out.println("Request handled by Auteur department.");

    }
}
