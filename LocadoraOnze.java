package locadoraonze;

import java.util.Scanner; 
import java.util.ArrayList;

public class LocadoraOnze {
        
    public static void main(String[] args) {
        
    Scanner ler = new Scanner (System.in);
                
        System.out.println("Pagina Inicial");
        System.out.println("Selecione uma opcao");
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Consultar Carros");
        System.out.println("3 - Fazer Pedido"); 
        System.out.println("4 - Sair");
        int opcao = ler.nextInt();
        
        switch (opcao){
            
            case 1:
            break;
            
            case 2:
            break;
            
            case 3:
            break;
            
            case 4:
            break;
            
            default:
                System.out.println("Opcao inválida!");
        }
        }
                
        
}