package guanabara;

import java.util.Locale;

public class IdiomaSistema {

	public static void main(String[] args) {
//	Locale linguagem = new Locale("pt", "BR");
		Locale linguagem = Locale.getDefault();
	System.out.println("Idioma: " + linguagem.getDisplayLanguage());
	}

}
