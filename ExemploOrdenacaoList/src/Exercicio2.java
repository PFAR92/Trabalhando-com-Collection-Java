import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        int contador = 0;
        int confirmação = 0;
        Scanner input = new Scanner(System.in);
        
        List<String> perfuntas = new LinkedList<>();
        perfuntas.add("Telefonou para a vítima? ");
        perfuntas.add("Esteve no local do crime? ");
        perfuntas.add("Mora perto da vítima? ");
        perfuntas.add("Devia para a vítima? ");
        perfuntas.add("Já trabalhou com a vítima? ");

        List<String> respostas = new ArrayList<>();

        while(true) {
            if(contador == 5){
                input.close();
                break;
            } 
            System.out.print(perfuntas.get(contador) + "[s] Sim ou [n] Não: ");
            String resp = input.next();
        
            switch(resp.toUpperCase()){
            
                case "S":
                    respostas.add(contador, "Sim");
                    contador++;
                    break;

                case "N":
                    respostas.add(contador, "Não");
                    contador++;
                    break;

                default:
                    System.out.println("Digite somente [s] para sim e [n] para não");
            }
        }
        System.out.println(" ");
        System.out.println("Respostas do Entrevistado");

        for(int i = 0; i < perfuntas.size(); i++)  System.out.println(perfuntas.get(i) + respostas.get(i));
        System.out.println(" ");

        Iterator<String> iterator = respostas.iterator();
        while(iterator.hasNext()) if(iterator.next() == "Sim") confirmação++;
        
        if(confirmação == 5) System.out.println("Resultado: ASSASSINO");
        else if(confirmação == 4 || confirmação == 3) System.out.println("Resultado: CÚMPLICE");
        else if(confirmação == 2) System.out.println("Resultado: SUSPEITO");
        else System.out.println("Resultado: INOCENTE");
        
    }
    
}