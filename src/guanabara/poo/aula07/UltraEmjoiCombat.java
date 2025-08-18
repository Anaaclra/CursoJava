package guanabara.poo.aula07;

public class UltraEmjoiCombat {
	public static void main(String[] args) {
		
		Lutador L[] = new Lutador[11];
		
		L[0] = new Lutador("Pretty boy" , "França", 31, 1.75, 68.9f, 11, 2, 1);
		L[1] = new Lutador("Bruxinha" , "Brasil", 28, 1.90, 120.1f, 8, 1, 1);
		L[2] = new Lutador("Cavalo" , "Colombia", 46, 1.66, 90.8f, 10, 9, 2);
		L[3] = new Lutador("Fada" , "Polonia", 34, 1.78, 70.9f, 21, 8, 2);
		L[4] = new Lutador("Chorona" , "Brasil", 56, 1.55, 67.9f, 6, 2, 1);
		L[5] = new Lutador("Touro", "México", 29, 1.82, 102.3f, 15, 3, 0); 
		L[6] = new Lutador("Sombra", "EUA", 24, 1.70, 65.4f, 12, 4, 2);    
		L[7] = new Lutador("Martelo", "Rússia", 37, 1.85, 88.7f, 20, 5, 1); 
		L[8] = new Lutador("Pantera", "Japão", 26, 1.74, 69.2f, 18, 6, 0);  
		L[9] = new Lutador("Gladiador", "Itália", 31, 1.90, 110.5f, 22, 2, 3); 
		L[10] = new Lutador("Furacão", "Argentina", 33, 1.78, 80.0f, 14, 7, 1); 
		
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(L[9], L[1]);
		UEC01.lutar();
	}
}
