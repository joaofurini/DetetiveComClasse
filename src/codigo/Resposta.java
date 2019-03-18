package codigo;

public class Resposta {
	public static void daRespsota(String veredito) {
		
		if(veredito.contentEquals("Inocente")) {
			System.out.println("Parabens");
			System.out.println("Você é: "+ veredito);
		}
		else if(veredito.contentEquals("Assassino")) {
			System.out.println("Mãos na parede");
			System.out.println("Você é: "+ veredito);
			
		}
		else if(veredito.contentEquals("Cumplice")) {
			System.out.println("Pode ir entregando o jogo");
			System.out.println("Você é: "+ veredito);
		}
		
		
		;
		
	}

}
