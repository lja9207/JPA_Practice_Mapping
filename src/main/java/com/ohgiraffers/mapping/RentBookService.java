package com.ohgiraffers.mapping;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RentBookService {

    private RentRepository rentRepository;

    public RentBookService(RentRepository rentRepository){
        this.rentRepository = rentRepository;
    }

    @Transactional
    public void generateRentBook(RentDTO rentDTO){
        Rent rent = new Rent(
                rentDTO.getPersonNo(),
                rentDTO.getBookNo()
        );

        rentRepository.save(rent);
    }
}
