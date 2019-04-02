package main;

import java.time.LocalDate;

public class Grant {
    private GrantPK _grantId;

    private String _grantType;
    private LocalDate _vestDate;
    private int _totalShares;
    private double _grantPrice;
    Grant(String grantType, LocalDate vestDate, int totalShare, double grantPrice){
        _grantId = GrantPK.of(IdSequenceNextVal.getNext());
        _grantType = grantType;
        _vestDate = vestDate;
        _totalShares = totalShare;
        _grantPrice = grantPrice;
    }

    GrantPK getGrantId() {
        return _grantId;
    }

    public String getGrantType() {
        return _grantType;
    }

    public LocalDate getVestDate() {
        return _vestDate;
    }

    public int getTotalShares() {
        return _totalShares;
    }

    public double getGrantPrice() {
        return _grantPrice;
    }
}

