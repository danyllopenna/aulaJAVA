package exercicioOrientacaoObjeto;

public class testeExercicio {

	public static void main(String[] args) {
	
		Conta c1 = new Conta();
		Data data = new Data();
		c1.dataAbertura =data;
		c1.dataAbertura.dia = 25;
		c1.dataAbertura.mes = 10;
		c1.dataAbertura.ano = 2015;
		c1.agencia = "012";	
		c1.nomeTitular = "pedro";
		c1.numero = 001;
		c1.depositar(100);
		c1.sacar(10);
	
		
		System.out.println(c1.recuperarDadosImpressao());

	}

}
