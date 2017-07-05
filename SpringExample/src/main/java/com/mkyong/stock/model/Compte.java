package com.mkyong.stock.model;

import java.math.BigDecimal;

public class Compte {
	 	protected int        id;
	 	protected String     numero;
	 	protected BigDecimal solde;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNumero() {
			return numero;
		}
		public void setNumero(String numero) {
			this.numero = numero;
		}
		public BigDecimal getSolde() {
			return solde;
		}
		public void setSolde(BigDecimal solde) {
			this.solde = solde;
		}
		@Override
		public String toString() {
			return this.getClass().getName() + "@" + System.identityHashCode(this) + " \n" + "Compte [id=" + id + ", numero=" + numero + ", solde=" + solde + "]";
		}
	  
}
