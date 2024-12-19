package contatos.model;

public class ContatoPessoal extends Contatos {
	
	private String apelido;
		
	

	public ContatoPessoal(int tipo, String nome, String telefone, String email, String apelido) {
		super(tipo, nome, telefone, email);
		this.apelido = apelido;
		// TODO Auto-generated constructor stub
	}



	public String getApelido() {
		return apelido;
	}



	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	
	public void informarApelido() {
		System.out.println("Conhecido como: " + apelido);
	}

}
