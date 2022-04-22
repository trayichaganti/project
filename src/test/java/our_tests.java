
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

    @Test
    public void test_palindrome1() {
        assertEquals(true, obj.palindrome(121));


    }

    @Test
    public void test_palindrome2() {
        assertEquals(false, obj.palindrome(123));
    }

    @Test
    public void test_palindrome3() {
        assertEquals(true, obj.palindrome(111));
    }

    @Test
    public void test_search1() {
        int arr[] = {1, 2, 3, 4};
        assertEquals(-1, obj.search(arr, 5));
    }

    @Test
    public void test_search2() {
        int arr[] = {1, 2, 3, 4};
        assertEquals(0, obj.search(arr, 1));
    }

    @Test
    public void test_search3() {
        int arr[] = {1, 2, 3, 4};
        assertEquals(3, obj.search(arr, 4));
    }
}


