package ChainOfResponsibility;

public interface RequestHandler {

    public void processRequest(String request);
    public void setNextHandler(RequestHandler handler);

}
