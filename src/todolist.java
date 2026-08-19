
import java.util.Scanner;


public class todolist {




/**
 *
 * @author Aluno
 */
public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] tarefas = new String[10];
        boolean[] concluidas = new boolean[10];
        
        int opcao = 0;
        
        while(opcao != 5) {
        System.out.println("=====LISTA DE TAREFAS======");
         System.out.println("1 - adicionar tarefa");
         System.out.println("2 - Listar tarefas");
         System.out.println("3 - concluir tarefas");
         System.out.println("4 - excluir tarefa");
         System.out.println("5 - excluir");
         
         System.out.println("escolha uma opcao:");
         opcao = scanner.nextInt();
         scanner.nextLine();
         
         switch (opcao) {
             case 1:
                 int posicaoLivre = -1;
                 
                 for(int i = 0; i < tarefas.length; i++){
                     if (tarefas[i] == null){
                         posicaoLivre = i;
                         break;
                     }
                 }
                 
                 if(posicaoLivre == -1){
                     System.out.println("A Lista de tarefas está cheia!");
                 }else{
                     System.out.println("Digite a tarefa:");
                     tarefas[posicaoLivre] = scanner.nextLine();
                     concluidas[posicaoLivre] = false;
                     System.out.println("Tarefa adicionada com sucesso");
                     
                 }
                 
                 break;
                         
             case 2:
                 System.out.println("=====MINHAS TAREFAS=====");
                 
                 boolean existeTarefa = false; 
                 
                 for(int i = 0; i < tarefas.length; i++){
                    if (tarefas[i] != null){
                        existeTarefa = true;
                        
                      if(concluidas[i] == true)
                         System.out.println(("i + 1") + "= [x]" + tarefas [i]);
                    }else {
                        System.out.println(("i + 1") + " - [ ]" + tarefas[i]);
                        
                       if (existeTarefa == false){
                           System.out.println("nenhuma tarefa cadastrada! ");
                       
                       }
                       break;
                       
                    case 3:
                    System.out.println("digite o numero da tarefa que deseja concluir");
                    int numeroConcluir = scanner.nextInt();
                    
                    int indiceConcluir = numeroConcluir - 1;
                    
                    if (indiceConcluir >= 0
                    && indiceConcluir < tarefas.length &&
                    tarefas [indiceConcluir] != null){
                    
                    concluidas[indiceConcluir]= true;
                    
                    System.out.println("tarefa concluida com sucesso");
                    }else{
                   System.out.println("tarefa invalida");
                    }   
                 } 
                 }    
         }
        
    }
    }
    
}   
}
