package org.example.combinator;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer cliente = new Customer(
                "Alice",
                "alice.guedes@gmail.com",
                "+55987876756",
                LocalDate.of(2019,1,1)
        );

        CustomerValidatorService validatorService = new CustomerValidatorService();
        System.out.println(validatorService.valido(cliente));

    }
}
