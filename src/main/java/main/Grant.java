package main;

import java.time.LocalDate;

public class Grant {
    GrantPK _grantId;
    String _grantType;
    LocalDate _vestDate;
    int _totalShares;
    double _grantPrice;

    public Grant(String grantType, LocalDate vestDate, int totalShare, double grantPrice){
        _grantId = GrantPK.of(IdSequenceNextVal.getNext());
        _grantType = grantType;
        _vestDate = vestDate;
        _totalShares = totalShare;
        _grantPrice = grantPrice;
    }
}

