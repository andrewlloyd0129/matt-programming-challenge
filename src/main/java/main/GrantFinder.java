package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class GrantFinder{
    private ArrayList<Grant> _grants;

    GrantFinder(ArrayList<Grant> grants){
            _grants = grants;
    }

    List<Grant> findGrantsByEmployee(Employee employee){
        return _grants.stream().filter(x -> employee._Grants.contains(x.getGrantId())).collect(Collectors.toList());
    }
}
