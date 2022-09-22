import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MetodoSet {
    public static void main(String[] args) throws Exception {
        
        //HashSet<Double> notas = new HashSet<>();

        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

        //exiba a posição da nota 5.0
        System.out.println("Não é possivel no SET");
        System.out.println("");

        //confira se a nota 5 está no conjunto
        System.out.println("A nota 5 existe? :" + notas.contains(5d));
        System.out.println("");

        //exiba a menor nota
        System.out.println("A menor nota é: " + Collections.min(notas));
        System.out.println("");

        //exiba a maior nota
        System.out.println("A maior nota é: " + Collections.max(notas));
        System.out.println("");

        //exiba as somas dos valores
        Iterator<Double> iterator = notas.iterator();
        double soma = 0;
        while(iterator.hasNext()){
            double next = iterator.next();
            soma += next;
        }
        System.out.println("A soma das notas é " + soma);
        System.out.println("");

        //exiba a média dos valores
        System.out.println("A media é: " + soma / notas.size());
        System.out.println("");

        //remova a nora 0
        notas.remove(0d);
        System.out.println(notas);
        System.out.println("");

        //remova as notas menores que 7 e exiba a lista
        Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext()){
            Double nota = iterator2.next();
            if(nota < 7) iterator2.remove();
        }
        System.out.println(notas);
        System.out.println("");

        //Exiba na ordem que foram informados (só da para fazer com linked hash set)
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.5);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.5);
        System.out.println(notas2);

        //Exiba todas as notas na ordem crescente
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);
        System.out.println("");

        //apague todo o conjunto
        notas.clear();
        notas2.clear();
        notas3.clear();
        System.out.println("Os conjuntos estão vazios? 1: " + notas.isEmpty() + ", 2: " + notas2.isEmpty() + ", 3: "+ notas3.isEmpty());
    }
}
