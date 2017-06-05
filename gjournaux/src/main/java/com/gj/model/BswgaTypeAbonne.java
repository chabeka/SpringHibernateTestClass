package com.gj.model;

// Generated 4 mars 2014 09:23:20 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;


/**
 * BswgaTypeAbonne generated by hbm2java
 */
public class BswgaTypeAbonne   {

	private Integer idTypeAbonne;
	private BswJournal bswJournal;
	private String nom;
	private boolean defaut;
	private Set<BswgaJournalHasAbonne> bswgaJournalHasAbonnes = new HashSet<BswgaJournalHasAbonne>(
			0);

	public BswgaTypeAbonne() {
	}

	public BswgaTypeAbonne(boolean defaut) {
		this.defaut = defaut;
	}

	public BswgaTypeAbonne(BswJournal bswJournal, String nom, boolean defaut,
			Set<BswgaJournalHasAbonne> bswgaJournalHasAbonnes) {
		this.bswJournal = bswJournal;
		this.nom = nom;
		this.defaut = defaut;
		this.bswgaJournalHasAbonnes = bswgaJournalHasAbonnes;
	}

	public Integer getIdTypeAbonne() {
		return this.idTypeAbonne;
	}

	public void setIdTypeAbonne(Integer idTypeAbonne) {
		this.idTypeAbonne = idTypeAbonne;
	}

	public BswJournal getBswJournal() {
		return this.bswJournal;
	}

	public void setBswJournal(BswJournal bswJournal) {
		this.bswJournal = bswJournal;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public boolean isDefaut() {
		return this.defaut;
	}

	public void setDefaut(boolean defaut) {
		this.defaut = defaut;
	}

	public Set<BswgaJournalHasAbonne> getBswgaJournalHasAbonnes() {
		return this.bswgaJournalHasAbonnes;
	}

	public void setBswgaJournalHasAbonnes(
			Set<BswgaJournalHasAbonne> bswgaJournalHasAbonnes) {
		this.bswgaJournalHasAbonnes = bswgaJournalHasAbonnes;
	}

}
