package conversao;

import java.util.Scanner;

public class Conversao {
    
    public static void main(String[] args) {
        
        Scanner pinha = new Scanner(System.in);
        System.out.println("Escolha um GRAU Celcius: ");
        
        int celsius = pinha.nextInt();
        double conv = celsius * 1.8 + 32;
        
        System.out.println("O Grau escolhido foi: " + celsius);
        System.out.println( celsius + " Graus Celcius " + " convertido para Farenheiht sera: " + conv );
        
        
        
        pinha.close();
        
    }
    
}
