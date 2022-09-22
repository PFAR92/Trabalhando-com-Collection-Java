import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class Exercicio1 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int contador = 0;
        
        List<Double> temperatura = new ArrayList<>();
        String mes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};

        while(true){
            if(contador == 5) {
                input.close();
                break;
            }

            System.out.print("Digite a temperatura média de " + mes[contador] + ": ");
            String teclado = input.next();

            if(VerificaInputs.valor(teclado) == true){
                double temp = Double.parseDouble(teclado);
                temperatura.add(contador, temp);
                contador++;
            }            
        }

        System.out.println(temperatura);

        //tirar a média
        Iterator<Double> iterator = temperatura.iterator();
        double soma = 0d;
        while(iterator.hasNext()){
            double next = iterator.next();
            soma += next;
        }
        double media = soma / temperatura.size();
        System.out.println("A média das temperaturas é " + media);

        //mostre as temperaturas acima da média
        for(int i = 0; i < temperatura.size(); i++){
            if(temperatura.get(i) > media) System.out.println("O mês de " + mes[i] + " ficou acima da média com " + temperatura.get(i) + "°");
        }


            
        


    }
}

class VerificaInputs{

    public static boolean valor(String x){

        try{
            Double.parseDouble(x);
            return true;
        }catch(NumberFormatException e){
            System.err.println("Digite um número");
            return false;
        }
    }
}
