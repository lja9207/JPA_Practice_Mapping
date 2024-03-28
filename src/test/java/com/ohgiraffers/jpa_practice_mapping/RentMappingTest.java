package com.ohgiraffers.jpa_practice_mapping;


import com.ohgiraffers.mapping.RentBookService;
import com.ohgiraffers.mapping.RentDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

@SpringBootTest
class RentMappingTest {

    @Autowired
    private RentBookService rentBookService;

    private static Stream<Arguments> registRent(){
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(2, 1),
                Arguments.of(1, 2),
                Arguments.of(2, 2)
        );
    }

    @ParameterizedTest(name = "{0}번 회원이 {1}번 책을 대여하는 테스트")
    @MethodSource("registRent")
    void testGenerateRent(int personNo, int bookNo){
        //given

        //when

        //then

        Assertions.assertDoesNotThrow(
                () -> rentBookService.generateRentBook(
                        new RentDTO(personNo, bookNo)
                )
        );
    }

}
