package principal;

import carro.CarroCache;
import carro.CarroPrototype;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarroCache.loadCache();
		
		CarroPrototype carroClonado = (CarroPrototype) CarroCache.getCarro("Fusca");
		System.out.println(carroClonado);
	}

}
