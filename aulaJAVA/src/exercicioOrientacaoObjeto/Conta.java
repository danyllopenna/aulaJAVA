package exercicioOrientacaoObjeto;

public class Conta {
	/*1. Modele uma conta. A ideia aqui é apenas modelar, isto é, só identifique que informações são
	importantes. Desenhe no papel tudo o que uma Conta tem e tudo o que ela faz. Ela deve ter o nome
	do titular ( String ), o número ( int ), a agência ( String ), o saldo ( double ) e uma data de
	abertura ( String ). Além disso, ela deve fazer as seguintes ações: saca, para retirar um valor do
	saldo; deposita, para adicionar um valor ao saldo; calculaRendimento, para devolver o rendimento
	mensal dessa conta.
	2. Transforme o modelo acima em uma classe Java. Teste-a, usando uma outra classe que tenha o
	main . Você deve criar a classe da conta com o nome Conta , mas pode nomear como quiser a
	classe de testes, contudo, ela deve possuir o método main .
	A classe Conta deve conter pelo menos os seguintes métodos:
	saca que recebe um valor como parâmetro e retira esse valor do saldo da conta
	deposita que recebe um valor como parâmetro e adiciona esse valor ao saldo da conta
	calculaRendimento que não recebe parâmetro algum e devolve o valor do saldo multiplicado
	por 0.1 */
	
	
	String nomeTitular,agencia;
	Data dataAbertura;
	int numero;
	double saldo;
	
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
		dados+="\ndata abertura:"+this.dataAbertura.dataFormatada();
		
		
		return dados;
	}

}

