import java.util.*;
import java.util.function.Function;

import static javax.swing.UIManager.put;

public class teste {

    public static void main(String[] args) {

            Map<Integer, Contato> agenda = new HashMap<>() {{
                put(1, new Contato("Simba", 5555));
                put(4, new Contato("Cami", 1111));
                put(3, new Contato("Jon", 2222));
            }};

        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNumero()));

        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " +entry.getValue().getNome());
        }
    }
}
