import java.util.LinkedList;
import java.util.List;

public class Exercicios {
    public static void main(String[] args) {
        
        List <Double> notas2 = new LinkedList<>();

        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);

        //mostre a primeira nota da lista sem removê-lo
        System.out.println("A primeira nota é " + notas2.get(0));

        //mostre a primeira nota da lista removendo-o
        notas2.remove(0);
        System.out.println(notas2.get(0));
    }
}
