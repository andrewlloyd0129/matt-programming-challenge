package main;

import java.util.ArrayList;

public class Employee{
    String _EmployeeId;
    ArrayList<GrantPK> _Grants;

    public Employee(String employeeId){
        _EmployeeId = employeeId;
    }

    public void addGrant(GrantPK grantPk) {
        _Grants.add(grantPk);
    }
}

