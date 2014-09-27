package com.rp.iterator.exercicio;

import java.util.Iterator;

public class Sistema {
	public static void main(String[] args) {
		ConjuntoCanais set = new ConjuntoCanais();
		Canal globo = new Canal(7,"Globo");
		Canal sbt = new Canal(4,"SBT");
		set.adicionaCanal(globo);
		set.adicionaCanal(sbt);
		
		for (Iterator<Canal> it = set.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
	}
}
