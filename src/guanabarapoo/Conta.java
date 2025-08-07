package guanabarapoo;

public class Conta {
	
		//atributos
		public int numConta;
		protected String tipo;
		private String dono;
		private double saldo;
		private boolean status;
		
		//construtores
		public Conta() {
			this.numConta = numConta; 
			this.tipo = tipo;
			this.dono = dono;
			this.saldo = 0.0;
			this.status = false;
		
		//encapsulamento ou metodos especiais
		}

		public int getNumConta() {
			return numConta;
		}

		public void setNumConta(int numConta) {
			this.numConta = numConta;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public String getDono() {
			return dono;
		}

		public void setDono(String dono) {
			this.dono = dono;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public boolean getStatus() {
			return status;
		}

		public void setStatus(boolean status) {
			this.status = status;
		}
	
		//métodos
		public void abrirConta(String tipo) {
			setTipo(tipo);
			setStatus(true);
			if(tipo.equals("CC")) {
				this.setSaldo(50.0);
			} else if (tipo.equals("CP")) {
				this.setSaldo(150.0);
			}
		}
		
		public void fecharConta() {
			if(this.getSaldo() > 0.0) {
				System.out.println("Conta com dinheiro");
			}else if (this.getSaldo() < 0.0) {
				System.out.println("Conta em débito");
			}else {
				this.setStatus(false);
				System.out.println("Conta encerrada com sucesso.");
			}
		}
		public void depositar(double valor) {
			if(this.getStatus()) {
				this.saldo += valor;
				this.setSaldo(this.getSaldo() + valor);
				System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
			} else {
				System.out.println("Impossível depositar em uma conta fechada!");
			}
		}
		public void sacar(double valor) {
			if (this.getStatus()) {
				if (this.getSaldo() >= valor) {
					this.setSaldo(this.getSaldo() - valor);
					System.out.println("Saque realizado na conta de " + this.getDono());
				} else {
					System.out.println("Saldo insuficiente para saque.");
				}
			} else {
				System.out.println("Impossível sacar de uma conta fechada.");
			}
		}
		
		public void pagarMensal() {
			int valor = 0;
			if (this.getTipo().equals("CC")) {
				valor = 12;
			} else if (this.getTipo().equals("CP")) {
				valor = 20;
			}
			if (this.getStatus()){
				this.setSaldo(this.getSaldo() - valor);
					System.out.println("Mensalidade paga com sucesso por: " + this.getDono());
				} else {
					System.out.println("Imposível pagar uma conta fechada.");
				}
			
		} 
		
		//metodos personalidados
		public void estadoAtual() {
			System.out.println("----------------------------");
			System.out.println("Conta: " + this.getNumConta());
			System.out.println("Tipo: " + this.getTipo());
			System.out.println("Dono: " + this.getDono());
			System.out.println("Saldo: " + this.getSaldo());
			System.out.println("Status: " + this.getStatus());
			}
		
	

}
