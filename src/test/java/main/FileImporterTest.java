package main;

import org.junit.Test;

import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.*;

public class FileImporterTest {
    private static final String INPUT = "5\n" +
            "VEST,001B,20120101,1000,0.45\n" +
            "VEST,002B,20120101,1500,0.45\n" +
            "VEST,002B,20130101,1000,0.50\n" +
            "VEST,001B,20130101,1500,0.50\n" +
            "VEST,003B,20130101,1000,0.5\n" +
            "020140101,1.00";

    @Test
    public void whenInputHasNRecords_splitInputToLineItems_returnsListOfNLines() {
        Scanner scanner = new Scanner(INPUT);
        FileImporter importer = new FileImporter();
        List<String> results = importer.getVestDateRecords(scanner);

        assertTrue(results.size() == 5);
        assertTrue(results.contains("VEST,001B,20120101,1000,0.45"));
        assertTrue(results.contains("VEST,002B,20120101,1500,0.45"));
        assertTrue(results.contains("VEST,002B,20130101,1000,0.50"));
        assertTrue(results.contains("VEST,001B,20130101,1500,0.50"));
        assertTrue(results.contains("VEST,003B,20130101,1000,0.5"));
    }

    @Test
    public void getSaleRecord_returnsSaleRecord() {
        Scanner scanner = new Scanner(INPUT);
        FileImporter importer = new FileImporter();
        String saleRecord = importer.getSaleRecord(scanner);
        assertEquals("020140101,1.00", saleRecord);
    }


}