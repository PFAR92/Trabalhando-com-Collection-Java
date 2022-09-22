import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        
        System.out.println(notas.indexOf(5d));

        notas.add(4, 8.0);

        System.out.println(notas);

        notas.set(notas.indexOf(5.0), 6.0);

        System.out.println(notas);

        //confira se a nota 5.0 esta na lista
        System.out.println(notas.contains(5d));

        //for(double nota : notas) System.out.println(nota);

        //exiba a terceira nota
        System.out.println(notas.get(2));

        //exiba a menor nota
        System.out.println("A menor nota é " + Collections.min(notas));

        //exiba a maior nota
        System.out.println("A maior nota é " + Collections.max(notas));

        //soma de todas as notas
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("A soma é " + soma);

        //media das notas
        System.out.println("A média é " + (soma / notas.size()));

        //remova a nota 0
        notas.remove(0d);
        System.out.println(notas);

        //remova a nota da posição 0
        notas.remove(0);
        System.out.println(notas);

        //remova as notas menores que 7 e exiba a lista
        Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext()){
            Double next = iterator2.next();
            if(next < 7) iterator2.remove();
        }
        System.out.println(notas);

        //apague toda lista
        notas.clear();
        System.out.println(notas.isEmpty());

        
        

            
    }
}
