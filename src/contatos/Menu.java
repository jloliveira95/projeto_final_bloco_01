package contatos;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Menu {
	
	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
        int opcao = 0;
		while (true) {
            try {
                System.out.println("****************************");
                System.out.println("        MEUS CONTATOS       ");
                System.out.println("****************************");
                System.out.println("     1 - Criar Contato");
                System.out.println("     2 - Listar Contatos");
                System.out.println("     3 - Deletar Contato");
                System.out.println("     4 - Atualizar Contato");
                System.out.println("     5 - Sair");
                System.out.println("****************************");
                System.out.print("Digite a opção desejada: ");
                opcao = leia.nextInt();
			    System.out.println("\n****************************");
                
                if(opcao == 5) {
                    System.out.println("Armazene seus contatosDe forma inteligente! Saindo...");
                    leia.close();
                    System.exit(0);
                    break;
                }

                switch(opcao) {
                    case 1:
                        System.out.println("\nCriar Contato\n");
                        
                        break;
                    
                    case 2:
                        System.out.println("\nListar Contatos\n");
                        
                        break;
                        
                    case 3:
                        System.out.println("\nDeletar Contato\n");
                        
                        break;
                        
                    case 4:
                        System.out.println("\nAtualizar Contato\n");
                        
                        break;
                        
                    default:
                        System.out.println("\nOpção inválida!\n");

                        break;
                        
                }
            } catch (InputMismatchException e) {
				System.out.println("Digite Valores Inteiros");
				leia.nextLine(); // Limpa o buffer
            }

		}
	}
}
