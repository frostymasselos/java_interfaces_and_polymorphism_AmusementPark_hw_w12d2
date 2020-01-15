package stalls;
import people.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    private Visitor visitorUnderEighteen;
    private Visitor visitorEighteenOrOver;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 8);

        visitorUnderEighteen = new Visitor(17, 150, 20);
        visitorEighteenOrOver = new Visitor(18, 165, 30);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canLetInVisitorOverAgeOfFifteen(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitorEighteenOrOver));
    }

    @Test
    public void doesNotLetInVisitorUnderAgeOfFifteen(){
        assertEquals(false, tobaccoStall.isAllowedTo(visitorUnderEighteen));
    }
}
