package ChainOfResponsibility;

public abstract class AbstractRequestHandler implements RequestHandler {

    private RequestHandler nextHandler;

    protected abstract String[] wordlist();

    protected abstract void handleRequest(String request);

    public void setNextHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }


    public void processRequest(String request) {
        boolean match = false;
        // handle the request here if the word list is empty

        if (wordlist().length == 0) {
            match = true;
        } else {
            for (String word : wordlist()) {
                if (request.contains(word)) {
                    match = true;
                    break;
                }
            }
        }
        if(match){
            handleRequest(request);
        }
        else {nextHandler.processRequest(request);}
    }
}
