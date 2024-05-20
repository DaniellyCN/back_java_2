package org.example.intefaceFuncional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        //Function :: 1 argumento e gera 1 resultado
        int incremento = incremento(0);
        System.out.println(incremento);

        int incremento2 = incrementoFunction.apply(1);
        System.out.println(incremento2);

        int multiplicaResultado = multiplicaBy10.apply(incremento2);

        Function<Integer, Integer> soma1eMultiplicaBy10 =
                incrementoFunction.andThen(multiplicaBy10);

        System.out.println(soma1eMultiplicaBy10.apply(1));

        //BiFunctions:: 2 argumentos e gera 1 resultado
    }

    static Function<Integer, Integer> incrementoFunction = numero -> numero + 1;
    static Function<Integer, Integer> multiplicaBy10 = numero -> numero * 10;

    static BiFunction<Integer, Integer, Integer> incrementaEmultiplicaBifunction =
            (numeroIncremento, numeroMultiplicador) -> (numeroIncremento + 1) * 10;

    static  int incremento (int numero) {
        return numero + 1;
    }
    static  int incrementoEmultiplica (int numero, int numeroMultiplicador) {
        return (numero + 1) * numeroMultiplicador;
    }
}
