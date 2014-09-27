package com.rp.iterator.exercicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConjuntoCanais implements Iterable<Canal> {

	public List<Canal> canais = new ArrayList<Canal>();

	public void adicionaCanal(Canal canal) {
		canais.add(canal);
	}

	@Override
	public Iterator<Canal> iterator() {
		return new ConjuntoCanaisIterator<Canal>();
	}

	private class ConjuntoCanaisIterator<Canal> implements
			Iterator<Canal> {

		private int index = 0;

		@Override
		public boolean hasNext() {
			return index < ConjuntoCanais.this.canais.size();
		}

		@Override
		public Canal next() {
			if (hasNext()) {
				return (Canal) ConjuntoCanais.this.canais.get(index++);
			}
			throw new UnsupportedOperationException();
		}

		@Override
		public void remove() {
			ConjuntoCanais.this.canais.remove(index);
		}
	}

}
