package orientacaoObjeto;

public class Programa {

	public static void main(String[] args) {
		
		Conta minhaConta;
		
		minhaConta = new Conta();
		
		minhaConta.titular = "dann";
		minhaConta.saldo = 1000.0;
		
		System.out.println("saldo atual : "+minhaConta.saldo);
		
		//sacar 200 reais
		
		if ( minhaConta.sacar(1001)) {
			System.out.println("saque realizado com sucesso");
			
		} else {
			System.out.println("saldo indisponivel");

		}
	
		
		//depositar 500.20 reais
		minhaConta.depositar(500.20);
		System.out.println("saldo atual : "+minhaConta.saldo);

	}

}
