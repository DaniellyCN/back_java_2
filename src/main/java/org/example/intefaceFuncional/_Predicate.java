package org.example.intefaceFuncional;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(numeroValidoPredicate.test("079865678"));

        System.out.println(numeroValidoPredicate.and(contem3).test("073567890"));
    }

    static boolean numeroValido(String numero) {
        return  numero.startsWith("07") && numero.length() == 9;
    }

    static Predicate<String> numeroValidoPredicate = numero ->
            numero.startsWith("07") && numero.length() == 9;

    static Predicate<String> contem3 = numero ->
            numero.contains("3");



    }


