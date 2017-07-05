package com.mkyong.stock.model;

import java.math.BigDecimal;

public class CompteEpargne extends Compte{

	protected BigDecimal taux;

	public BigDecimal getTaux() {
		return taux;
	}

	public void setTaux(BigDecimal taux) {
		this.taux = taux;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + "@" + System.identityHashCode(this) + " \n" + super.toString() +  " ==> CompteEpargne [taux=" + taux + "]";
	}
	
}
