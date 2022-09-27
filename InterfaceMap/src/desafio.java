import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class desafio {
    public static void main(String[] args) {
        
        //Lance o dado 100 vezes e armazene. Depois mostre quantas vezes cada valor foi inserido
        Map<Integer, Integer> ladosDado = new LinkedHashMap<>(){{
            put(1, 0);
            put(2, 0);
            put(3, 0);
            put(4, 0);
            put(5, 0);
            put(6, 0);
        }};
        int lado1 = 0;
        int lado2 = 0;
        int lado3 = 0;
        int lado4 = 0;
        int lado5 = 0;
        int lado6 = 0;

        for(int i = 0; i < 100; i++){
            Random aleatorio = new Random();
            int dado = aleatorio.nextInt(6) + 1;            
            switch(dado){
                case 1:
                    lado1++;
                    ladosDado.put(1, lado1);
                    break;
                case 2:
                    lado2++;
                    ladosDado.put(2, lado2);
                    break;
                case 3:
                    lado3++;
                    ladosDado.put(3, lado3);
                    break;
                case 4:
                    lado4++;
                    ladosDado.put(4, lado4);
                    break;
                case 5:
                    lado5++;
                    ladosDado.put(5, lado5);
                    break;
                default:
                    lado6++;
                    ladosDado.put(6, lado6);
            }
        }

        for(Map.Entry<Integer, Integer> lado : ladosDado.entrySet()){
            System.out.println("o lado " + lado.getKey() + " foi escolhido " + lado.getValue() + " vezes");
        }
        
    }
}
