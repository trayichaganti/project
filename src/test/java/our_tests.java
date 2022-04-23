
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class our_tests {

    public static Stesting obj;

    @BeforeClass
    public static void setup() {
        obj = new Stesting();
    }

    //Author: Ankhit Tangella
    //Description: This test case tests the merge function
    @Test
    public void test_merge1() {
        assertEquals("Samtoy", obj.mergeStrings("Sam", "toy"));
    }

    @Test
    public void test_merge2() {
        assertEquals("SAMtoy", obj.mergeStrings("SAM", "toy"));
    }

    @Test
    public void test_merge3() {
        assertEquals("hilltoy", obj.mergeStrings("hill", "toy"));
    }


}


