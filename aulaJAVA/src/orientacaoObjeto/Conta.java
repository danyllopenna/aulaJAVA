package orientacaoObjeto;

public class Conta {
	
	// declaração de atributos
	int numero;
	Cliente titular = new Cliente(); //toda vez que chamar um new conta tera um novo cliente
	double saldo;
	double salario;
	

	public boolean sacar(double quantidade) {
		// metod sem void retornar os valores true e false por ser uma expressção booleana
		// o uso do this para mostrar que e um atributo não uma simples variavel
		if (saldo < quantidade) {
			return false;
			
		} else {
			double novoSaldo = this.saldo - quantidade;
			this.saldo = novoSaldo;
			return true;

		}
		
		
	}
	
	public void depositar(double quantidade) {
		// vamos usar a expressão "+=" que soma a quantidade ao valor antigo do saldo
		this.saldo += quantidade;
		
	}
	
	public void transferir(Conta destino,double valor) {
		this.saldo = this.saldo - valor;
		destino.saldo = destino.saldo + valor;
		
	
		
	}
	//outra forma de se fazer transferencia
	public void transfere(Conta destino, double valor) {
		boolean retirar = sacar(valor);
		if (retirar == false) {
			System.out.println("nao tem saldo pra saque");
			
		} else {
			destino.depositar(valor);
		}
	}
	
}

