package decoratorBackup;

public class TomatoSaus extends  ToppingDecorator{

    public TomatoSaus(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Saus");
    }

    public String getDescription(){
        return tempPizza.getDescription() + ", Tomato Saus";
    }

    public double getCost(){
        return tempPizza.getCost() + .35;
    }
}