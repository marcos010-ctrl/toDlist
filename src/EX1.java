
import java.util.Scanner;

public class EX1 {
    
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int opcao;
        
        Boolean continuar = true;
        
        while(continuar) {
            System.out.println("\n=== LISTA DE TAREFAS ===");
            System.out.println("1 - adicionar tarefa");
            System.out.println("2 - listar tarefas");
            System.out.println("3 - concluir tarefa)");
            System.out.println("4 - excluir tarefa");
            System.out.println("5 - sair");
            System.out.println("escolha uma opçao: ");

            opcao = scanner.nextInt();
            scanner.nextLine();
            
            if (opcao == 1){
                
            }else if (opcao == 2){ 
            }else if (opcao == 3){
            }else if (opcao == 4) {
            }else if(opcao == 5){
                continuar = false;
            }
            
        }
    }
}
