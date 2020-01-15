package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitorPassAgePassHeight;
    Visitor visitorPassAgeFailHeight;
    Visitor visitorFailAgePassHeight;
    Visitor visitorFailAgeFailHeight;

    Visitor visitorTall;
    Visitor visitorSmall;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitorPassAgePassHeight = new Visitor(13, 146, 10);
        visitorPassAgeFailHeight = new Visitor(13, 145, 10);
        visitorFailAgePassHeight = new Visitor(12, 146, 10);
        visitorFailAgeFailHeight = new Visitor(12, 145, 10);

        visitorTall = new Visitor(25, 201, 100);
        visitorSmall = new Visitor(25, 180, 100);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canLetInVisitorAtLeastAgeOfTwelve(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitorPassAgePassHeight));
    }

    @Test
    public void doesNotLetInVisitorAtLeastAgeOfTwelve(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitorFailAgePassHeight));
    }

    @Test
    public void canLetInVisitorOver125cm(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitorPassAgePassHeight));
    }

    @Test
    public void doesNotLetInVisitor125cmOrUnder(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitorPassAgeFailHeight));
    }

    @Test
    public void getDefaultFee(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void canChargeDoubleFeeForTallPerson(){
        assertEquals(16.80, rollerCoaster.priceForVisitor(visitorTall), 0.01);
    }

    @Test
    public void canChargeDefaultFeeForSmallPerson(){
        assertEquals(8.40, rollerCoaster.priceForVisitor(visitorSmall), 0.01);
    }
}

