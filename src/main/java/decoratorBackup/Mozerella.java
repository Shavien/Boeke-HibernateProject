package decoratorBackup;

public class Mozerella extends  ToppingDecorator{

    public Mozerella(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Dough");

        System.out.println("Adding Moz");
    }

    public String getDescription(){
        return tempPizza.getDescription() + ", Mozzerella";
    }

    public double getCost(){
        return tempPizza.getCost() + .50;
    }
}
