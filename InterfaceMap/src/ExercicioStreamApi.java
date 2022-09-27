import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.text.html.HTMLEditorKit.Parser;

public class ExercicioStreamApi {
    public static void main(String[] args) {
        
        List<String> numerosAleatorios = Arrays.asList("1","0","4","1","2","3","9","9","6","5");

        System.out.println("Imprima a lista");
        /* numerosAleatorios.stream().forEach(new Consumer<String>() {

            @Override
            public void accept(String t) {
                System.out.println(t);
                
            }
        }); */

        //numerosAleatorios.stream().forEach(t -> System.out.println(t));

        numerosAleatorios.stream().forEach(System.out::println);
        System.out.println("===================================");

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um set");
        Set<String> collectSet = numerosAleatorios.stream()
            .limit(5)
            .collect(Collectors.toSet());
        collectSet.forEach(System.out::println);

        System.out.println("===================================");

        System.out.println("Tranforme essa lista em uma lista de números inteiros");
        List<Integer> collect = numerosAleatorios.stream()
            .map(Integer::parseInt)
            .collect(Collectors.toList());
        collect.forEach(System.out::println);

        System.out.println("===================================");

        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista");
        /* List<Integer> listParesMaioresQue2 = collect.stream()
            .filter(new Predicate<Integer>() {

                @Override
                public boolean test(Integer integer) {
                    if(integer % 2 == 0 && integer > 2) return true;
                    return false;
                }
                
            }).collect(Collectors.toList()); */
        List<Integer> listParesMaioresQue2 = collect.stream()
            .filter( integer -> (integer % 2 == 0 && integer > 2)) .collect(Collectors.toList());
        System.out.println(listParesMaioresQue2);

        System.out.println("===================================");

        System.out.println("Mostre a média dos números");

        /* numerosAleatorios.stream()
            .mapToInt(value -> Integer.parseInt(value)); */
            numerosAleatorios.stream()
            .mapToInt(Integer::parseInt)
            .average()
            .ifPresent(System.out::println); 
        System.out.println("===================================");  
        
        /* System.out.println("Remova os valores ímpares");

        collect.removeIf(t -> (t % 2 != 0));
        System.out.println(collect);
        System.out.println("==================================="); */

        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante");

        numerosAleatorios.stream().skip(3).forEach(System.out::println);
        System.out.println("===================================");

        System.out.println("Retirando os números repetidos da lista quantos números ficam?");

        long numerosUnicos = numerosAleatorios.stream()
            .distinct()
            .count();
        System.out.println(numerosUnicos);
        System.out.println("===================================");
            
        System.out.println("Mostre o menor valor da lista");

        collect.stream()
            .mapToInt(Integer::intValue)
            .min()
            .ifPresent(System.out::println);
        System.out.println("===================================");

        System.out.println("Mostre o maior valor da lista");

        collect.stream()
            .mapToInt(Integer::intValue)
            .max()
            .ifPresent(System.out::println);
        System.out.println("===================================");

        System.out.println("Pegue apenas os números impares e some");

        int soma = collect.stream()
            .filter(t -> (t % 2 != 0))
            .mapToInt(Integer::intValue)
            .sum();
        System.out.println(soma);
        System.out.println("===================================");

        
            
    }
}
