import java.util.HashMap;
import java.util.Map;

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
        carrosPopulares.replace("gol", 14.4, 15.2);
        System.out.println(carrosPopulares);
        
    }
}
