package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    private double price;

    public Dodgems(String name, int rating) {
        super(name, rating);
        this.price = 10;
    }

    public double defaultPrice(){ return this.price; }

    public double priceForVisitor(Visitor visitor){
        if (visitor.getAge() < 12) {
            return this.price / 2;
        }
        return this.price;
    }
}
