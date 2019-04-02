package main;

import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GrantFinderTest {

    @Test
    public void givenEmployeeHasMultipleGrants_onlyThatEmployeesGrantsAreReturned(){
        Grant grant1 = new Grant("VEST", LocalDate.MAX,15,10.10D);
        Grant grant2 = new Grant("VEST", LocalDate.MAX,20,15.10D);
        Grant grantNotEmployees = new Grant("VEST", LocalDate.MAX,10,12.10D);

        ArrayList<Grant> grants = new ArrayList<>();
        grants.add(grant1);
        grants.add(grant2);
        grants.add(grantNotEmployees);

        GrantFinder finder = new GrantFinder(grants);

        Employee employee = new Employee("super cool employee id");
        employee.addGrant(grant1.getGrantId());
        employee.addGrant(grant2.getGrantId());

        List<Grant> results = finder.findGrantsByEmployee(employee);

        List<Grant> expected = new ArrayList<>();
        expected.add(grant1);
        expected.add(grant2);

        assertEquals(results, expected);
        assertFalse(results.contains(grantNotEmployees));
    }
}