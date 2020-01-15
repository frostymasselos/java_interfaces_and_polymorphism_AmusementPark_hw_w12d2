package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ITicketed {

    private double price;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.price = 10;
    }

    public boolean isAllowedTo(Visitor visitor){
        if(visitor.getAge() >= 13 && visitor.getHeight() > 145 ){
            return true;
        }
        return false;
    }

    public double defaultPrice(){
        return this.price;
    }

    public double priceForVisitor(Visitor visitor){
        if(visitor.getHeight() > 200){
            return price * 2;
        }
        return price;
    }

}
