package main;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GrantRecordParserTest {
    @Test
    public void split_comma_splitsStringToArrayOfStringsAtComma() {
        String string = "test,test2,test3";
        String[] actual = string.split(",");
        String[] expected = new String[]{"test", "test2", "test3"};
        assertEquals(expected,actual);
    }

}