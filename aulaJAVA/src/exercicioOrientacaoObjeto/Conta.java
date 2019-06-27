package exercicioOrientacaoObjeto;

public class Conta {
	/*1. Modele uma conta. A ideia aqui � apenas modelar, isto �, s� identifique que informa��es s�o
	importantes. Desenhe no papel tudo o que uma Conta tem e tudo o que ela faz. Ela deve ter o nome
	do titular ( String ), o n�mero ( int ), a ag�ncia ( String ), o saldo ( double ) e uma data de
	abertura ( String ). Al�m disso, ela deve fazer as seguintes a��es: saca, para retirar um valor do
	saldo; deposita, para adicionar um valor ao saldo; calculaRendimento, para devolver o rendimento
	mensal dessa conta.
	2. Transforme o modelo acima em uma classe Java. Teste-a, usando uma outra classe que tenha o
	main . Voc� deve criar a classe da conta com o nome Conta , mas pode nomear como quiser a
	classe de testes, contudo, ela deve possuir o m�todo main .
	A classe Conta deve conter pelo menos os seguintes m�todos:
	saca que recebe um valor como par�metro e retira esse valor do saldo da conta
	deposita que recebe um valor como par�metro e adiciona esse valor ao saldo da conta
	calculaRendimento que n�o recebe par�metro algum e devolve o valor do saldo multiplicado
	por 0.1 */
	
	
	String nomeTitular,agencia;
	Data dataAbertura;
	int numero;
	double saldo;
	
	public void sacar(double valor) {
		if (valor>saldo) {
		System.out.println("saldo n�o disponivel");
			
		} else {
			saldo = saldo - valor;
			System.out.println("voc� sacou:"+valor+"seu novo saldo e: "+saldo);

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

