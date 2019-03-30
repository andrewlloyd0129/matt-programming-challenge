package main;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testMethod_returnsStringPassedIntoIt() {
        App app = new App();
        String actual = app.testMethod("poop");
        assertEquals("poop", actual);
    }

}