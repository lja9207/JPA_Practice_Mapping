package com.ohgiraffers.mapping;

public class RentDTO {

    private int personNo;
    private int bookNo;

    public RentDTO(int personNo, int bookNo) {
        this.personNo = personNo;
        this.bookNo = bookNo;
    }

    public int getPersonNo() {
        return personNo;
    }

    public void setPersonNo(int personNo) {
        this.personNo = personNo;
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    @Override
    public String toString() {
        return "RentDTO{" +
                "personNo=" + personNo +
                ", bookNo=" + bookNo +
                '}';
    }
}
