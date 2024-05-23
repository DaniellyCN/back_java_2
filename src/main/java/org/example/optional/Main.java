package org.example.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String s = "1";
        int numero = converteEmNumero(s);
        System.out.println(numero);

        Optional<Integer> numero2 = converteEmNumeroOptional(s);

        numero2.ifPresent(n -> System.out.println(n));
    }

    public static int converteEmNumero(String numeroStr) {
        return Integer.parseInt(numeroStr);
    }

    public static Optional<Integer> converteEmNumeroOptional(String numeroStr) {
        try{
            Integer numero = Integer.valueOf(numeroStr);
            return Optional.of(numero);
        }catch (Exception e){
            return Optional.empty();
        }


    }
}
