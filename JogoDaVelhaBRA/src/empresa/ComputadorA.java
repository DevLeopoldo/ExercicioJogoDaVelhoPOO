package empresa;

//nivel 01
public class ComputadorA implements Computador {
	protected PosicaoMarcada marca;

	public ComputadorA() {
		super();
		marca = new PosicaoMarcada(0, 0, 2);
	}

	public void joga(Tabuleiro t) {

		Boolean jogou = false; // garante apenas 1 jogada
		
		// nivel facil, escolhe o primeiro espaço em branco disponivel
		
		for (int i = 0; i < 3; i++)
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

