package main;

public class GrantPK{
    double grantId;

     public static GrantPK of(double d){
        return new GrantPK(d);
    }

    private GrantPK(double d){
        grantId = d;
    }
}
