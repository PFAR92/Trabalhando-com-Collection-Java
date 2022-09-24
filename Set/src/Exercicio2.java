import java.util.HashSet;
import java.util.Set;

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

        //Exiba por ordem de inserção
        

    }
}

class LinguagemFavorita{
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
        return "[anoDeCriacao=" + anoDeCriacao + ", ide=" + ide + ", nome=" + nome + "]";
    }

    
    
    
    
}