import java.util.HashMap;
import java.util.Map;

public class OrdenacaoMap {
    public static void main(String[] args) {
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhiga, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 lições para o século 21", 432));
        }};
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
