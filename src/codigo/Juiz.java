package codigo;

public class Juiz {
public static String JulgaPessoa(int julgamento) {
	String veredito = null;

	if (julgamento == 1) {
		veredito = "Inocente";
	}
	else if (julgamento == 2) {
		veredito = "Cumplice";
	}
	else if(julgamento == 3) {
		veredito = "Assassino";
	}
	else {
		veredito = "Inocente";
	}
	
	return veredito;
	
}


}
