package Exercicios;

import java.util.Arrays;
import java.util.List;

public class Desafio2 {
    public static void main(String[] args) {

        List<Integer> numero = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDosNumerosPares = numero.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();


        System.out.println(somaDosNumerosPares);


    }
}
