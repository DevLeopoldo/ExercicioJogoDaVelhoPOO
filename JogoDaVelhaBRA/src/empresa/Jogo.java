package empresa;

import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro();
		Jogador jogador = new Jogador();

		Scanner teclado = new Scanner(System.in);
		System.out.println("Jogo da Velha");
		System.out.println("Escolha a Dificuldade entre 1-3: ");
		int dificuldade = teclado.nextInt();

		// Cria os computadores
		Computador computador = null;
		ComputadorA compA = new ComputadorA();
		ComputadorB compB = new ComputadorB();
		ComputadorC compC = new ComputadorC();

		// Define computado e nivel de dificuldade
		if (dificuldade == 1)
			computador = compA;
		else if (dificuldade == 2)
			computador = compB;
		else if (dificuldade == 3)
			computador = compC;

		// Loop principal do jogo
		while (tabuleiro.situacao() == 0) {
			
			tabuleiro.imprime();

			jogador.joga(tabuleiro);

			// Só joga após verificar se não houve ganhadores
			if (tabuleiro.ConfereSituacao() == 0)
				computador.joga(tabuleiro);
		}
	}

}
