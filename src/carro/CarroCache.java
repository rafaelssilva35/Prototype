package carro;

import java.util.Hashtable;

public class CarroCache {
	
	public static Hashtable<String, CarroPrototype> carroCache = new Hashtable<String, CarroPrototype>();
	
	public static CarroPrototype getCarro(String carroId) {
		CarroPrototype carro = carroCache.get(carroId);
		return carro;
	}
	
	public static void loadCache() {
		Fusca fusca = new Fusca();
		fusca.setTipo("Fusca");
		carroCache.put(fusca.getTipo(), fusca);
	}

}
