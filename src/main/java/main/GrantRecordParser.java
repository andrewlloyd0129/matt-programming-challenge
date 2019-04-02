package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

public class GrantRecordParser {

    public ParserResult parse(List<String> records){
        ParserResult parserResult = new ParserResult();

        for (String record : records) {
            String[] recordArray = record.split(",");
            String employeeID = recordArray[1];

            List<Employee> employeeList = parserResult.getEmployees().stream().filter(x -> x._EmployeeId == employeeID).collect(Collectors.toList());

            Employee employee;
            if (employeeList.isEmpty() ) {
                employee = new Employee(employeeID);
            } else {
                employee = employeeList.get(0);
            }

            String grantType = recordArray[0];
            LocalDate vestDate = convertVestDate(recordArray[2]);
            int shareCount = Integer.getInteger(recordArray[3]);
            double sharePrice = Double.valueOf(recordArray[4]);
            Grant grant = new Grant(grantType, vestDate, shareCount, sharePrice);

            employee.addGrant(grant.getGrantId());

            if (!parserResult.getEmployees().contains(employee)) {
                parserResult.addEmployee(employee);
            }
            parserResult.addGrant(grant);
        }

        return parserResult;
    }

    private LocalDate convertVestDate(String vestDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        return LocalDate.parse(vestDate, formatter);
    }

}

