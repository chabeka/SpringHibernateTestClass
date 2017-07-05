package com.mkyong.stock.model;

public class CompteCourant extends Compte{
	protected int decouvert;

	public int getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(int decouvert) {
		this.decouvert = decouvert;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + "@" + System.identityHashCode(this) +  super.toString() + " ==> CompteCourant [decouvert=" + decouvert + "]";
	}
	
	
}
