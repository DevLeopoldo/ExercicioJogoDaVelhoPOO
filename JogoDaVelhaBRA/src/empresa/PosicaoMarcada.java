package empresa;

//abstracao de marcaçao
public class PosicaoMarcada {
	int x;
	int y; 
	int marca; 
	
	//realiza a marcação na posição indicada
	public PosicaoMarcada(int x, int y, int marca) {
		super();
		this.x = x;
		this.y = y;
		this.marca = marca;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getMarca() {
		return marca;
	}

	public void setMarca(int marca) {
		this.marca = marca;
	}

}
