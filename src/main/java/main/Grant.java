package main;

import java.time.LocalDate;

public class Grant{
    GrantPK grantId;
    String _grantType;
    LocalDate _vestDate;
    int _totalShares;
    int _grantPrice;

    public Grant(String grantType, LocalDate vestDate, int totalShare, int grantPrice){
        grantId = GrantPK.of(1);
        _grantType = grantType;
        _vestDate = vestDate;
        _totalShares = totalShare;
        _grantPrice = grantPrice;
    }
}

