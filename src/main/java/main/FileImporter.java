package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileImporter {
    private String _saleRecord;
    private List<String> _vestRecords;


    public List<String> getVestDateRecords(Scanner input){
        input.reset();
        int recordCount = input.nextInt();
        input.nextLine();

        List<String> records = new ArrayList<>();

        for (int i = 0; i < recordCount; i++) {
            records.add( input.nextLine());
        }
        _vestRecords = records;
        return _vestRecords;

    }

    public String getSaleRecord(Scanner input) {
        input.reset();
        return getLastLine(input);
    }

    private String getLastLine(Scanner input) {
        String lastLine = input.nextLine();

        if (input.hasNextLine()) {
            getLastLine(input);
        } else {
            _saleRecord = lastLine;
        }

        return _saleRecord;
    }
}
