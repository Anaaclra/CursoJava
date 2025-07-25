package guanabara;

import java.util.Date;

public class HoraDoSistema {

	public static void main(String[] args) {
	Date relogio = new Date(); //new a gente cria um novo objeto
	System.out.println("A hora do sistema é");//Mensagem que eu quero que saia no terminal. 
	System.out.println(relogio.toString());//printa a hora do sistema e .toString converte o objeto data para uma string
	}

}
