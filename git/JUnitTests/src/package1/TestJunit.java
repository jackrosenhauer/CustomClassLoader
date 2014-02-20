package package1;

import org.junit.*;

import static org.junit.Assert.assertEquals;
/**
 * Created by jack on 2/12/14.
 */

public class TestJunit {

    @Test
    public void test_1(){
        assertEquals(1,1);
    }

    @Test
    public void test_2(){
        assertEquals(4,4);
    }
}