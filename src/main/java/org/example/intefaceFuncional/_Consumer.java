package org.example.intefaceFuncional;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "123456789");
        bemVindo.accept(maria);
    }

    static Consumer<Customer> bemVindo = customer ->
            System.out.println("Bem-vindo, "+ customer.nome);

    static class Customer {
        private final String nome;
        private final String celular;

        public Customer(String nome, String celular) {
            this.nome = nome;
            this.celular = celular;
        }

    }
}
