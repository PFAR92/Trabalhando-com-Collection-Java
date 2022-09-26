import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class InterfaceMap {
    public static void main(String[] args) throws Exception {
        
        //Crie uma dicionário que relacione os modelos e seus respectivos consumos
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);
        System.out.println("---------------------------");

        //substitua o consumo do Gol por 15.2 km/l
        //carrosPopulares.replace("gol", 14.4, 15.2);
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);
        System.out.println("---------------------------");

        //confira se o modelo tucson está no dicionário
        System.out.println(carrosPopulares.containsKey("tucson"));
        System.out.println("---------------------------");

        //Exiba o consumo do uno
        System.out.println(carrosPopulares.get("uno"));
        System.out.println("---------------------------");

        //Exiba os modelos
        for(String carros : carrosPopulares.keySet()) System.out.println(carros);
        System.out.println("---------------------------");

        //Exiba os consumos dos carros
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);
        System.out.println("---------------------------");

        //exiba o modelo mais econômico e seu consumo
        Double melhorConsumo = Collections.max(carrosPopulares.values());
        Set<Entry<String, Double>> entrySet = carrosPopulares.entrySet();
        String carroMaisEficiente = "";
        for(Map.Entry<String, Double> entry : entrySet){
            if(entry.getValue().equals(melhorConsumo)) {
                carroMaisEficiente = entry.getKey();
                System.out.println("O carro mais eficiente é o " + carroMaisEficiente + " com o consumo de " + melhorConsumo + " km/l");
            }
        }
        
        System.out.println("---------------------------");

        //exiba o modelo menos econômico e seu consumo
        Double piorConsumo = Collections.min(carrosPopulares.values());
        String carroMenosEficiente = "";
        for(Map.Entry<String, Double> entry : entrySet){
            if(entry.getValue().equals(piorConsumo)){
                carroMenosEficiente = entry.getKey();
                System.out.println("O carro menos eficiente é o " + carroMenosEficiente + " com o consumo de " + piorConsumo + " km/l");
            }
        }
        System.out.println("---------------------------");

        //exiba as somas dos consumos
        double soma = 0;
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("A soma dos consumos é " + soma);
        System.out.println("---------------------------");
        
        //exiba a media dos consumos desse dicionário
        System.out.println("A média dos consumos é " + soma / carrosPopulares.values().size());
        System.out.println("---------------------------");

        //remova os modelos com comsumo igual a 15.6
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);
        System.out.println("---------------------------");

        //exiba os carros na ordem em que foram informados
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1);
        System.out.println("---------------------------");
        
    }
}
