package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GrantRecordParser {

    public List<Employee> parse(List<String> records){
        List<Employee> employees = new ArrayList<>();
        for (String record : records) {
            String[] recordArray = record.split(",");

            Employee employee = findOrCreateEmployee(recordArray[1], employees);

            String grantType = recordArray[0];
            LocalDate vestDate = convertVestDate(recordArray[2]);
            int shareCount = Integer.getInteger(recordArray[3]);
            double sharePrice = Double.valueOf(recordArray[4]);
            Grant grant = new Grant(grantType, vestDate, shareCount, sharePrice);


            employee.addGrant(grant._grantId);



            if (!employees.contains(employee)) {
                employees.add(employee);
            }
        }

        return employees;

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
