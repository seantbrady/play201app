package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void testHelloWorld() {
        String hw = HelloWorld.HELLO_WORLD;
        assertEquals(hw, "Hello world!");
    }
}
