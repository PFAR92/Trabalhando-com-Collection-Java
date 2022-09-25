import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class App {
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
            if(entry.getValue().equals(melhorConsumo)) carroMaisEficiente = entry.getKey();
        }
        System.out.println("O carro mais eficiente é o " + carroMaisEficiente + " com o consumo de " + melhorConsumo + " km/l");
        System.out.println("---------------------------");
        
        

        
    }
}
