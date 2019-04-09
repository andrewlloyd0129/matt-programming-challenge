package main;

public class NormalVest implements VestMethod {

    @Override
    public int applyVestRule(int originalAmount) {
        return originalAmount;
    }
}

