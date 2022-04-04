package empresa;

public class ComputadorC implements Computador {
	protected PosicaoMarcada marca;

	public ComputadorC() {
		super();
		marca = new PosicaoMarcada(0, 0, 2);
	}

	// Verifica as colunas e diagonais caso tenha 02 marcações já feitas, o computadorC joga para ganhar o jogo completando as três.
	
	// Caso contrario ele joga como o computadorA
	public void joga(Tabuleiro t) {
		Boolean jogou = false; // garanter apenas 1 jogada

		
		if ((t.getPosicao(0, 0) == 2 && t.getPosicao(1, 0) == 2) && t.getPosicao(2, 0) == 0) { // coluna 0
			marca.x = 2;
			marca.y = 0;
			t.preenchePosicao(marca);
			jogou = true;
		} else if ((t.getPosicao(0, 0) == 2 && t.getPosicao(2, 0) == 2) && t.getPosicao(1, 0) == 0) {// coluna 0
			marca.x = 1;
			marca.y = 0;
			t.preenchePosicao(marca);
			jogou = true;
		} else if ((t.getPosicao(1, 1) == 2 && t.getPosicao(2, 1) == 2) && t.getPosicao(0, 1) == 0) {// coluna 0
			marca.x = 0;
			marca.y = 1;
			t.preenchePosicao(marca);
			jogou = true;
		}
		if ((t.getPosicao(0, 1) == 2 && t.getPosicao(1, 1) == 2) && t.getPosicao(2, 1) == 0) { // coluna 1
			marca.x = 2;
			marca.y = 1;
			t.preenchePosicao(marca);
			jogou = true;
		} else if ((t.getPosicao(0, 1) == 2 && t.getPosicao(2, 1) == 2) && t.getPosicao(1, 1) == 0) {// coluna 1
			marca.x = 1;
			marca.y = 1;
			t.preenchePosicao(marca);
			jogou = true;
		} else if ((t.getPosicao(1, 0) == 2 && t.getPosicao(2, 0) == 2) && t.getPosicao(0, 1) == 0) {// coluna 1
			marca.x = 0;
			marca.y = 1;
			t.preenchePosicao(marca);
			jogou = true;
		}
		if ((t.getPosicao(0, 2) == 2 && t.getPosicao(1, 2) == 2) && t.getPosicao(2, 2) == 0) { // coluna 2
			marca.x = 2;
			marca.y = 2;
			t.preenchePosicao(marca);
			jogou = true;
		} else if ((t.getPosicao(0, 2) == 2 && t.getPosicao(2, 2) == 2) && t.getPosicao(1, 2) == 0) {// coluna 2
			marca.x = 1;
			marca.y = 2;
			t.preenchePosicao(marca);
			jogou = true;
		} else if ((t.getPosicao(1, 2) == 2 && t.getPosicao(2, 2) == 2) && t.getPosicao(0, 2) == 0) {// coluna 2
			marca.x = 0;
			marca.y = 2;
			t.preenchePosicao(marca);
			jogou = true;
		}
		if ((t.getPosicao(0, 0) == 2 && t.getPosicao(1, 1) == 2) && t.getPosicao(2, 2) == 0) { // Diagonal principal
			marca.x = 2;
			marca.y = 2;
			t.preenchePosicao(marca);
			jogou = true;
		} else if ((t.getPosicao(0, 0) == 2 && t.getPosicao(2, 2) == 2) && t.getPosicao(1, 1) == 0) {// Diagonal principal
			marca.x = 1;
			marca.y = 1;
			t.preenchePosicao(marca);
			jogou = true;
		} else if ((t.getPosicao(1, 1) == 2 && t.getPosicao(2, 2) == 2) && t.getPosicao(0, 0) == 0) {// Diagonal principal
			marca.x = 0;
			marca.y = 0;
			t.preenchePosicao(marca);
			jogou = true;
		}
		if ((t.getPosicao(0, 2) == 2 && t.getPosicao(1, 1) == 2) && t.getPosicao(2, 0) == 0) { // Diagonal paralela
			marca.x = 2;
			marca.y = 0;
			t.preenchePosicao(marca);
			jogou = true;
		} else if ((t.getPosicao(0, 2) == 2 && t.getPosicao(2, 0) == 2) && t.getPosicao(1, 1) == 0) {// Diagonal paralela
			marca.x = 1;
			marca.y = 1;
			t.preenchePosicao(marca);
			jogou = true;
		} else if ((t.getPosicao(1, 1) == 2 && t.getPosicao(2, 0) == 2) && t.getPosicao(0, 2) == 0) {// Diagonal paralela
			marca.x = 0;
			marca.y = 2;
			t.preenchePosicao(marca);
			jogou = true;
		} else {
			for (int i = 0; i < 3; i++)
				// Caso nao tenha uma jogada entra no loop 
			if (jogou == false)
			for (int j = 0; j < 3; j++)
			if (t.getPosicao(i, j) == 0) {
					marca.x = i;
					marca.y = j;
					t.preenchePosicao(marca);
					jogou = true;
					break;
						}
		}

	}

}