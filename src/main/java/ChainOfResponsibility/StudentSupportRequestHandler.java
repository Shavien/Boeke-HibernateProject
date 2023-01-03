package ChainOfResponsibility;

public class StudentSupportRequestHandler extends AbstractRequestHandler {
    @Override
    protected String[] wordlist() {
        return new String[]{
                "boek","lenen","afgeven","boete"
        };
    }

    @Override
    protected void handleRequest(String request) {

        System.out.println("Request handled by Bieb Juf.");
    }
}
