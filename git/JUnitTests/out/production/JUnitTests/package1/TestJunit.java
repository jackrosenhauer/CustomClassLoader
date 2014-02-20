package package1;

import org.junit.*;

import static org.junit.Assert.assertEquals;
/**
 * Created by jack on 2/12/14.
 */

public class TestJunit {
    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        assertEquals(message,messageUtil.printMessage());
    }
}