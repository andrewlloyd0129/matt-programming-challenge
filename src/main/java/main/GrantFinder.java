package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GrantFinder{
    ArrayList<Grant> _grants;

    public GrantFinder(ArrayList<Grant> grants){
            _grants = grants;
    }

    public List<Grant> findGrantsByEmployee(Employee employee){
        return _grants.stream().filter(x -> employee._Grants.contains(x)).collect(Collectors.toList());
    }
}
