package contatos.model;

//ContatoProfissional que herda de Contato
public class ContatoProfissional extends Contatos {

    // Atributo específico de um contato profissional
    private String cargo;

    // Construtor
    public ContatoProfissional(int tipo, String nome, String telefone, String email, String cargo) {
        super(tipo, nome, telefone, email); // Passa o tipo e os demais atributos ao construtor da classe-mãe
        this.cargo = cargo;
    }

    // Getter e Setter
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void informarCargo() {
		System.out.println("Cargo: " + cargo);
    }
}