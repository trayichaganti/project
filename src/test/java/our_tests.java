
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
        assertEquals("Staomy", obj.merge("Sam", "toy"));
    }

    @Test
    public void test_merge2() {
        assertEquals("StAoMy", obj.merge("SAM", "toy"));
    }

    @Test
    public void test_merge3() {
        assertEquals("error", obj.merge("", "toy"));
    }


}


