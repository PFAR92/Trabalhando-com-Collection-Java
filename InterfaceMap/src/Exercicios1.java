import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


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

        //Confira se o estado PB está no Dicionário, caso não adicione PB - 4039277
        System.out.println("O estado PB está no dicionário?: " + estadoPopulacao.containsKey("PB"));
        estadoPopulacao.put("PB", 4039277);
        for(Map.Entry<String, Integer> populacao : estadoPopulacao.entrySet()){
            System.out.println("O estado " + populacao.getKey() + " tem uma população de " + populacao.getValue());
        }
        System.out.println("============================");

        //Exiba a população de pernambuco
        for(Map.Entry<String, Integer> populacao : estadoPopulacao.entrySet()){
            System.out.println("O estado " + populacao.getKey() + " tem uma população de " + populacao.getValue());
        }
        System.out.println("============================");

        //Exiba todos os estados e suas populações na ordem que foi informado
        Map<String, Integer> estadoPopulacao1 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        for(Map.Entry<String, Integer> populacao : estadoPopulacao1.entrySet()){
            System.out.println("O estado " + populacao.getKey() + " tem uma população de " + populacao.getValue());
        }
        System.out.println("============================");

        //Ordene os estados e suas pupulações em ordem alfabética
        Map<String, Integer> estadoPopulacao2 = new TreeMap<>(estadoPopulacao); 
        for(Map.Entry<String, Integer> populacao : estadoPopulacao2.entrySet()){
            System.out.println("O estado " + populacao.getKey() + " tem uma população de " + populacao.getValue());
        }
        System.out.println("============================");      
        
        //exiba o estado com menor população e sua quantidade
        int menorPopulacao = Collections.min(estadoPopulacao2.values());
        for(Map.Entry<String, Integer> populacao : estadoPopulacao2.entrySet()){
            if(populacao.getValue().equals(menorPopulacao)){
                System.out.println("A menor população é do estado " + populacao.getKey() + " com uma população de " + populacao.getValue());
            }
        }
        System.out.println("============================"); 
        
        //exiba o estado com maior população e sua quantidade
        int maiorPopulacao = Collections.max(estadoPopulacao2.values());
        for(Map.Entry<String, Integer> populacao : estadoPopulacao2.entrySet()){
            if(populacao.getValue().equals(maiorPopulacao)){
                System.out.println("A maior população é do estado " + populacao.getKey() + " com uma população de " + populacao.getValue());
            }
        }
        System.out.println("============================"); 

        //Exiba a soma da população desses estados
        Iterator<Integer> iterator = estadoPopulacao2.values().iterator();
        int soma = 0;
        while(iterator.hasNext()) soma += iterator.next();

        System.out.println("A soma da população é " + soma);
        System.out.println("============================"); 

        
    }
}
