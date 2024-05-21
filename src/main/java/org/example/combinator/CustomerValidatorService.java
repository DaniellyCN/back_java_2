package org.example.combinator;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

    private boolean emailValido(String email) {
        return email.contains("@");
    }

    private boolean numeroValido(String numero) {
        return numero.startsWith("+55");
    }

    private boolean adulto(LocalDate dataNascimento) {
        return Period.between(dataNascimento, LocalDate.now()).getYears() >= 18;
    }

    public boolean valido (Customer cliente) {
        return emailValido(cliente.getEmail()) &&
                numeroValido(cliente.getCelular()) &&
                adulto(cliente.getDataNascimento());
    }

}
