package main;

import java.util.ArrayList;

public class ParserResult{
    private ArrayList<Employee> _employees = new ArrayList<>();
    private ArrayList<Grant> _grants = new ArrayList<>();

    public void addEmployee(Employee employee){
        _employees.add(employee);
    }

    public void addGrant(Grant grant){
        _grants.add(grant);
    }

    public ArrayList<Employee> getEmployees(){
        return _employees;
    }

    public ArrayList<Grant> getGrants(){
        return _grants;
    }
}
