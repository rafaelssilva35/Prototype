package carro;

public abstract class CarroPrototype implements Cloneable {

	private String cor;
	
	//public abstract void criarModelo();
	
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clone;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
}
