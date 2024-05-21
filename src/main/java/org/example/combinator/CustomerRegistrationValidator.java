package org.example.combinator;

import java.util.function.Function;

public interface CustomerRegistrationValidator
        extends Function<Customer, CustomerRegistrationValidator.ValidationResult> {
    static CustomerRegistrationValidator emailValido( ) {
        return customer -> customer.getEmail().contains("@") ?
                    ValidationResult.SUCESSO : ValidationResult.EMAIL_INVALIDO;
    }

    static CustomerRegistrationValidator phoneValido( ) {
        return customer -> customer.getCelular().startsWith("+55") ?
                ValidationResult.SUCESSO :  ValidationResult.EMAIL_INVALIDO;
    }

    enum ValidationResult {
        SUCESSO,
        CELULAR_INVALIDO,
        EMAIL_INVALIDO,
        NAO_E_ADULTO
    }


}
