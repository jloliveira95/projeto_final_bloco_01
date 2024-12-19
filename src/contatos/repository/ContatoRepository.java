package contatos.repository;

import contatos.model.Contatos;

public interface ContatoRepository {

    void criarContato(Contatos contato);
   
    void listarContatos();
   
    void deletarContato(int indice);

    void atualizarContato(int indice, Contatos contato);
}