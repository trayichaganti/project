import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class ourTests {

    public static Stesting obj;

    @BeforeClass
    public static void setup() {
        obj = new Stesting();
    }

    //Author: Ankhit Tangella
    //Description: This test case tests the merge function
    @Test
    public void  mergeStringsTest() {
        assertEquals(Stesting.mergeStrings("hi", "hello"),"hihello");
    }


}


