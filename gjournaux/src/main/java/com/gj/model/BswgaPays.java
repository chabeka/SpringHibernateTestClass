package com.gj.model;

// Generated 4 mars 2014 09:23:20 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;


/**
 * BswgaPays generated by hbm2java
 */
public class BswgaPays  {

	private Integer idPays;
	private String libelle;
	private int cog;
	private String iso2;
	private Set<BswgaCoordonnee> bswgaCoordonnees = new HashSet<BswgaCoordonnee>(
			0);

	public BswgaPays() {
	}

	public BswgaPays(int cog, String iso2) {
		this.cog = cog;
		this.iso2 = iso2;
	}

	public BswgaPays(String libelle, int cog, String iso2,
			Set<BswgaCoordonnee> bswgaCoordonnees) {
		this.libelle = libelle;
		this.cog = cog;
		this.iso2 = iso2;
		this.bswgaCoordonnees = bswgaCoordonnees;
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

	public int getCog() {
		return this.cog;
	}

	public void setCog(int cog) {
		this.cog = cog;
	}

	public String getIso2() {
		return this.iso2;
	}

	public void setIso2(String iso2) {
		this.iso2 = iso2;
	}

	public Set<BswgaCoordonnee> getBswgaCoordonnees() {
		return this.bswgaCoordonnees;
	}

	public void setBswgaCoordonnees(Set<BswgaCoordonnee> bswgaCoordonnees) {
		this.bswgaCoordonnees = bswgaCoordonnees;
	}

}
