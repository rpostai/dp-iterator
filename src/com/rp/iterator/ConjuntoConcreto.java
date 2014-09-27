package com.rp.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ConjuntoConcreto<T> implements Conjunto<T> {

	private List<T> list = new ArrayList<T>();

	@Override
	public void adiciona(T obj) {
		list.add(obj);
	}

	@Override
	public Iterator<T> iterator() {
		return new ConcreteIterator<T>();
	}

	private class ConcreteIterator<T> implements Iterator<T> {
		private int index = 0;

		@Override
		public T proximo() {
			if (temProximo()) {
				return (T) ConjuntoConcreto.this.list.get(index++);
			}
			throw new NoSuchElementException(
					"Não existe mais elementos na lista");
		}

		@Override
		public boolean temProximo() {
			return index < ConjuntoConcreto.this.list.size();
		}
	}

}
