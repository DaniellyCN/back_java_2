package org.example.imperativo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.example.imperativo.Main.Genero.FEMININO;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> people = List.of(
            new Pessoa("John",
                    Genero.MASCULINO),
            new Pessoa("Maria",
                    FEMININO),
            new Pessoa("Ricardo",
                    Genero.MASCULINO)

        );
        // imperativo
        List<Pessoa> mulheres = new ArrayList<>();
        for (Pessoa pessoa : people) {
            if(FEMININO.equals(pessoa.genero)) {
                mulheres.add(pessoa);
            }
        }

        for(Pessoa mulher : mulheres) {
            System.out.println(mulher.nome);
        }

        //declarativo
        people.stream()
                .filter(pessoa -> FEMININO.equals(pessoa.genero))
                .toList()
                .forEach(System.out::println);

    }

    public static class Pessoa {
        private final String nome;
        private final Genero genero;

        public Pessoa(String nome, Genero genero) {
            this.nome = nome;
            this.genero = genero;
        }
    }

    enum Genero {
        MASCULINO, FEMININO
    }
}
