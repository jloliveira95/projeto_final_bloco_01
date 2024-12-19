package contatos.model;

public abstract class Contatos {
    private int tipo;
    private String nome;
    private String telefone;
    private String email;
    public Contatos(int tipo, String nome, String telefone, String email) {
        this.tipo = tipo;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public String getNome() {
        return nome;
    }
    public void setName(String name) {
        this.nome = name;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void visualizar() {

		String tipo = "";
		
		switch(this.tipo) {
			case 1:
				tipo = "Contato Pessoal";
				break;
			case 2:
				tipo = "Contato Profissional";
				break;
			}
		
		
	        String tipoContato = (this.tipo == 1) ? "Contato Pessoal" : "Contato Profissional";
		
		System.out.println("\n\n**************");
		System.out.println("Dados do Contato:");
		System.out.println("******************");
		System.out.println("Nome: " + this.nome);
		System.out.println("Numero: " + this.telefone);
		System.out.println("Contato: " + tipo);
		System.out.println("Email: " + this.email);
		
    	}
	}