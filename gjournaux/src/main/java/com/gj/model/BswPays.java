package com.gj.model;

// Generated 4 mars 2014 09:23:20 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;


/**
 * BswPays generated by hbm2java
 */
public class BswPays   {

	private Integer idPays;
	private String libelle;
	private Set<BswCoordonnee> bswCoordonnees = new HashSet<BswCoordonnee>(0);

	public BswPays() {
	}

	public BswPays(String libelle, Set<BswCoordonnee> bswCoordonnees) {
		this.libelle = libelle;
		this.bswCoordonnees = bswCoordonnees;
	}

	public Integer getIdPays() {
		return this.idPays;
	}

	public void setIdPays(Integer idPays) {
		this.idPays = idPays;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Set<BswCoordonnee> getBswCoordonnees() {
		return this.bswCoordonnees;
	}

	public void setBswCoordonnees(Set<BswCoordonnee> bswCoordonnees) {
		this.bswCoordonnees = bswCoordonnees;
	}

}
