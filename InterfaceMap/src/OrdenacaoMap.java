import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

public class OrdenacaoMap {
    public static void main(String[] args) {
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhiga, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 lições para o século 21", 432));
        }};

        //Exiba autor e livro em ordem aleatoria
        for(Map.Entry<String, Livro> livro : meusLivros.entrySet()){
            System.out.println("Autor: " + livro.getKey() + " - Livro: " + livro.getValue().getNome());
        }
        System.out.println("============================");

        //exiba por ordem de inserção
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhiga, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 lições para o século 21", 432));
        }};
        for(Map.Entry<String, Livro> livro : meusLivros1.entrySet()){
            System.out.println("Autor: " + livro.getKey() + " - Livro: " + livro.getValue().getNome());
        }
        System.out.println("============================");

        //ordem alfabética dos autores
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros);
        for(Map.Entry<String, Livro> livro : meusLivros2.entrySet()){
            System.out.println("Autor: " + livro.getKey() + " - Livro: " + livro.getValue().getNome()); 
        }
        System.out.println("============================");

        //Ordem alfabética dos nomes dos livros
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Livro> livro : meusLivros3){
            System.out.println("Autor: " + livro.getKey() + " - Livro: " + livro.getValue().getNome());
        }
        System.out.println("============================");

        
    }
}
class Livro{
    private String nome;
    private Integer pagina;

    public Livro(String nome, Integer pagina) {
        this.nome = nome;
        this.pagina = pagina;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPagina() {
        return pagina;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((pagina == null) ? 0 : pagina.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livro other = (Livro) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (pagina == null) {
            if (other.pagina != null)
                return false;
        } else if (!pagina.equals(other.pagina))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Livro [nome=" + nome + ", pagina=" + pagina + "]";
    }
    
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {

        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }

}
