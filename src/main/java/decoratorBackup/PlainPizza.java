package decoratorBackup;

public class PlainPizza implements Pizza{


    @Override
    public String getDescription() {
        return "thin dough";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
