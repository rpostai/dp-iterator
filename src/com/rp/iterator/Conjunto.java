package com.rp.iterator;

public interface Conjunto<T> {
	
	public void adiciona(T obj);
	
	public Iterator<T> iterator();
}
