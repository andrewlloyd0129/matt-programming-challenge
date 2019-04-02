package main;

import java.util.ArrayList;

class Employee{
    String _EmployeeId;
    ArrayList<GrantPK> _Grants = new ArrayList<>();

    Employee(String employeeId){
        _EmployeeId = employeeId;
    }

    void addGrant(GrantPK grantPk) {
        _Grants.add(grantPk);
    }
}

