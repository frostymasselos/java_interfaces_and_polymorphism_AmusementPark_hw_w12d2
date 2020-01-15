package attractions;

//By default, already imports the name of thing it's testing (as specified in test file name) even when its in package.
import people.Visitor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    private Playground playground;
    private Visitor visitorUnderFifteen;
    private Visitor visitorFifteenOrOver;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitorUnderFifteen = new Visitor(14, 150, 20);
        visitorFifteenOrOver = new Visitor(16, 165, 30);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void canLetInVisitorOverAgeOfFifteen(){
        assertEquals(true, playground.isAllowedTo(visitorFifteenOrOver));
    }

    @Test
    public void doesNotLetInVisitorUnderAgeOfFifteen(){
        assertEquals(false, playground.isAllowedTo(visitorUnderFifteen));
    }
}
