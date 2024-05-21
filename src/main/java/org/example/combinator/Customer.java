package org.example.combinator;

import java.time.LocalDate;

public class Customer {
    private final String nome;
    private final String email;
    private final String celular;
    private final LocalDate dataNascimento;

    public Customer(String nome, String email, String celular, LocalDate dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.celular = celular;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCelular() {
        return celular;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

}
