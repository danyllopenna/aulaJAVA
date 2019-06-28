package modificadoresAcesso;



public class testeModificador {

	public static void main(String[] args) {
		contaModificador c1 = new contaModificador();
		DataModificador data = new DataModificador();
		Cliente cliente = new Cliente();
		c1.nomeTitular = cliente;
		c1.aberturaConta = data;
		c1.aberturaConta.dia = 25;
		c1.aberturaConta.mes = 10;
		c1.aberturaConta.ano = 2015;
		c1.agencia = "012";	
	//	c1.nomeTitular.nome = "pedro";
		c1.numero = 001;
		c1.depositar(100);
		c1.sacar(10);
		
		//c1.saldo = 2000; o valor nao pode mais ser acessado direto devido o modificador private
		System.out.println(c1.recuperarDadosImpressao());
	
		System.out.println(c1.getSaldo());
		

		
	}

}
