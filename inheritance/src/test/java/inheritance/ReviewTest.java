package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    Review badReview;

    @Before
    public void setUp() {

//        passing in review now as the 4th parameter b/c intellij suggested it
        badReview = new Review("this is such a bad restaurant its crazy", "shingo", 5, review -> {} );
    }

    @Test
    public void testReview() {

        assertEquals("create body", "this is such a bad restaurant its crazy", badReview.body);
        assertEquals("the author name", "shingo", badReview.author);
    }


    @Test
    public void testString(){

        assertEquals("Summary: this is such a bad restaurant its crazy Author: shingo Rating by this user: 5 / 5", badReview.toString());
    }

}