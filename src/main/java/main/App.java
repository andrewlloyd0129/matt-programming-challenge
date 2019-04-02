package main;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        FileImporter importer = new FileImporter();
        Scanner inputString = new Scanner(System.in);

        String saleRecord = importer.getSaleRecord(inputString);
        List<String> vestDateRecords = importer.getVestDateRecords(inputString);


    }

    public String testMethod(String string) {
        return string;
    }
}
