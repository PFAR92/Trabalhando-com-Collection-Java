import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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

        


        
    }
}
