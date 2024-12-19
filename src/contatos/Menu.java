package contatos;

import contatos.controller.ContatoController;
import contatos.model.ContatoPessoal;
import contatos.model.ContatoProfissional;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static Scanner leia = new Scanner(System.in);
    public static ContatoController contatoController = new ContatoController();

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
                    System.out.println("Armazene seus contatos de forma inteligente! Saindo...");
                    leia.close();
                    System.exit(0);
                }

                switch(opcao) {
                    case 1:
                        System.out.println("\nCriar Contato\n");

                        // Perguntar o tipo de contato
                        System.out.println("Qual tipo de contato você deseja criar?");
                        System.out.println("1 - Pessoal");
                        System.out.println("2 - Profissional");
                        System.out.print("Digite a opção desejada: ");
                        int tipoContato = leia.nextInt();
                        leia.nextLine();  // Limpar o buffer do scanner

                        // Lógica para criar o contato
                        if (tipoContato == 1) {
                            // Criar Contato Pessoal
                            System.out.print("Digite o nome: ");
                            String nomePessoal = leia.nextLine();
                            System.out.print("Digite o telefone: ");
                            String telefonePessoal = leia.nextLine();
                            System.out.print("Digite o e-mail: ");
                            String emailPessoal = leia.nextLine();
                            System.out.print("Digite o apelido: ");
                            String apelidoPessoal = leia.nextLine();

                           // contatoController.criarContatoPessoal(1, nomePessoal, telefonePessoal, emailPessoal, apelidoPessoal);

                        } else if (tipoContato == 2) {
                            // Criar Contato Profissional
                            System.out.print("Digite o nome: ");
                            String nomeProfissional = leia.nextLine();
                            System.out.print("Digite o telefone: ");
                            String telefoneProfissional = leia.nextLine();
                            System.out.print("Digite o e-mail: ");
                            String emailProfissional = leia.nextLine();
                            System.out.print("Digite o cargo: ");
                            String cargoProfissional = leia.nextLine();

                         //   contatoController.criarContatoProfissional(2, nomeProfissional, telefoneProfissional, emailProfissional, cargoProfissional);

                        } else {
                            System.out.println("Opção inválida. Tente novamente.");
                        }
                        break;

                    case 2:
                        System.out.println("\nListar Contatos\n");
                        contatoController.listarContatos();
                        break;

                    case 3:
                        System.out.println("\nDeletar Contato\n");
                        System.out.print("Digite o índice do contato que deseja deletar: ");
                        int indiceDeletar = leia.nextInt();
                        leia.nextLine();  // Limpar o buffer
                        contatoController.deletarContato(indiceDeletar);
                        break;

                    case 4:
                        System.out.println("\nAtualizar Contato\n");
                        System.out.print("Digite o índice do contato que deseja atualizar: ");
                        int indiceAtualizar = leia.nextInt();
                        leia.nextLine();  // Limpar o buffer

                        // Pergunta para o tipo de contato (pessoal ou profissional)
                        System.out.println("Qual tipo de contato você deseja atualizar?");
                        System.out.println("1 - Pessoal");
                        System.out.println("2 - Profissional");
                        System.out.print("Digite a opção desejada: ");
                        int tipoAtualizar = leia.nextInt();
                        leia.nextLine();  // Limpar o buffer

                        if (tipoAtualizar == 1) {
                            // Atualizar Contato Pessoal
                            System.out.print("Digite o novo nome: ");
                            String nomeAtualizadoPessoal = leia.nextLine();
                            System.out.print("Digite o novo telefone: ");
                            String telefoneAtualizadoPessoal = leia.nextLine();
                            System.out.print("Digite o novo e-mail: ");
                            String emailAtualizadoPessoal = leia.nextLine();
                            System.out.print("Digite o novo apelido: ");
                            String apelidoAtualizadoPessoal = leia.nextLine();

                            ContatoPessoal novoContatoPessoal = new ContatoPessoal(1, nomeAtualizadoPessoal, telefoneAtualizadoPessoal, emailAtualizadoPessoal, apelidoAtualizadoPessoal);
                            contatoController.atualizarContato(indiceAtualizar, novoContatoPessoal);

                        } else if (tipoAtualizar == 2) {
                            // Atualizar Contato Profissional
                            System.out.print("Digite o novo nome: ");
                            String nomeAtualizadoProfissional = leia.nextLine();
                            System.out.print("Digite o novo telefone: ");
                            String telefoneAtualizadoProfissional = leia.nextLine();
                            System.out.print("Digite o novo e-mail: ");
                            String emailAtualizadoProfissional = leia.nextLine();
                            System.out.print("Digite o novo cargo: ");
                            String cargoAtualizadoProfissional = leia.nextLine();

                            ContatoProfissional novoContatoProfissional = new ContatoProfissional(2, nomeAtualizadoProfissional, telefoneAtualizadoProfissional, emailAtualizadoProfissional, cargoAtualizadoProfissional);
                            contatoController.atualizarContato(indiceAtualizar, novoContatoProfissional);

                        } else {
                            System.out.println("Opção inválida. Tente novamente.");
                        }
                        break;

                    default:
                        System.out.println("\nOpção inválida! Tente novamente.\n");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite um valor inteiro válido!");
                leia.nextLine(); // Limpa o buffer do scanner
            }
        }
    }
}
