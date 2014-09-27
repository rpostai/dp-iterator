package com.rp.iterator;

public class Sistema {

	public static void main(String[] args) {
		Conjunto<String> set = new ConjuntoConcreto<String>();
		set.adiciona("Rodrigo");
		set.adiciona("Fernanda");
		set.adiciona("Eduardo");
		
		Iterator<String> it = set.iterator();
		while (it.temProximo()) {
			System.out.println(it.proximo());
		}
				
	}
}
