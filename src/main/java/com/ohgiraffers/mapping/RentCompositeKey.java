package com.ohgiraffers.mapping;

import java.io.Serializable;

public class RentCompositeKey implements Serializable {

    private int personNo;
    private int bookNo;

    protected RentCompositeKey(){}

    public RentCompositeKey(int personNo, int bookNo){
        this.personNo = personNo;
        this.bookNo = bookNo;
    }
}
