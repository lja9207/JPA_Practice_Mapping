package com.ohgiraffers.mapping;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class RentRepository {

    @PersistenceContext
    private EntityManager manager;

    public void save(Rent rent){
        manager.persist(rent);
    }
}
