package empresa;

import java.util.Scanner;

public class Jogador {
	protected Scanner teclado;
	protected PosicaoMarcada marca;
	
	// O Constructor inicia o scanner no teclado e define o X como sendo a marca do
	// jogador humano
	
	Jogador() {
		teclado = new Scanner(System.in);
		marca = new PosicaoMarcada(0, 0, 1);

	}

	// mostra posições +  efetua a jogada no tabuleiro
	public void joga(Tabuleiro t) {
		Boolean jogou = false;

		do {
			System.out.println("Digite uma proxima jogada (EX: 1 1): ");
			marca.setX(teclado.nextInt() - 1);
			marca.setY(teclado.nextInt() - 1);

			if (t.getPosicao(marca.getX(), marca.getY()) == 0) {
				t.preenchePosicao(marca); 
				jogou = true; 
			}
		} while (jogou == false); 
	}

	public PosicaoMarcada getMarca() {
		return marca;
	}

	public void setMarca(PosicaoMarcada marca) {
		this.marca = marca;
	}

}