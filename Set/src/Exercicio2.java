import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio2 {
    
    public static void main(String[] args) {

        Set<LinguagemFavorita> linguagens = new HashSet<>(){{
            add(new LinguagemFavorita("Java", 1991, "intellij"));
            add(new LinguagemFavorita("C#", 2013, "Visual Basic"));
            add(new LinguagemFavorita("python ", 1990, "VS code"));
        }};
        for(LinguagemFavorita lingua : linguagens){
            System.out.println("Nome: " + lingua.getNome() + ", Ano de criação: " + lingua.getAnoDeCriacao() + ", IDE: " + lingua.getIde());
        }
        System.out.println("--------------------------------------");

        //Exiba por ordem de inserção
        Set<LinguagemFavorita> linguagens1 = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Java", 1991, "intellij"));
            add(new LinguagemFavorita("C#", 2013, "Visual Basic"));
            add(new LinguagemFavorita("python ", 1990, "VS code"));
        }};
        for(LinguagemFavorita lingua : linguagens1){
            System.out.println("Nome: " + lingua.getNome() + ", Ano de criação: " + lingua.getAnoDeCriacao() + ", IDE: " + lingua.getIde());
        }
        System.out.println("--------------------------------------");
        
        //exiba por ordem natural
        Set<LinguagemFavorita> linguagemOrdemNatural = new TreeSet<>(new CompareNome());
        linguagemOrdemNatural.addAll(linguagens);
        for(LinguagemFavorita lingua : linguagemOrdemNatural){
            System.out.println("Nome: " + lingua.getNome() + ", Ano de criação: " + lingua.getAnoDeCriacao() + ", IDE: " + lingua.getIde());
        }
        System.out.println("--------------------------------------");

        //Exiba por ordem de IDE
        Set<LinguagemFavorita> linguagemOrdemIDE = new TreeSet<>(new CompareIDE());
        linguagemOrdemIDE.addAll(linguagens1);
        for(LinguagemFavorita lingua : linguagemOrdemIDE){
            System.out.println("Nome: " + lingua.getNome() + ", Ano de criação: " + lingua.getAnoDeCriacao() + ", IDE: " + lingua.getIde());
        }
        System.out.println("--------------------------------------");

        //Exiba por ano de criação e nome
        Set<LinguagemFavorita> linguagemOrdemAnoNome = new TreeSet<>(new CompareAnoNome());
        linguagemOrdemAnoNome.addAll(linguagens);
        for(LinguagemFavorita lingua : linguagemOrdemAnoNome){
            System.out.println("Nome: " + lingua.getNome() + ", Ano de criação: " + lingua.getAnoDeCriacao() + ", IDE: " + lingua.getIde());
        }
        System.out.println("--------------------------------------");
        
    }
}

class LinguagemFavorita {
    private String nome;
    private Integer anoDeCriacao;
    private String ide;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "[nome=" + nome + ", ide=" + ide + ", anoDeCriacao=" + anoDeCriacao + "]";
    }
}

class CompareNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareTo(l2.getNome());
        return nome;
    }

}

class CompareIDE implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int ide = l1.getIde().compareToIgnoreCase(l2.getIde());
        return ide;
    }

}

class CompareAnoNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int ano = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if(ano != 0) return ano;
        
        int nome = l1.getNome().compareTo(l2.getNome());
        
        return nome;
    }

}
