import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExercicioStreamApi {
    public static void main(String[] args) {
        
        List<String> numerosAleatorios = Arrays.asList("1","0","4","1","2","3","9","9","6","5");

        //Imprima todos os elementos dessa lista de string
        numerosAleatorios.stream().forEach(new Consumer<String>() {

            @Override
            public void accept(String t) {
                System.out.println(t);
                
            }
        });

        
    }
}
