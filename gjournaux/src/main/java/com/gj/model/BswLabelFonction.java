package com.gj.model;

// Generated 4 mars 2014 09:23:20 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;


/**
 * BswLabelFonction generated by hbm2java
 */
public class BswLabelFonction   {

	private Integer idLabelFonction;
	private Integer idPortalEntity;
	private String nomMasculin;
	private String nomFeminin;
	private String nomMasculinPluriel;
	private String nomFemininPluriel;
	private String description;
	private Boolean systeme;
	private Set<BswFonction> bswFonctions = new HashSet<BswFonction>(0);

	public BswLabelFonction() {
	}

	public BswLabelFonction(Integer idPortalEntity, String nomMasculin,
			String nomFeminin, String nomMasculinPluriel,
			String nomFemininPluriel, String description, Boolean systeme,
			Set<BswFonction> bswFonctions) {
		this.idPortalEntity = idPortalEntity;
		this.nomMasculin = nomMasculin;
		this.nomFeminin = nomFeminin;
		this.nomMasculinPluriel = nomMasculinPluriel;
		this.nomFemininPluriel = nomFemininPluriel;
		this.description = description;
		this.systeme = systeme;
		this.bswFonctions = bswFonctions;
	}

	public Integer getIdLabelFonction() {
		return this.idLabelFonction;
	}

	public void setIdLabelFonction(Integer idLabelFonction) {
		this.idLabelFonction = idLabelFonction;
	}

	public Integer getIdPortalEntity() {
		return this.idPortalEntity;
	}

	public void setIdPortalEntity(Integer idPortalEntity) {
		this.idPortalEntity = idPortalEntity;
	}

	public String getNomMasculin() {
		return this.nomMasculin;
	}

	public void setNomMasculin(String nomMasculin) {
		this.nomMasculin = nomMasculin;
	}

	public String getNomFeminin() {
		return this.nomFeminin;
	}

	public void setNomFeminin(String nomFeminin) {
		this.nomFeminin = nomFeminin;
	}

	public String getNomMasculinPluriel() {
		return this.nomMasculinPluriel;
	}

	public void setNomMasculinPluriel(String nomMasculinPluriel) {
		this.nomMasculinPluriel = nomMasculinPluriel;
	}

	public String getNomFemininPluriel() {
		return this.nomFemininPluriel;
	}

	public void setNomFemininPluriel(String nomFemininPluriel) {
		this.nomFemininPluriel = nomFemininPluriel;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getSysteme() {
		return this.systeme;
	}

	public void setSysteme(Boolean systeme) {
		this.systeme = systeme;
	}

	public Set<BswFonction> getBswFonctions() {
		return this.bswFonctions;
	}

	public void setBswFonctions(Set<BswFonction> bswFonctions) {
		this.bswFonctions = bswFonctions;
	}

}
