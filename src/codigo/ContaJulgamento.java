package codigo;

public class ContaJulgamento {
	
	public static int contagem(String resposta, int julgamento) {
		
		
		if(resposta.equalsIgnoreCase("sim")) {
			
			julgamento += 1;
		}
		return julgamento;
		
		
	}

}
