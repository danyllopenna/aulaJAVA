package modificadoresAcesso;

public class Cliente {
	private String nome,endereco,cpf,idade;
	
	public void mudaCPF(String cpf) {
		validaCPF(cpf);
		this.cpf = cpf;
		
	}
	private void validaCPF(String cpf) {
		
	}

}
