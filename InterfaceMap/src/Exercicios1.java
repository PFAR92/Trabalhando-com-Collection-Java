import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Exercicios1 {
    public static void main(String[] args) {
        Map<String, Integer> estadoPopulacao = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        for(Map.Entry<String, Integer> populacao : estadoPopulacao.entrySet()){
            System.out.println("O estado " + populacao.getKey() + " tem uma população de " + populacao.getValue());
        }
        System.out.println("============================");

        //Substitua a população do estado de RN por 3354165
        estadoPopulacao.put("RN", 3354165);
        for(Map.Entry<String, Integer> populacao : estadoPopulacao.entrySet()){
            System.out.println("O estado " + populacao.getKey() + " tem uma população de " + populacao.getValue());
        }
        System.out.println("============================");
        
    }
}
