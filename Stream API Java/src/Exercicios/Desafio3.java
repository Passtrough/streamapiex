package Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class Desafio3 {
    public static void main(String[] args) {
        List<Integer> numero = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> isPositive = n -> n > 0;

        boolean todosPositivos = numero.stream().allMatch(isPositive);

        if (todosPositivos){
            System.out.println("Todos os numeros são positivos!");
        }else{
            System.out.println("Shi, tem negativo ai hein");
        }


    }

}
