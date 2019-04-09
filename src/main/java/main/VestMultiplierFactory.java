package main;

import java.util.HashMap;

public class VestMultiplierFactory {
    private HashMap<String, VestMethod> vestMethodsHashMap;

    public VestMultiplierFactory(){
        vestMethodsHashMap.put("VEST", new NormalVest());
        vestMethodsHashMap.put("PERF", new PerformanceVest());
    }

    public VestMethod getVestMethod(String vestType){
        return vestMethodsHashMap.get(vestType);
    }
}

