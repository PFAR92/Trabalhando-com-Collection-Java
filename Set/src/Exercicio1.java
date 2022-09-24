import java.util.LinkedHashSet;
import java.util.Set;

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
    }
}
