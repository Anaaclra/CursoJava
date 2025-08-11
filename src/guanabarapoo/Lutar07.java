package guanabarapoo;

import java.util.Random;

public class Lutar07 {
	
	//atributos
	private Lutador07 desafiado;
	private Lutador07 desafiante;
	private int rounds;
	private boolean aprovada;
	
	//construtores
	public Lutar07() {
		this.desafiado = desafiado;
		this.desafiante = desafiante;
		this.rounds = rounds;
		this.aprovada = aprovada;
	}
		
	
	//métodos especiais
	public Lutador07 getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador07 desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador07 getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador07 desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean getAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}



	//métodos
	public void marcarLuta(Lutador07 L1, Lutador07 L2) {
		if(L1.getCategoria().equals(L2.getCategoria()) && L1 != L2) {	
			this.aprovada = true;
			this.desafiado = L1;
			this.desafiante = L2;
		}else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	
	public void lutar() {
		if(this.aprovada) {
			System.out.println("###DESAFIADO###");
			desafiado.apresentar();
			System.out.println("###DESAFIANTE###");
			desafiante.apresentar();
		
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			switch(vencedor) {
			case 0: //empate
				System.out.println("Empatou!");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1: //Desafio vence
				System.out.println("Desafiado Ganhou!");
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2: //Desafiante vence
				System.out.println("Desafiante Ganhou");
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
				break;
				}
			}else {
				System.out.println("A Luta não pode acontecer.");
			}
		} 
	
}
	
