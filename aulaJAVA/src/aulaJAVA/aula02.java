package aulaJAVA;

public class aula02 {

	public static void main(String[] args) {
		// aula de laços de repetição começamdo com while
		
		int idade = 1;
		while (idade <= 18) {
			System.out.println(idade);
			idade = idade + 1;
			
		}
		
		// for laço similar a o while com uma leitura mais simples
		
		for (int i = 0; i < 10 ; i++) {
			
			System.out.println(i);
		}
		
		// controlando loops
		int x = 0;
		int y = 30;
		
		for (int i = x; i < y ; i++) {
			if (i % 19 == 0 ) {
				System.out.println("achei um numero divisivel por 19 "+ i);
				break;
				
				
			} else {

			}
			
		}

	}

}
