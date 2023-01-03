package ChainOfResponsibility;

public class BiebRequestHandler extends AbstractRequestHandler{
    @Override
    protected String[] wordlist() {
        return new String[]{
                "bieb","lezen","rustig lezen"};
    }

    @Override
    protected void handleRequest(String request) {

        System.out.println("Request handled by bibliotheek department.");

    }
}
