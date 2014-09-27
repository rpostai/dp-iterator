package com.rp.iterator.exercicio;

public class Canal {
	private final int numero;
	private final String nome;

	public Canal(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Canal [numero=" + numero + ", nome=" + nome + "]";
	}

}
