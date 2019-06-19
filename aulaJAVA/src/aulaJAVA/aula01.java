package aulaJAVA;

public class aula01 {

	public static void main(String[] args) {
	
		/* estudando os ifs e elses  e uma condição booleana que retorna true ou false*/
		int idade = 19;
		boolean amigoDono = true;
		
		if (idade > 18) {
			System.out.println("maior de idade");
			
		} else {
			System.out.println("menor de idade");

		}
		 /* uso do || pressão de OU */
		if (idade > 18 || amigoDono) {
			System.out.println("pode entrar");
			
		} else {
			System.out.println("proibido entrada");

		}
		
		

	}

}
