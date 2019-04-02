package main;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class GrantRecordParser {

    public ParserResult parse(List<String> records){
        ParserResult parserResult = new ParserResult();

        for (String record : records) {
            String[] recordArray = record.split(",");

            Employee employee = findOrCreateEmployee(recordArray[1], parserResult.getEmployees());

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
        return LocalDate.parse(vestDate);
    }

    private Employee findOrCreateEmployee(String employeeId, List<Employee> employees) {
        List<Employee> employeeList = employees.stream().filter(x -> x._EmployeeId == employeeId).collect(Collectors.toList());
        if (employeeList.isEmpty()) {
            return new Employee(employeeId);
        }
        return employeeList.get(0);
    }

}

