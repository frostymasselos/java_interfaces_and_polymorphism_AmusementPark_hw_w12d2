package stalls;

import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        if(visitor.getAge() >= 18){
            return true;
        }
        return false;
    }

}
