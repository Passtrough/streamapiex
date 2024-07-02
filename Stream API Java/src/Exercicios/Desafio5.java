package Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Desafio5 {
    public static void main(String[] args) {
    List<Integer> numero = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    Stream<Integer> acimaDeCinco = numero.stream().filter(n -> n > 5);

    double media = acimaDeCinco.mapToInt(Integer::valueOf).average().orElse(0);


        System.out.println(media);
    }



}
