package orientacaoObjeto;

public class testeOrientado {

	public static void main(String[] args) {
		Conta minhaconta = new Conta();
		Cliente cli = new Cliente();
		
		minhaconta.titular = cli;
		
		minhaconta.titular.nome = "dann";

	}

}
