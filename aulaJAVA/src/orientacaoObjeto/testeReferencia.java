package orientacaoObjeto;

public class testeReferencia {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		// conta c1 adicionando atributos
		c1.numero = 001;
		//c1.titular = "dann";
		c1.saldo = 1000.50;
		
		// conta c2 adicionando atributos
		c2.numero = 002;
	//	c2.titular = "carol";
		c2.saldo = 1000.50;
		
		c1.transfere(c2, 1500);
		
		System.out.println(c1.saldo);
		System.out.println(c2.saldo);
		
		

		Conta minhaConta = new Conta();
		Cliente c = new Cliente();
		
		minhaConta.titular = c;
	}

}
