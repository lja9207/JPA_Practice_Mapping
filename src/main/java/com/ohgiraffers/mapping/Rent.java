package com.ohgiraffers.mapping;

import jakarta.persistence.*;

@Entity
@Table(name = "rent")
@IdClass(RentCompositeKey.class)
public class Rent {

    @Id
    @Column(name = "person_no")
    private int personNo;

    @Id
    @Column(name = "book_no")
    private int bookNo;

    protected Rent() {}

    public Rent(int personNo, int bookNo) {
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
        return "Rent{" +
                "personNo=" + personNo +
                ", bookNo=" + bookNo +
                '}';
    }
}
