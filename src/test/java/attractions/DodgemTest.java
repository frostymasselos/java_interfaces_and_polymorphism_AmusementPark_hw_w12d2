package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor childUnder12;
    Visitor childIs12;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        childUnder12 = new Visitor(11, 150, 20);
        childIs12 = new Visitor(12, 150, 20);
    }

    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void hasDefaultFee() {
        assertEquals(10, dodgems.defaultPrice(), 0.01);
    }

    @Test
    public void halvesFeeForUnderTwelve(){
        assertEquals(5, dodgems.priceForVisitor(childUnder12), 0.01);
        assertEquals(10, dodgems.priceForVisitor(childIs12), 0.01);
    }

}
