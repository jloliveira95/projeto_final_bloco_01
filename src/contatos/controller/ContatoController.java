package contatos.controller;

import contatos.model.Contatos;
import contatos.repository.ContatoRepository;

import java.util.ArrayList;
import java.util.List;

public class ContatoController implements ContatoRepository {

    private List<Contatos> listaContatos = new ArrayList<>();

    @Override
    public void criarContato(Contatos contato) {
        listaContatos.add(contato);
        System.out.println("Contato criado com sucesso!");
    }

    @Override
    public void listarContatos() {
        if (listaContatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
        } else {
            System.out.println("Lista de Contatos:");
            for (int i = 0; i < listaContatos.size(); i++) {
                System.out.println("Índice: " + i);
                listaContatos.get(i).visualizar();
            }
        }
    }

    @Override
    public void deletarContato(int indice) {
        if (indice >= 0 && indice < listaContatos.size()) {
            Contatos contatoRemovido = listaContatos.remove(indice);
            System.out.println("Contato " + contatoRemovido.getNome() + " removido com sucesso!");
        } else {
            System.out.println("Índice inválido. Nenhum contato foi removido.");
        }
    }

    @Override
    public void atualizarContato(int indice, Contatos contato) {
        if (indice >= 0 && indice < listaContatos.size()) {
            listaContatos.set(indice, contato);
            System.out.println("Contato atualizado com sucesso!");
        } else {
            System.out.println("Índice inválido. Nenhum contato foi atualizado.");
        }
    }
}