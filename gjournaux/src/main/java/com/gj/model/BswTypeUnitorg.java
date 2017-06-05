package com.gj.model;

// Generated 4 mars 2014 09:23:20 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonView;

import java.io.Serializable;

/**
 * BswTypeUnitorg generated by hbm2java
 */
public class BswTypeUnitorg implements Serializable {

	@JsonView
	private Integer idTypeUnitorg;
	@JsonView
	private String libelle;
	@JsonView
	private String description;
	@JsonView
	private Boolean systeme;
	@JsonIgnore
	private Set<BswUnitorg> bswUnitorgs = new HashSet<BswUnitorg>(0);

	public BswTypeUnitorg() {
	}

	public BswTypeUnitorg(String libelle, String description, Boolean systeme,
			Set<BswUnitorg> bswUnitorgs) {
		this.libelle = libelle;
		this.description = description;
		this.systeme = systeme;
		this.bswUnitorgs = bswUnitorgs;
	}

	public Integer getIdTypeUnitorg() {
		return this.idTypeUnitorg;
	}

	public void setIdTypeUnitorg(Integer idTypeUnitorg) {
		this.idTypeUnitorg = idTypeUnitorg;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
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

	public Set<BswUnitorg> getBswUnitorgs() {
		return this.bswUnitorgs;
	}

	public void setBswUnitorgs(Set<BswUnitorg> bswUnitorgs) {
		this.bswUnitorgs = bswUnitorgs;
	}

}