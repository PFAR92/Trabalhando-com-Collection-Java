import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
    
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 12, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 18, "amarelo"));

        }};
        
        System.out.println("Por ordem de inserção" + meusGatos);
        System.out.println(" ");

        Collections.shuffle(meusGatos);
        System.out.println("Ordem aleatória " + meusGatos);
        System.out.println(" ");

        Collections.sort(meusGatos);
        System.out.println("Por ordem natural " + meusGatos);
        System.out.println(" ");

        meusGatos.sort(new ComparatorIdade());
        System.out.println("Por idade " + meusGatos);
        System.out.println(" ");
        
        meusGatos.sort(new ComparatorCor());
        System.out.println("Por Cor " + meusGatos);
        System.out.println(" ");

        Collections.sort(meusGatos, new ComparatorNomeCorIdade());;
        System.out.println("ordem por nome, idade e cor " + meusGatos);




        
    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;


    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }


    public String getNome() {
        return nome;
    }


    public Integer getIdade() {
        return idade;
    }


    public String getCor() {
        return cor;
    }


    @Override
    public String toString() {
        return "[nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
    }


    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
    
}

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }

}

class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }

}

class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {

        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());


    }

}