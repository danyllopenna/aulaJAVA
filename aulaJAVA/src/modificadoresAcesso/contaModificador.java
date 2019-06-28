package modificadoresAcesso;


public class contaModificador {
	Cliente nomeTitular;
	String agencia;
	 DataModificador aberturaConta;
	 int numero;
	private double saldo;
	
	
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void sacar(double valor) {
		if (valor>saldo) {
		System.out.println("saldo não disponivel");
			
		} else {
			saldo = saldo - valor;
			System.out.println("você sacou:"+valor+"seu novo saldo e: "+saldo);

		}
		
	}	
	public void depositar(double valor) {
		saldo = saldo+valor;
		System.out.println("deposito realizado com sucesso");
		
		
	}
	public double rendimento() {
		double ren = saldo*0.1;
		saldo = ren+saldo;
		
		
		return ren;
		
	}
	String recuperarDadosImpressao() {
		String dados = "titular:"+this.nomeTitular;
		dados +="\nNumero:"+this.numero;
		dados+="\nAgencia:"+this.agencia;
		dados+="\nRendimento:"+rendimento();
		dados+="\nSaldo Atual : "+this.saldo;
		dados+="\ndata abertura:"+aberturaConta.dataFormatada();
		
		
		return dados;
	}


}
