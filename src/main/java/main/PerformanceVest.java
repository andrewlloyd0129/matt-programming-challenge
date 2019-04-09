package main;

public class PerformanceVest implements VestMethod {

    @Override
    public int applyVestRule(int originalAmount) {
        return (int)(originalAmount * 1.5D);
        //TODO this needs to not be cast as an integer cause its going to kill out precession. make money class later
    }
}
