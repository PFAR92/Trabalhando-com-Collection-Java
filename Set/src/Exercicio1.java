import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class Exercicio1 {
    public static void main(String[] args) {
        
        Set<String> arco_ires = new LinkedHashSet<>();

        arco_ires.add("vermelha");
        arco_ires.add("laranja");
        arco_ires.add("amarela");
        arco_ires.add("verde");
        arco_ires.add("azul");
        arco_ires.add("anil");
        arco_ires.add("violeta");

        //exiba todas as cores uma abaixo da outra
        for(String cores : arco_ires) System.out.println(cores);
        System.out.println("----------------------------");

        //exiba a quantidade de cores que o arco ires tem
        System.out.println("o arco-ires tem " + arco_ires.size() + " cores");
        System.out.println("----------------------------");

        //exiba as cores em ordem alfabética
        Set<String> arco_iresOrdenado = new TreeSet<>(arco_ires);
        for(String cores : arco_iresOrdenado) System.out.println(cores);
        System.out.println("----------------------------");

        //exiba as cores na ordem inversa do que foi informado
        List<String> arcoListInverse = new ArrayList<>(arco_ires);
        Collections.reverse(arcoListInverse);
        for(String cores : arcoListInverse) System.out.println(cores);
        System.out.println("----------------------------");

        //Exiba todas as cores que começam com a letra ”v”
        Iterator<String> iterator = arco_ires.iterator();

        while(iterator.hasNext()){
            String cor = iterator.next();
            char letra = cor.charAt(0);
            if(letra == 'v') System.out.println(cor);            
        }
        System.out.println("----------------------------");

        //Remova todas as cores que não começam com a letra “v”
        Iterator<String> iterator2 = arco_ires.iterator();

        while(iterator2.hasNext()){
            String cor = iterator2.next();
            char letra = cor.charAt(0);
            if(letra == 'v') iterator2.remove();;
        }
        for(String cores : arco_ires) System.out.println(cores);
        System.out.println("----------------------------");

        //Limpe o conjunto
        arco_ires.clear();
        arcoListInverse.clear();
        arco_iresOrdenado.clear();

        //Confira se o conjunto está vazio
        System.out.println("Todas as listas estão vazias? " + arco_ires.isEmpty() + ", " + arcoListInverse.isEmpty() + ", " + arco_iresOrdenado.isEmpty());

        

        

    }
    
}

