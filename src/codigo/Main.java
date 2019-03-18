package codigo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<String> listaPerguntas = new ArrayList<String>();
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		listaPerguntas.add(Perguntas.pergunta1);
		listaPerguntas.add(Perguntas.pergunta3);
		listaPerguntas.add(Perguntas.pergunta2);
		int julgamento = 0;
		
		Iterator<String> i = listaPerguntas.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
			String resposta = ler.nextLine();
			julgamento = ContaJulgamento.contagem(resposta, julgamento);
		}
		
		String veredito = Juiz.JulgaPessoa(julgamento);
		Resposta.daRespsota(veredito);
	}
}
